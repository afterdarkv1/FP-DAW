
def suma(*args):
    suma = 0
    cosas = list(args)
    cosas[4] = 0
    for i in cosas:
        suma += i
    return suma

print(suma(1, 5, 4, 2, 7, 1))

def hola(**kwargs):
    # print('Hola ' + kwargs['nombre'] + ' ' + kwargs['apellido'] + ' ' + kwargs['segundo_nombre'])
    print('Hola', end=' ')
    for clave, valor in kwargs.items():
        print(valor, end=' ')

hola(titulo = 'Señor', nombre = 'Kevin', apellido = 'Téllez', segundo_nombre = 'Python')