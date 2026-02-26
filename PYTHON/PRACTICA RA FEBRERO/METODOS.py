"""
DICCIONARIOS EN PYTHON - APUNTES COMPLETOS
Cada sección explica qué hace cada método u operación.
"""

"""
Crear un diccionario
"""
dic = {"a": 1, "b": 2}

"""
.items()
Devuelve una vista con pares (clave, valor)
"""
print(dic.items())

"""
.keys()
Devuelve todas las claves del diccionario
"""
print(dic.keys())

"""
.values()
Devuelve todos los valores del diccionario
"""
print(dic.values())

"""
.get(clave)
Devuelve el valor de la clave.
Si no existe, devuelve None o un valor por defecto.
"""
print(dic.get("a"))        # 1
print(dic.get("c"))        # None
print(dic.get("c", 0))     # 0

"""
.update()
Actualiza el diccionario agregando o modificando claves
"""
dic.update({"c": 3})
print(dic)

"""
.pop(clave)
Elimina la clave indicada y devuelve su valor
"""
print(dic.pop("a"))
print(dic)

"""
.popitem()
Elimina y devuelve el último par (clave, valor) insertado
"""
print(dic.popitem())
print(dic)

"""
.setdefault(clave, valor)
Si la clave existe → devuelve su valor.
Si no existe → la crea con el valor indicado.
"""
dic.setdefault("d", 4)
print(dic)

"""
.copy()
Crea una copia del diccionario
"""
nuevo = dic.copy()
print(nuevo)

"""
.clear()
Vacía completamente el diccionario
"""
dic.clear()
print(dic)

"""
Acceder a un valor con corchetes
(Si no existe la clave → da error KeyError)
"""
dic2 = {"x": 10, "y": 20}
print(dic2["x"])

"""
Añadir o modificar un valor
"""
dic2["z"] = 30
dic2["x"] = 100
print(dic2)

"""
Comprobar si una clave existe usando 'in'
Devuelve True o False
"""
print("x" in dic2)
print("a" in dic2)

"""
Recorrer un diccionario con for
"""
for clave, valor in dic2.items():
    print(clave, valor)


"""
ponmer comillas en fstring
"""
nombre = "Juan"
print(f"Hola '{nombre}'")
print(f'Saludo: "{nombre}"')


nombre = "Juan"
print(f"Hola \"{nombre}\"")