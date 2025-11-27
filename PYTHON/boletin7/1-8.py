# ======================================================================
# EJERCICIO 1
# Calculadora con switch (simulado con match-case en Python)
# ======================================================================

print("EJERCICIO 1 - CALCULADORA BÁSICA")

num1 = float(input("Introduce el primer número: "))
num2 = float(input("Introduce el segundo número: "))
op = input("Operación (S=suma, R=resta, M=multiplicación, D=división): ").upper()

# match emula el switch/case
match op:
    case "S":
        print("Resultado:", num1 + num2)
    case "R":
        print("Resultado:", num1 - num2)
    case "M":
        print("Resultado:", num1 * num2)
    case "D":
        if num2 != 0:
            print("Resultado:", num1 / num2)
        else:
            print("Error: no se puede dividir entre 0")
    case _:
        print("Operación no válida")

print("\n")


# ======================================================================
# EJERCICIO 2
# Operaciones adicionales (raíz cuadrada, cuadrado y cubo)
# ======================================================================

import math

print("EJERCICIO 2 - OPERACIONES AVANZADAS")

num = float(input("Introduce un número: "))
op2 = input("Operación (R=raíz, C=cuadrado, B=cubo): ").upper()

match op2:
    case "R":
        print("Raíz cuadrada:", math.sqrt(num))
    case "C":
        print("Cuadrado:", num ** 2)
    case "B":
        print("Cubo:", num ** 3)
    case _:
        print("Operación no válida")

print("\n")


# ======================================================================
# EJERCICIO 3
# Número del mes a partir del 1 al 12
# ======================================================================

print("EJERCICIO 3 - NOMBRE DEL MES")

meses = [
    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
]

num_mes = int(input("Introduce un número del 1 al 12: "))

if 1 <= num_mes <= 12:
    print("El mes es:", meses[num_mes - 1])
else:
    print("Error: número fuera de rango")

print("\n")


# ======================================================================
# EJERCICIO 4
# Nota a calificación
# ======================================================================

print("EJERCICIO 4 - CALIFICACIÓN SEGÚN NOTA")

nota = int(input("Introduce una nota (1-10): "))

if nota in (1, 2):
    print("Muy deficiente")
elif nota in (3, 4):
    print("Insuficiente")
elif nota == 5:
    print("Suficiente")
elif nota == 6:
    print("Bien")
elif nota in (7, 8):
    print("Notable")
elif nota in (9, 10):
    print("Sobresaliente")
else:
    print("Nota no válida")

print("\n")


# ======================================================================
# EJERCICIO 5
# Array con aleatorios → máximo, mínimo y media
# ======================================================================

import random

print("EJERCICIO 5 - ARRAY ALEATORIO (MAX, MIN, MEDIA)")

n = int(input("Introduce el tamaño del array: "))
arr = [random.randint(10, 1000) for _ in range(n)]

maximo = max(arr)
minimo = min(arr)
media = sum(arr) / len(arr)

print("Array generado:", arr)
print("Máximo:", maximo)
print("Mínimo:", minimo)
print("Media:", round(media, 2))

print("\n")


# ======================================================================
# EJERCICIO 6
# Indicar posiciones de máximo y mínimo
# ======================================================================

print("EJERCICIO 6 - POSICIONES DE MAX Y MIN")

maximo = max(arr)
minimo = min(arr)

pos_max = [i for i, v in enumerate(arr) if v == maximo]
pos_min = [i for i, v in enumerate(arr) if v == minimo]

print("Máximo:", maximo, "posición(es):", pos_max)
print("Mínimo:", minimo, "posición(es):", pos_min)

print("\n")


# ======================================================================
# EJERCICIO 7
# Recuperar un valor del array por posición
# ======================================================================

print("EJERCICIO 7 - RECUPERAR VALOR DEL ARRAY")

pos = int(input("Introduce la posición a consultar: "))

if 0 <= pos < len(arr):
    print("El valor en la posición", pos, "es:", arr[pos])
else:
    print("Error: la posición no existe")

print("\n")


# ======================================================================
# EJERCICIO 8 (FORMATO EXAMEN)
# Buscaminas: tablero NxN con minas aleatorias
# ======================================================================

print("EJERCICIO 8 - BUSCAMINAS")

# Pedir tamaño del tablero
tamaño = int(input("Introduce el tamaño del tablero (n para tablero n x n): "))
minas = int(input("Introduce el número de minas: "))

# Comprobar que las minas caben
if minas > tamaño * tamaño:
    print("ERROR: No puede haber más minas que casillas.")
else:
    # Crear tablero vacío
    tablero = [[0 for _ in range(tamaño)] for _ in range(tamaño)]

    # Colocar minas aleatoriamente
    posiciones_ocupadas = set()

    while len(posiciones_ocupadas) < minas:
        f = random.randint(0, tamaño - 1)
        c = random.randint(0, tamaño - 1)
        posiciones_ocupadas.add((f, c))

    for (f, c) in posiciones_ocupadas:
        tablero[f][c] = 1

    # Mostrar tablero
    print("TABLERO GENERADO:")
    for fila in tablero:
        print(*fila)