
fila = int(input("Ingrese el numero de fila: "))
columna = int(input("Ingrese el numero de columna: "))
simbolo = input("Ingrese un símbolo: ")

for i in range(fila):
    for j in range(columna):
        print(simbolo, end="")
    print()

telefono = "123-456-789"

for i in telefono:
    if i == "-":
        continue
    print(i, end="")

for i in range(1, 21):
    if i == 13:
        pass
    else:
        print(i)
