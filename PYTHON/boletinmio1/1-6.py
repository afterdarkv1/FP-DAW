# ======================================================================
# EJERCICIO 1  
# Pide 10 números enteros y guárdalos en un array.  
# Después muestra cuántos son pares y cuántos impares.
# ======================================================================

print("EJERCICIO 1 - CONTAR PARES E IMPARES")

numeros = []
for i in range(10):
    n = int(input(f"Introduce el número {i+1}: "))
    numeros.append(n)

pares = sum(1 for x in numeros if x % 2 == 0)
impares = 10 - pares

print("Números introducidos:", numeros)
print("Cantidad de pares:", pares)
print("Cantidad de impares:", impares)
print("\n")


# ======================================================================
# EJERCICIO 2 
# Pide una frase y muestra cuántas vocales tiene en total  
# y cuántas de cada tipo (a,e,i,o,u).
# ======================================================================

print("EJERCICIO 2 - CONTADOR DE VOCALES")

frase = input("Introduce una frase: ").lower()
vocales = "aeiou"
conteo = {v: 0 for v in vocales}

for letra in frase:
    if letra in vocales:
        conteo[letra] += 1

print("Vocales totales:", sum(conteo.values()))
for v in vocales:
    print(f"{v}: {conteo[v]}")
print("\n")


# ======================================================================
# EJERCICIO 3  
# Crea un array de 20 números aleatorios entre 1 y 100.  
# Muestra solo los que sean múltiplos de 3 en orden descendente.
# ======================================================================

import random

print("EJERCICIO 3 - MÚLTIPLOS DE 3")

arr = [random.randint(1, 100) for _ in range(20)]

multiplos_3 = sorted([x for x in arr if x % 3 == 0], reverse=True)

print("Array generado:", arr)
print("Múltiplos de 3 ordenados descendente:", multiplos_3)
print("\n")


# ======================================================================
# EJERCICIO 4  
# Pide una frase y crea una lista con todas las palabras  
# que tengan más de 6 caracteres. Muestra la lista final.
# ======================================================================

print("EJERCICIO 4 - PALABRAS LARGAS")

frase = input("Introduce una frase: ")
palabras = frase.split()

largas = [p for p in palabras if len(p) > 6]

print("Palabras con más de 6 letras:", largas)
print("\n")


# ======================================================================
# EJERCICIO 5  
# Crea un diccionario con nombres de 5 alumnos y sus notas.  
# Muestra la nota media, la nota más alta y quién la tiene.
# ======================================================================

print("EJERCICIO 5 - NOTAS ALUMNOS")

alumnos = {}

for i in range(5):
    nombre = input(f"Nombre del alumno {i+1}: ")
    nota = float(input(f"Nota de {nombre}: "))
    alumnos[nombre] = nota

media = sum(alumnos.values()) / 5
max_nota = max(alumnos.values())
mejores = [n for n, nota in alumnos.items() if nota == max_nota]

print("\nDiccionario de alumnos:", alumnos)
print("Nota media:", round(media, 2))
print("Nota más alta:", max_nota)
print("Alumno(s) con mejor nota:", mejores)
print("\n")


# ======================================================================
# EJERCICIO 6  
# Juego básico: Adivina el número.  
# El programa genera un número del 1 al 50.  
# El usuario tiene 7 intentos e indica si debe subir o bajar.
# ======================================================================

print("EJERCICIO 6 - ADIVINA EL NÚMERO")

secreto = random.randint(1, 50)
intentos = 7

for i in range(1, intentos + 1):
    n = int(input(f"Intento {i}/{intentos}: Adivina el número: "))

    if n == secreto:
        print("¡Correcto! Adivinaste el número.")
        break
    elif n < secreto:
        print("Demasiado bajo, sube.")
    else:
        print("Demasiado alto, baja.")

if n != secreto:
    print("Sin intentos. El número era:", secreto)