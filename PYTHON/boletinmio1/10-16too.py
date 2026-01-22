# =================================================
# PROBLEMA 1 – Calcular el área de figuras
# =================================================

def area_cuadrado(lado):
    return lado ** 2

def area_rectangulo(base, altura):
    return base * altura

def area_triangulo(base, altura):
    return (base * altura) / 2

# Función modular que usa las anteriores
def calcular_area():
    figura = input("Introduce figura (cuadrado, rectangulo, triangulo): ").lower()
    if figura == "cuadrado":
        lado = float(input("Introduce lado: "))
        print("Área:", area_cuadrado(lado))
    elif figura == "rectangulo":
        base = float(input("Introduce base: "))
        altura = float(input("Introduce altura: "))
        print("Área:", area_rectangulo(base, altura))
    elif figura == "triangulo":
        base = float(input("Introduce base: "))
        altura = float(input("Introduce altura: "))
        print("Área:", area_triangulo(base, altura))
    else:
        print("Figura no reconocida")

# =================================================
# PROBLEMA 2 – Conversión de temperaturas
# =================================================

def celsius_a_fahrenheit(c):
    return (c * 9/5) + 32

def fahrenheit_a_celsius(f):
    return (f - 32) * 5/9

def convertir_temperatura():
    tipo = input("Convertir de (C/F): ").upper()
    valor = float(input("Introduce el valor: "))
    if tipo == "C":
        print(f"{valor}°C → {celsius_a_fahrenheit(valor):.2f}°F")
    elif tipo == "F":
        print(f"{valor}°F → {fahrenheit_a_celsius(valor):.2f}°C")
    else:
        print("Tipo no válido")

# =================================================
# PROBLEMA 3 – Números primos
# =================================================

def es_primo(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

def primos_hasta(n):
    return [i for i in range(2, n+1) if es_primo(i)]

# =================================================
# PROBLEMA 4 – Factorial y combinaciones
# =================================================

def factorial(n):
    if n < 0:
        return -1
    if n == 0:
        return 1
    return n * factorial(n-1)

def combinacion(n, k):
    if k > n or n < 0 or k < 0:
        return -1
    return factorial(n) // (factorial(k) * factorial(n-k))

# =================================================
# PROBLEMA 5 – Calculadora modular
# =================================================

def sumar(a, b):
    return a + b

def restar(a, b):
    return a - b

def multiplicar(a, b):
    return a * b

def dividir(a, b):
    if b == 0:
        return "Error: división por cero"
    return a / b

def calculadora():
    a = float(input("Primer número: "))
    b = float(input("Segundo número: "))
    op = input("Operación (+, -, *, /): ")
    if op == "+":
        print(sumar(a, b))
    elif op == "-":
        print(restar(a, b))
    elif op == "*":
        print(multiplicar(a, b))
    elif op == "/":
        print(dividir(a, b))
    else:
        print("Operación no válida")

# =================================================
# PROBLEMA 6 – Validación de emails
# =================================================

import re

def es_email_valido(email):
    patron = r"^[\w\.-]+@[\w\.-]+\.\w+$"
    return bool(re.fullmatch(patron, email))

def validar_emails(*emails):
    for e in emails:
        if es_email_valido(e):
            print(e, "es válido")
        else:
            print(e, "no es válido")

# =================================================
# PROBLEMA 7 – Contar vocales y consonantes
# =================================================

def contar_vocales(cadena):
    return sum(1 for x in cadena.lower() if x in "aeiou")

def contar_consonantes(cadena):
    return sum(1 for x in cadena.lower() if x.isalpha() and x not in "aeiou")

def analizar_cadena(cadena):
    print("Vocales:", contar_vocales(cadena))
    print("Consonantes:", contar_consonantes(cadena))

# =================================================
# PROBLEMA 8 – Número par o impar
# =================================================

def es_par(n):
    return n % 2 == 0

def analizar_paridad(n):
    if es_par(n):
        print(n, "es par")
    else:
        print(n, "es impar")

# =================================================
# PROBLEMA 9 – Generador de lista cuadrada
# =================================================

def lista_cuadrados(n):
    return [i**2 for i in range(1, n+1)]

# =================================================
# PROBLEMA 10 – Juego modular "adivina el número"
# =================================================

def generar_numero():
    return random.randint(1, 50)

def pedir_intento():
    return int(input("Adivina el número (1-50): "))

def comprobar_numero(secreto, intento):
    if intento < secreto:
        return "mayor"
    elif intento > secreto:
        return "menor"
    else:
        return "igual"

def jugar_adivinanza():
    secreto = generar_numero()
    intentos = 0
    while True:
        try:
            intento = pedir_intento()
            intentos += 1
            resultado = comprobar_numero(secreto, intento)
            print("El número es", resultado)
            if resultado == "igual":
                print("¡Correcto! Intentos:", intentos)
                break
        except ValueError:
            print("Introduce un número válido")
