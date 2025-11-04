""" 22 Escribir un programa que genere un número primo aleatorio entre el 10.000.000 y el
50.000.000
"""

import random
import math

def es_primo(n):
    if n < 2:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):  # Solo impares
        if n % i == 0:
            return False
    return True

while True:
    numero = random.randint(10_000_000, 50_000_000)
    if es_primo(numero):
        print("Número primo encontrado:", numero)
        break
""" 23 Escribir un programa que te escriba todos los números primos que hay entre el 1 y el 100
"""

import math

def es_primo(n):
    if n < 2:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):  # Solo impares
        if n % i == 0:
            return False
    return True


print("Números primos entre 1 y 100:")

for numero in range(1, 101):
    if es_primo(numero):
        print(numero, end=" ")


""" 24 Modifica el programa anterior para que sea el usuario quién introduzca dos números y se nos
muestre los primos que hay entre ambos
"""

import math

def es_primo(n):
    if n < 2:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):  # Solo impares
        if n % i == 0:
            return False
    return True

# Pedir al usuario los límites
inicio = int(input("Introduce el primer número: "))
fin = int(input("Introduce el segundo número: "))

# Asegurar que inicio sea menor que fin
if inicio > fin:
    inicio, fin = fin, inicio

print(f"Números primos entre {inicio} y {fin}:")

for numero in range(inicio, fin + 1):
    if es_primo(numero):
        print(numero, end=" ")



""".25 Escribir un programa que reciba por teclado un número y muestre sucesivamente el
resultado de ir dividiéndolo por dos sucesivamente hasta llegar a un número igual o menor a
1. Caso de ser necesario los resultados se mostrarán con dos decimales. Un ejemplo de una
ejecución correcta después de introducir el número 34 ser´ía esta:
Haz introducido el número 34
17
8.5
4.25
2.12
1.06
0.53
"""
# Pedir un número al usuario
numero = float(input("Introduce un número: "))

print("Has introducido el número", numero)

# Dividir sucesivamente entre 2 hasta llegar a un número menor o igual a 1
while numero > 1:
    numero /= 2
    print(f"{numero:.2f}")
