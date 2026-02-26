"""si tuviera un array de diccionario tendira que hacer esto

for diccionario in clientes:
    print("Diccionario invertido:")
    for clave, valor in reversed(list(diccionario.items())):
        print(clave, valor)
    print()"""
clientes={"Potamo, Pepe": 44, "Morales, Jose Maria": 55, "Rosales, Ines": 20}
for clave, valor in reversed(clientes.items()):
    clave = clave.split(",")
    claveFormateada = f"{clave[1] + " " + clave[0] }"
    valorFormateada = f"{"(" + str(valor) + ")"}"
    print(claveFormateada, valorFormateada )



"""si tuviera un array de diccionario tendira que hacer esto

for diccionario in clientes:
    print("Diccionario invertido:")
    for clave, valor in reversed(list(diccionario.items())):
        print(clave, valor)
    print()"""

"""otra foirma de hacerlo pero conservando el diccionario
clientes_invertido = dict(reversed(list(clientes.items())))

print(clientes_invertido)
"""




"""
para volver a ser diccionario
clasificacion = dict(
    sorted(clientes.items(), key=lambda elemento: elemento[1], reverse=True)
)

print(clasificacion)


Si lo que querías era simplemente invertir claves y valores, entonces sería:

clientes_invertido = {valor: clave for clave, valor in clientes.items()}
print(clientes_invertido)

Resultado:

{44: 'Potamo, Pepe', 55: 'Morales, Jose Maria', 20: 'Rosales, Ines'}



clientes_invertido = {valor: clave for clave, valor in clientes.items()}
print(clientes_invertido)

Resultado:

{44: 'Potamo, Pepe', 55: 'Morales, Jose Maria', 20: 'Rosales, Ines'}
"""