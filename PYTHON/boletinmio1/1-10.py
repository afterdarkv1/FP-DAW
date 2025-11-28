# ===============================================================
# EJERCICIO 1 — VALIDACIÓN DE USUARIO Y CONTRASEÑA
# ===============================================================

print("EJERCICIO 1 - LOGIN")

user_correcto = "admin"
pass_correcta = "1234"

for intento in range(1, 4):
    u = input("Usuario: ")
    p = input("Contraseña: ")

    if u == user_correcto and p == pass_correcta:
        print("Acceso permitido.")
        break
    else:
        print("Credenciales incorrectas.")

if u != user_correcto or p != pass_correcta:
    print("Has agotado los intentos, acceso denegado.")



# ===============================================================
# EJERCICIO 2 — CONTAR CARACTERES ESPECIALES
# ===============================================================

print("\nEJERCICIO 2 - CARACTERES ESPECIALES")

texto = input("Introduce un texto: ")
especiales = ",.;:!?()[]{}-_/\\\"'"

contador = sum(1 for c in texto if c in especiales)

print("Caracteres especiales encontrados:", contador)



# ===============================================================
# EJERCICIO 3 — CALCULAR MEDIANA
# ===============================================================

print("\nEJERCICIO 3 - MEDIANA")

n = int(input("¿Cuántos números vas a introducir? "))
lista = []

for _ in range(n):
    lista.append(float(input("Número: ")))

lista.sort()

if n % 2 == 1:
    mediana = lista[n // 2]
else:
    mediana = (lista[n//2 - 1] + lista[n//2]) / 2

print("Mediana:", mediana)



# ===============================================================
# EJERCICIO 4 — DICCIONARIO PALABRA:LONGITUD
# ===============================================================

print("\nEJERCICIO 4 - DICCIONARIO DE LONGITUDES")

frase = input("Introduce una frase: ")
palabras = frase.split()

resultado = {p: len(p) for p in palabras}

print("Diccionario resultante:")
print(resultado)



# ===============================================================
# EJERCICIO 5 — MATRIZ 4x4, SUMAS DE FILAS Y COLUMNAS
# ===============================================================

import random

print("\nEJERCICIO 5 - MATRIZ 4x4")

matriz = [[random.randint(1, 20) for _ in range(4)] for _ in range(4)]

print("Matriz generada:")
for fila in matriz:
    print(fila)

suma_filas = [sum(fila) for fila in matriz]
suma_cols = [sum(matriz[f][c] for f in range(4)) for c in range(4)]

print("Suma de filas:", suma_filas)
print("Suma de columnas:", suma_cols)



# ===============================================================
# EJERCICIO 6 — COMPROBAR NÚMERO PALÍNDROMO
# ===============================================================

print("\nEJERCICIO 6 - NÚMERO PALÍNDROMO")

num = input("Introduce un número: ")

if num == num[::-1]:
    print("Es palíndromo")
else:
    print("No es palíndromo")



# ===============================================================
# EJERCICIO 7 — ELEMENTOS REPETIDOS EN UNA LISTA
# ===============================================================

from collections import Counter

print("\nEJERCICIO 7 - ELEMENTOS REPETIDOS")

lista = input("Introduce números separados por espacios: ").split()
lista = [int(x) for x in lista]

contador = Counter(lista)

print("Elementos repetidos:")
for num, cant in contador.items():
    if cant > 1:
        print(f"{num} aparece {cant} veces")



# ===============================================================
# EJERCICIO 8 — CARRITO DE LA COMPRA (DICCIONARIO)
# ===============================================================

print("\nEJERCICIO 8 - CARRITO")

carrito = {}

while True:
    prod = input("Producto (FIN para terminar): ")
    if prod.upper() == "FIN":
        break
    precio = float(input("Precio del producto: "))
    carrito[prod] = precio

total = sum(carrito.values())

print("\nCarrito:", carrito)
print("Total a pagar:", round(total, 2))



# ===============================================================
# EJERCICIO 9 — GENERAR EMAIL AUTOMÁTICO
# ===============================================================

print("\nEJERCICIO 9 - GENERADOR DE EMAIL")

nombre = input("Nombre: ").strip().lower()
apellido = input("Apellido: ").strip().lower()

email = f"{nombre}.{apellido}@empresa.com"

print("Email generado:", email)



# ===============================================================
# EJERCICIO 10 — ANALIZAR SUMAS DE DOS DADOS
# ===============================================================

print("\nEJERCICIO 10 - ANALIZAR DADOS")

conteo = {i: 0 for i in range(2, 13)}

for _ in range(50):
    d1 = random.randint(1, 6)
    d2 = random.randint(1, 6)
    suma = d1 + d2
    conteo[suma] += 1

print("Resultados:")
for suma, veces in conteo.items():
    print(f"Suma {suma}: {veces} veces")
