"""LISTAS (list)"""


lista = [1, 2, 3]


tupla = tuple(lista)
conjunto = set(lista)
diccionario = dict(enumerate(lista))  # índice:valor
"""Convertir a lista desde:"""

lista = list(tupla)
lista = list(conjunto)
lista = list(diccionario)        # solo claves
lista = list(diccionario.values())
"""TUPLAS (tuple)"""


tupla = (1, 2, 3)

lista = list(tupla)
conjunto = set(tupla)
diccionario = dict(enumerate(tupla))

"""Convertir a tupla desde:"""

tupla = tuple(lista)
tupla = tuple(conjunto)
tupla = tuple(diccionario)          # claves
tupla = tuple(diccionario.values())
"""CONJUNTOS (set)"""

conjunto = {1, 2, 3}



"""Conversiones desde conjunto:"""

lista = list(conjunto)
tupla = tuple(conjunto)
diccionario = dict(enumerate(conjunto))

// Convertir a conjunto desde:

conjunto = set(lista)
conjunto = set(tupla)
conjunto = set(diccionario)  # claves únicas
"""DICCIONARIOS (dict)"""

diccionario = {"a": 1, "b": 2}


"""Conversiones desde diccionario:"""

lista_claves = list(diccionario)
lista_valores = list(diccionario.values())
lista_items = list(diccionario.items())

tupla_items = tuple(diccionario.items())
conjunto_claves = set(diccionario)

"""Crear diccionario desde:"""

diccionario = dict(lista_de_tuplas)     # [(clave, valor)]
diccionario = dict(tupla_de_tuplas)
diccionario = dict(enumerate(lista))