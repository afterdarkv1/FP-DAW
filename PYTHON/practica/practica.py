""" Se denominan números amigos a dos números naturales diferentes relacionados de tal
manera que la suma de los divisores propios de cada uno es igual al otro número.
Un divisor propio de un número es un factor positivo de ese número que no sea el propio
número. Por ejemplo, los divisores propios de 6 son 1, 2 y 3, pero no 6.
El par más pequeño de números amigos es (220, 284), y son amigos porque los divisores
propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, de los cuales la suma es 284; y los
divisores propios de 284 son 1, 2, 4, 71 y 142, de los cuales la suma es 220
Los primeros diez pares de números amigos son: (220, 284), (1184, 1210), (2620, 2924),
(5020, 5564), (6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416), (63020,
76084) y (66928, 66992)
Escribe una función que reciba dos números y devuelva un valor booleano que nos diga si
son amgos o no"""

def es_amigos(n1, n2):
    suman1=0
    suman2=0
    for i in range(1, n1):
        if n1 % i == 0:
            suman1 += i

    for j in range(1, n2):
        if n2 % j == 0:
            suman2 += j
    if suman1 == n2 and suman2 == n1:
        return True
    else:
        return False


print( es_amigos(220, 284))


""". Un número perfecto es un número entero positivo que es igual a la suma de sus divisores
propios positivos excluyéndose a sí mismo. Dicho de otra forma, un número perfecto es
aquel que es amigo de sí mismo.
Así, 6 es un número perfecto porque sus divisores propios positivos son 1, 2 y 3; y 6 = 1 + 2 +
3. Un divisor propio positivo de un número es un factor positivo de ese número que no sea el
propio número. Por ejemplo, los divisores propios de 6 son 1, 2 y 3, pero no 6. Los siguientes
números perfectos son 28, 496 y 8128.
Escribe una función que reciba un número y nos devuelva un valor booleano diciendo si es
perfecto o no. El número debe de recogerse por teclado y si no es un entero positivo se
debería de informar al usuario y pedir otro hasta que sea correcto. Usa excepciones para ello"""


def es_perfecto():

    numero=0
    while True:
        try:
            numero = int(input("introduce un numero"))
            if numero <= 0:
                raise ValueError("debe de ser positivo")
            else:
                suma = 0
                for i in range(1, numero):
                   if numero % i == 0:
                    suma += i
            if suma == numero:
                return True
            else:
                return False
        except ValueError as e:
            print("error", e)




print(es_perfecto())