import random
numeroTiradas = int(input("cuantos dados vas a tirar: "))
contUno = 0
contSeis = 0
suma = 0
print(f"haz tirado {numeroTiradas} dados y a salido lo siguiente:")
for i in range(numeroTiradas):
    n = random.randint(0, 7)

    print(n)
    if i == 1:
        contUno += 1
    elif i == 6:
        contSeis += 1

    suma = suma +n
    

    print()
max = numeroTiradas * 6
media = max / 2



print(f"en {numeroTiradas} tiradas ha salido un uno {contUno} veces")
print(f"en {numeroTiradas} tiradas ha salido un  seis {contSeis} veces")
print(f"la suma de todos los dado da: {suma}")
if media > suma:
    print("tu tirada esta por debajo de la media")
elif media < suma:
    print("tu tirada esta por encima de la media")


