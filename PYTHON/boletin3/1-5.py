""" 1-2 Escribir un programa que pida una contraseña por teclado (dos veces) y si no
coinciden nos lo vuelva a pedir hasta que lo hagan, Modifica el programa anterior para que cuando coincidan ambas contraseñas nos
informe del número de intentos inválidos"""

# Inicializamos el contador de intentos inválidos
intentos_invalidos = 0

while True:
    # Pedimos la contraseña dos veces
    contraseña1 = input("Introduce tu contraseña: ")
    contraseña2 = input("Confirma tu contraseña: ")

    # Comprobamos si coinciden
    if contraseña1 == contraseña2:
        print("¡Contraseña confirmada correctamente!")
        print(f"Número de intentos inválidos: {intentos_invalidos}")
        break  # Salimos del bucle si coinciden
    else:
        intentos_invalidos += 1
        print("Las contraseñas no coinciden. Intenta de nuevo.\n")

""" 3 Escribir un programa que nos pida nuestro nombre y apellidos (dos peticiones
diferentes hechas en ese orden) y nos lo escriba formateado de la siguiente forma:
Morales Vázquez, José María"""

# Pedimos el nombre y los apellidos
nombre = input("Introduce tu nombre: ")
apellidos = input("Introduce tus apellidos: ")

# Separamos los apellidos y ponemos la primera letra en mayúscula
# y el resto en minúscula, luego los unimos de nuevo
apellidos_formateados = ' '.join([apellido.capitalize() for apellido in apellidos.split()])
nombre_formateados = ' '.join([nombre.capitalize() for nombre in nombre.split()])


# Formateamos el nombre completo
resultado = f"{apellidos_formateados}, {nombre_formateados}"

# Mostramos el resultado
print(resultado)



""" 4 Escribir un programa que pida por teclado una cadena de texto y la escriba en sin
espacios en blanco (si los hubiera). Además, nos debe de decir el número de espacios
que ha encontrado y suprimido."""

# Pedimos la cadena de texto al usuario
texto = input("Introduce una cadena de texto: ")

# Contamos el número de espacios en blanco
num_espacios = texto.count(" ")

# Eliminamos los espacios en blanco
texto_sin_espacios = texto.replace(" ", "")

# Mostramos el resultado
print(f"Texto sin espacios: {texto_sin_espacios}")
print(f"Número de espacios eliminados: {num_espacios}")



""" 5 Escribir un programa que pida por teclado una cadena de texto y la imprima escrita al
reves (es decir, si el usuario escribe Hola Mundo el programa debería de escribir
odnuM aloH)"""


# Pedimos la cadena de texto al usuario
texto = input("Introduce una cadena de texto: ")

# Invertimos la cadena usando slicing
texto_invertido = texto[::-1]

# Mostramos el resultado
print(f"Texto invertido: {texto_invertido}")
