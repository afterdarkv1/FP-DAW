
capitales = {'EE.UU':'Washington D.C',
             'Argentina':'Buenos Aires',
             'Chile':'Santiago de Chile',
             'Brasil':'Brasilia',
             'Cursos': ['Python', 'C++'],
             'Años': [22, 23, 24]}

# print(capitales['Argentina']) Te muestra el valor de la llave Argentina
# print(capitales.get('Argentina')) Comprueba si la llave que has metido existe, si no muestra 'none'
# print(capitales.keys()) Muestra todas las llaves del Diccionario
# print(capitales.values()) Muestra todos los valores del Diccionario
# print(capitales.items()) Muestra toda la información del Diccionario
# capitales.update({'Alemania':'Berlín'}) Añade un elemento al diccionario
# capitales.pop('EE.UU') Elimina un elemento del diccionario
# capitales.clear() Elimina todos los datos del diccionario

for key,value in capitales.items():
    print(key,value)