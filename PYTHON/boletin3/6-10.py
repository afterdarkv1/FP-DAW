""" 6 Escribir un programa que pida por teclado una cadena de texto y la separe en dos
distintas. En la primera de ellas estarían las letras que ocupan una posición par y en la
segunda las que ocupan una posición impar. Por ejemplo, si el usuario escribe Hola
Mundo la primera cadena sería Hl ud y la segunda oaMno"""



# Pedir al usuario una cadena de texto
texto = input("Escribe una cadena de texto: ")

# Inicializar las dos cadenas
pares = ""
impares = ""

# Recorrer el texto por posición
for i in range(len(texto)):
    if i % 2 == 0:
        pares += texto[i]
    else:
        impares += texto[i]

# Mostrar los resultados
print("Letras en posición par:", pares)
print("Letras en posición impar:", impares)



""" 7 Escribir un programa que pida por teclado una cadena de texto y la escriba con el
alfabeto típico de los hackers sustituyendo las letras a por el número 4, las letras e por
el número 3, las letras i por el número 1 y las letras o por el número 0. Considera que
las vocales pueden estar escritas en mayúsculas o minúsculas, pero no hace falta que
tengas en cuenta que además podrían ir acentuadas"""


# Pedir al usuario una cadena de texto
texto = input("Escribe una cadena de texto: ")

# Reemplazar las letras según el alfabeto hacker
texto_hacker = texto.replace('a', '4').replace('A', '4') \
                    .replace('e', '3').replace('E', '3') \
                    .replace('i', '1').replace('I', '1') \
                    .replace('o', '0').replace('O', '0')

# Mostrar el resultado
print("Texto en alfabeto hacker:", texto_hacker)

""" 8 Escribir un programa que reciba una cadena de texto por teclado y la muestre sin
vocales. Por ejemplo, si recibe la cadena “Hola Mundo” debería de devolver “Hl Mnd”"""
# Pedir al usuario una cadena de texto
texto = input("Escribe una cadena de texto: ")

# Definir las vocales que queremos eliminar
vocales = "aeiouAEIOU"

# Crear una nueva cadena sin las vocales
sin_vocales = ""
for letra in texto:
    if letra not in vocales:
        sin_vocales += letra

# Mostrar el resultado
print("Texto sin vocales:", sin_vocales)


""" 9 Escribir un programa que nos pida elegir entre cuatro destinos turísticos (Francia,
Italia, Chile o Japón) y dependiendo de nuestra respuesta nos diga cual es la capital de
nuestro destino (París, Roma, Santiago de Chile o Tokio)"""

# Mostrar las opciones al usuario
print("Elige un destino turístico:")
print("1. Francia")
print("2. Italia")
print("3. Chile")
print("4. Japón")

# Pedir la elección
destino = input("Escribe el nombre del país que elijas: ")

# Determinar la capital según el destino
if destino.lower() == "francia":
    capital = "París"
elif destino.lower() == "italia":
    capital = "Roma"
elif destino.lower() == "chile":
    capital = "Santiago de Chile"
elif destino.lower() == "japón" or destino.lower() == "japon":
    capital = "Tokio"
else:
    capital = None

# Mostrar el resultado
if capital:
    print(f"La capital de {destino.capitalize()} es {capital}.")
else:
    print("Ese destino no está en la lista.")


""" 10-11-14 Escribe un programa que valide si un NIF español introducido por teclado es correcto.
La longitud exacta de la cadena ha de ser de 9 caractéres. Los ocho primeros han de
ser números comprendidos entre el 0 y el 9 y el último una letra que puede estar
escrita en mayúsculas o minúsculas.
"""
""". Mejorar el programa anterior para que detecte si se trata de un NIF o un NIE y nos
comunique, además de si es válido de que tipo es."""

# Tabla oficial de letras NIF/NIE
letras = "TRWAGMYFPDXBNJZSQVHLCKE"

# Pedir el documento al usuario
doc = input("Introduce tu NIF o NIE: ").upper()

# Validar longitud
if len(doc) != 9:
    print("❌ El documento debe tener exactamente 9 caracteres.")
else:
    # Si empieza por letra, puede ser un NIE
    if doc[0] in "XYZ":
        tipo = "NIE"
        # Reemplazar la letra inicial por su valor numérico equivalente
        reemplazos = {'X': '0', 'Y': '1', 'Z': '2'}
        numeros = reemplazos[doc[0]] + doc[1:8]
    else:
        tipo = "NIF"
        numeros = doc[:8]

    letra_final = doc[8]

    # Validar que la parte numérica tenga solo dígitos
    if numeros.isdigit() and letra_final.isalpha():
        # Calcular la letra correcta
        letra_correcta = letras[int(numeros) % 23]
        if letra_final == letra_correcta:
            print(f"✅ El {tipo} {doc} es válido.")
        else:
            print(f"❌ El {tipo} no es válido. La letra debería ser '{letra_correcta}'.")
    else:
        print("❌ Formato incorrecto. Los primeros 8 caracteres deben ser números (o NIE válido) y el último una letra.")



