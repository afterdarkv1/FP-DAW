"1ESCRIBIR UN PROGRAMA DONDE SE INPRIMAN LOS 10 PRIMERO NUMEROS ENTEROS"

i = 1
while i <= 10:
    print(i)
    i=i+1

"2Escribir un programa donde se muestren los 50 primeros números pares"
i = 0
while i <= 50:
    print(i)
    i=i+2
"""3Escribir un programa donde se muestren los 5 primeros números múltiplos 
de uno dado por el usuario (se introducirá por teclado)"""

num = int(input("ingresa un numero: "))
mult= 1
while mult <= 5:
    print(num,"x",mult,"=",num * mult)
    mult += 1

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
