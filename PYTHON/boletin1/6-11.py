""" 6 Escribir un programa que pida por teclado un número al usuario y diga si es divisible por 3 o
no."""
import random
from itertools import count

num = int(input("ingresa un numero: "))
if num % 3 == 0: print(num,"es divisible entre 3")
else: print(num,"no divisible entre 3")

""" 7 Escribir un programa que pida un número por teclado al usuario que simule ser el precio de
un artículo y escriba el resultado de aplicarle el IVA del 21%
"""
precio = int(input("ingresa un precio del articulo: "))
print("el precio del articulo con iva es", precio*1.21)


""" 8 Escribir un programa que reciba por teclado el importe de una cantidad a pagar en euros
(puede tener decimales) y el número de meses que contamos para pagarla (tiene que ser un
número entero) y nos devuelva el dinero que tendríamos que pagar cada mes. No aplicamos
intereses de ningún tipo y redondeamos a dos decimales"""


importe = float(input("Introduce el importe total en euros: "))
meses = int(input("Introduce el número de meses para pagar: "))


cuota_mensual = round(importe / meses, 2)

print("Deberás pagar",cuota_mensual," euros cada mes durante",meses, "meses.")

""" 9 Escribir un programa que genere un número aleatorio entre el 0 y el 50 y lo muestre"""

dado = random.randint(0,50)
print(dado)


""".9 y 11 Escribir un programa que genere dos números aleatorios simultáneamente entre el 1 y el 6
(simulando una tirada de dos dados)"""
"""Modificar el programa anterior para que tu programa tire dos dados de forma continuada
hasta que el número que salga en ambos sea el mismo. En ese momento debería de parar la
ejecución e informarnos de cuantas tiradas ha tenido que hacer para llegar a ese resultado"""

dado1= 0
dado2= 1
count= 1
while dado1 != dado2:
    dado1 = random.randint(1, 6)
    dado2 = random.randint(1, 6)
    count += 1
    if dado1 == dado2:
        print("haz sacado.",dado1," ",dado2,"en ", count, "tiradas")

