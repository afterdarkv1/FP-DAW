# ======================================================================
# Ejercicio 1
# Generar seis números aleatorios entre 1 y 49 sin repetir (lotería)
# ======================================================================

import random
from collections import Counter

print("EJERCICIO 1")
numeros_loteria = random.sample(range(1, 50), 6)   # sample evita repetidos
print("Números generados:", numeros_loteria)
print("\n")


# ======================================================================
# Ejercicio 2
# Calcular todos los divisores comunes entre dos números
# ======================================================================

print("EJERCICIO 2")
n1 = int(input("Introduce el primer número: "))
n2 = int(input("Introduce el segundo número: "))

divisores = []

# Recorremos hasta el menor para optimizar
for i in range(1, min(n1, n2) + 1):
    if n1 % i == 0 and n2 % i == 0:   # Si divide a ambos es divisor común
        divisores.append(i)

print("Los divisores comunes son:", divisores)
print("\n")


# ======================================================================
# Ejercicio 3
# Contar palabras en una frase ignorando espacios múltiples
# ======================================================================

print("EJERCICIO 3")
frase = input("Introduce una frase: ")

# split() elimina espacios extra automáticamente
palabras = frase.split()
print("Cantidad de palabras:", len(palabras))
print("\n")


# ======================================================================
# Ejercicio 4
# Contar palabras con cuatro o más vocales diferentes
# ======================================================================

print("EJERCICIO 4")
frase = input("Introduce una frase: ")

vocales = set("aeiou")
contador_palabras = 0

for palabra in frase.split():
    letras = set(palabra.lower())              # Convertir a minúsculas y a conjunto
    vocales_en_palabra = letras.intersection(vocales)  # Vocales que contiene
    if len(vocales_en_palabra) >= 4:
        contador_palabras += 1

print("Número de palabras con 4 o más vocales diferentes:", contador_palabras)
print("\n")


# ======================================================================
# Ejercicio 5
# Generar 100 números aleatorios entre 1 y 50, obtener mayor, menor y más repetido
# ======================================================================

print("EJERCICIO 5")
numeros = [random.randint(1, 50) for _ in range(100)]  # Generar 100 números

mayor = max(numeros)
menor = min(numeros)

frecuencias = Counter(numeros)          # Contamos repeticiones
mas_repetido, repeticiones = frecuencias.most_common(1)[0]

print("Mayor:", mayor)
print("Menor:", menor)
print("Número más repetido:", mas_repetido, "aparece", repeticiones, "veces")
print("\n")


# ======================================================================
# Ejercicio 6 (Formato examen)
# Contar cuántas veces aparece cada cifra en un número
# ======================================================================

print("EJERCICIO 6")
numero = input("Introduce un número: ")

conteo = {}

# Recorremos cada carácter y contamos solo dígitos
for cifra in numero:
    if cifra.isdigit():
        conteo[cifra] = conteo.get(cifra, 0) + 1

print("Tu número tiene:\n")

# Mostramos las cifras en orden descendente (como en el ejemplo)
for cifra in sorted(conteo.keys(), reverse=True):
    cantidad = conteo[cifra]
   
    # Cambiar singular/plural
    if cantidad == 1:
        print(f"{cantidad} número {cifra}")
    else:
        print(f"{cantidad} números {cifra}")