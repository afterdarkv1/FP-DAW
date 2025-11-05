import random

patrones_por_linea = 5
lineas = 5

for _ in range(lineas):
    for j in range(patrones_por_linea):
        for i in range(5):
            print(random.randint(0, 9), end="")

        if j < patrones_por_linea - 1:
            print(" -", end=" ")
        else:
            print(end=" ")
    print() 