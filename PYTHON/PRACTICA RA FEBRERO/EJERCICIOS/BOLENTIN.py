
"""
num = list(num)
print(num)
for i in range(4):
    print()
    digito = int(num[i])
    for j in range(10):
        if(digito == 0 and j == 9):
            print(f"0", end="")
        elif((j+1) == digito):
            print(f"0", end = "")

        else:
            print("x", end = "")
            """
"""
num = int(input("introduce un numero del 1000 al 9999: "))

def contrasena(num):
    num_str = str(num).zfill(4)
    resultado = ""

    for i in range(4):

        linea = ""   # ← importante reiniciar cada línea
        digito = int(num_str[i])

        for j in range(10):
            if digito == 0 and j == 9:
                linea += "O"
            elif j + 1 == digito:
                linea += "O"
            else:
                linea += "X"

        resultado += linea + "\n"   # ← añadimos salto de línea

    return resultado


print(contrasena(num))"""




def linea_pin(digito):
    linea = ""
    for j in range(10):
        if digito == 0 and j == 9:
            linea += "O"
        elif j + 1 == digito:
            linea += "O"
        else:
            linea += "X"
    return linea


def contrasena(num):
    num_str = str(num).zfill(4)
    resultado = []

    for i in range(4):
        digito = int(num_str[i])
        resultado.append(linea_pin(digito))

    return resultado


# Programa principal
num = int(input("Introduce un número del 1000 al 9999: "))

estructura = contrasena(num)

for linea in estructura:
    print(linea)