
"""ejercicio planteado en la pizarra, dar la vuelta al array y formatearla"""
"""def formatoClientes(a):
    for clave, valor in reversed(list(clientes.items())):
        apellido, nombre = clave.split(",")
        print(f"{nombre} {apellido} ({valor})")

formatoClientes(clientes)
"""
"""
def formatoClientes(clientes):
    for clave, valor in reversed(clientes.items()):
        clave = clave.split(",")
        claveFormateada = f"{clave[1] + ' ' + clave[0] }"
        valorFormateada = f"{'(' + str(valor) + ')'}"
        print(claveFormateada, valorFormateada )
"""








"""1   Crear un programa o una función que reciba un diccionario con los datos de los clientes de una tienda
y su edad y los muestre por consola ordenados por nombre de pila. El diccionario, ya creado en el
código de tu programa, tendrá esta forma"""
"""strip quita el espacio"""
""" a la lambda le pasa el criterio con el que quieres ordenar osea x que es clientes.item, y luego le decimos que de la pocicion 0 que es el nombre con apellido todo el nombre como parametro para ordenar que es al hacer el spplit es x[]"""

clientes = { "Chuletón, José": 35, "Tosidad, Rubén": 27, "Rupto, Francisco": 44, "Cotón, Carmelo": 56 }
print()
def formatoClientes2(b):
    for clave, valor in sorted(b.items(), key=lambda x: x[0].split(", ")[1]):
        apellido, nombre = clave.split(", ")
        print(f"{nombre} {apellido} ({valor})")

formatoClientes2(clientes)

print()
def nuevoCliente(clientes, nombre, apellido, edad):
    clave = f"{apellido}, {nombre}"

    if clave in clientes:
        print("El cliente ya existe.")
        respuesta = input("¿Quieres sobrescribir la edad? (s/n): ")

        if respuesta.lower() == "s":
            clientes.update({clave: edad})
            print("Edad actualizada correctamente.")
        else:
            print("No se realizaron cambios.")
    else:
        clientes.update({clave: edad})
        print("Cliente añadido correctamente.")


nuevoCliente(clientes, "Felipe", "Lotas", 76)
print()
formatoClientes2(clientes)


print()


def cumpleCliente(clientes, nombre, apellido):
    clave = f"{apellido}, {nombre}"

    if clave in clientes:
        clientes[clave] += 1
        print(f"{nombre} {apellido} ahora tiene {clientes[clave]} años.")
    else:
        print("El cliente no existe.")

""" 2    Escribir un programa que reciba un texto y devuelva un diccionario o una estructura similar donde las
palabras del texto serán las claves y el número de veces que aparece cada una de ellas su valor.
Considera que la frase que introducimos no tiene signos de puntuación, que el único separador entre
palabras son los espacios y no tengas en cuenta las tildes ni mayúsculas. Es decir: “qué” se
considera una palabra diferente de “que” y “Como” es distinta de “como”.
El texto debe de introducirse desde el teclado
"""
texto = input("Introduce tu texto: ")

palabras = texto.split()

diccionario = {}

for palabra in palabras:
    if palabra in diccionario:
        diccionario[palabra] += 1
    else:
        diccionario[palabra] = 1

print("Diccionario:", diccionario)


"""3        Escribir un programa que guarde en un diccionario los precios de las frutas de la siguiente tabla:
Fruta Precio (€/Kg)
Aguacate 4.35
Mandarina 2.60
Kiwi 3.75
Naranja 1.80
NOTA: El diccionario debes de crearlo en el código del programa con los datos listados en la tabla
Tú programa debe de preguntar al usuario por una fruta y un número de kilos y mostrar por pantalla el
precio de ese número de kilos de fruta con dos decimales. El número de kilos debe de admitir
decimales. Si la fruta no está en el diccionario debe mostrar un mensaje informando de ello. Captura
las posibles excepciones.
El programa finalizará cuando se escriba la palabra fin (de forma insensible a mayúsculas y/o
minúsuculas)
EJEMPLO DE EJECUCIÓN:
¿Qué fruta quieres comprar? Sandía
Lo siento mucho pero no vendemos esa fruta
¿Qué fruta quieres comprar? Kiwi
¿Cuantos kilos quieres? ff
No has introducido bien la cantidad que quieres
¿Qué fruta quieres comprar? Mandarina
¿Cuantos kilos quieres? 4.75
4.75 de Mandarina cuestan 12.35 €
¿Qué fruta quieres comprar? fin

"""
"""Cuando usas in directamente sobre un diccionario, Python solo comprueba las CLAVES, nunca los valores."""
"""if 3.75 in frutas.values(): 
    print("Ese precio existe") esto es en caso de que quiera solo el valor y items es para todo"""
frutas = {
    "Aguacate": 4.35,
    "Mandarina": 2.60,
    "Kiwi": 3.75,
    "Naranja": 1.80
}

while True:
    fruta = input("¿Qué fruta quieres comprar? ")

    if fruta.lower() == "fin":
        break

    if fruta not in frutas:
        print("Lo siento mucho pero no vendemos esa fruta")
        continue

    try:
        kilos = float(input("¿Cuantos kilos quieres? "))
        precio_total = kilos * frutas[fruta]
        print(f"{kilos:.2f} de {fruta} cuestan {precio_total:.2f} €")
    except ValueError:
        print("No has introducido bien la cantidad que quieres")