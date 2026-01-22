
"""4Escribir un programa donde se muestren todos los números divisibles por 7 menores a
10000"""


numero =0
while numero < 10000:
    if numero % 7 == 0:
         print(numero)
    numero += 1



"""5 Escribir un programa que pida por teclado un número al usuario y diga si es par o impar"""
numeroLeido = int(input("ingresa un numero: "))
if numeroLeido % 2 == 0: print("es un numero par")
else: print("es un numero impar")
