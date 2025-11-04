""". 12 y 13 Escribir un programa que sirva como asistente para un juego de rol. Tu programa debería de
pedir por teclado el número de dados que se van a tirar y el número de caras de estos (4, 6,
8, 12, etc.) A continuación debería de hacer la tirada y mostrarla.
Modifica el programa anterior para que no admita dados con un número de caras impares
(¡no existen!). En el caso de meter un número impar de caras el programa debería de
informarnos de que es erróneo y volver a preguntarnos por este dato.
"""
import random

# Pedir el número de dados
num_dados = int(input("¿Cuántos dados quieres tirar? "))

# Pedir el número de caras, verificando que sea par
while True:
    num_caras = int(input("¿De cuántas caras son los dados? "))
    if num_caras % 2 == 0:
        break
    else:
        print("Error: los dados no pueden tener un número impar de caras. Inténtalo de nuevo.\n")

print("\nTirando los dados...\n")

# Hacer la tirada y mostrar los resultados
for i in range(1, num_dados + 1):
    tirada = random.randint(1, num_caras)
    print("Dado", i, ":", tirada)


""" 14-15 Escribir un programa que nos pida dos números por teclado y genere un número aleatorio
comprendido entre ambos. Por el momento no te preocupes de que el primer número
siempre debería de ser menor que el segundo, simplemente no los metas en un orden
incorrecto.
Modificar el programa del punto anterior para que si el primer número que metemos es
mayor que el segundo funcione correctamente. Es decir, si metemos en primer lugar el 50 y
en segundo el 10 nos debería de generar un número aleatorio entre el 10 y el 50 (y no entre el
50 y el 10 que no tiene mucha lógica…)
"""

import random
num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el segundo número: "))

if num1 > num2:
    num1, num2 = num2, num1
aleatorio = random.randint(num1, num2)
print("El número aleatorio entre", num1, "y", num2, "es:", aleatorio)



""" 16 Escribir un programa que genere seis números aleatorios entre el 1 y el 49 (simulando una
lotería primitiva). Por el momento no te preocupes de que algunos números puedan salir
repetidos. Ya resolveremos eso más adelante."""

print("Generando los números de la lotería primitiva...\n")

for i in range(6):
    numero = random.randint(1, 49)
    print("Número", i + 1, ":", numero)
