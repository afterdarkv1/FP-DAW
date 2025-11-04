""" 17 Escribir un programa que nos permita generar una quiniela. Para ello nos debe generar
quince números aleatorios entre el 1 y el 3. Recuerda que los resultados válidos son 1 X o 2,
así que si te sale un 3 lo que tienes que imprimir en pantalla es una X"""

import random

print("Generando quiniela...\n")

# Generar 15 resultados aleatorios entre 1 y 3
for i in range(1, 16):
    resultado = random.randint(1, 3)
    if resultado == 3:
        print("Partido", i, ":", "X")
    else:
        print("Partido", i, ":", resultado)



""".18 Escribe un programa que genere números aleatorios entre el 1 y el 1000 sin parar y que sólo
se detenga cuando salga el 666. Los números que ha tenido que generar tu programa hasta
aparecer el 666 son los que restan para el apocalipsis. Tu programa debería de indicarlo con
un mensaje tétrico (¡Faltan 236 días para que se acabe todo! por ejemplo)
"""
import random

contador = 0

print("Invocando al apocalipsis...\n")

while True:
    numero = random.randint(1, 1000)
    contador += 1
    print("Ha salido el número:", numero)

    if numero == 666:
        print("\n😱 ¡Ha aparecido el 666!")
        print("¡Faltan", contador, "días para que se acabe todo! ☠️")
        break
""" 19 Escribir un programa que pida un número por teclado y nos muestre sus divisores"""
numero = int(input("Introduce un número: "))

print("Los divisores de", numero, "son:")

for i in range(1, numero + 1):
    if numero % i == 0:
        print(i)


""" 20 Escribir un programa que nos pida tres números por teclado en cualquier orden y nos los
muestre en pantalla ordenados de menor a mayor"""""" (reverse=True) SI LO QUIERES AL REVEZ EN EL () DEL SORT"""

num1 = float(input("Introduce el primer número: "))
num2 = float(input("Introduce el segundo número: "))
num3 = float(input("Introduce el tercer número: "))

numeros = [num1, num2, num3]

numeros.sort()
print("Los números ordenados de menor a mayor son:", numeros)


""" 21 Escribir un programa que pida por teclado un número al usuario y calcule si es primo o no"""

# Pedir un número al usuario
numero = int(input("Introduce un número: "))

# Comprobar si es menor que 2
if numero < 2:
    print(numero, "no es primo")
else:
    es_primo = True
    # Comprobar divisores desde 2 hasta la raíz cuadrada del número
    for i in range(2, int(numero ** 0.5) + 1):
        if numero % i == 0:
            es_primo = False
            break

    if es_primo:
        print(numero, "es primo")
    else:
        print(numero, "no es primo")
