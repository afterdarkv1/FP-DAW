
"""
import random

patrones_por_linea = 5
lineas = 5

for _ in range(lineas):
    for j in range(patrones_por_linea):
        for i in range(5):
            print(random.randint(0, 9), end="")

        # Imprimir el guion solo si no es el último patrón
        if j < patrones_por_linea - 1:
            print(" -", end=" ")
        else:
            print(end=" ")
    print()  # Salto de línea al final de cada línea

"""



























import random
numeroDeFilas = 5
numeroDeColumnas = 6

for _ in range(numeroDeColumnas):
    for j  in range(numeroDeFilas):
        for i in range(5):
            print(random.randint(0,9), end="" )

        if j < numeroDeFilas - 1: print(" -", end=" ")
        else: print(end=" ")
    print()
