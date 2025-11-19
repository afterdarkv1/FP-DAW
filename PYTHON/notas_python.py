""" 
split: separar letras
find: buscar
"""

frase = input("Introduce una frase: ")
listaPalabras = frase.split(" ")
print(listaPalabras)

for palabra in listaPalabras:
    contadorVocales = 0
    for letra in palabra:
        if letra.lower() in "aeiou":
            contadorVocales += 1
    print(f"La palabra '{palabra}' tiene {contadorVocales} vocales")
