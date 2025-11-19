
""" 9 Escribir un programa que pida números entre el 1 y el 100 por teclado hasta que
escribamos la palabra FIN (con mayúsculas). Si el usuario introduce una entrada
inválida (números superiores a 100, otras cadenas de caracteres que no sean FIN, etc.)
no se tendrá en cuenta pero se mostrará un mensaje de error y el programa seguirá
su curso. Cuando terminamos (al introducir la palabra FIN, recuerda) mostraremos
por pantalla el numero de entradas válidas que hemos hecho (sin contar esta última
que sólo sirve para finalizar el programa)"""
""" 10 Modificar el programa anterior para que nos muestre al final la media aritmética de
las entradas válidas
"""
""" 9-10-11 Modificar el programa anterior para que, además, nos diga al final cual han sido el
número mayor y el menor que has introducido"""

contador = 0        # Contador de entradas válidas
suma = 0            # Suma de las entradas válidas
maximo = None       # Número mayor
minimo = None       # Número menor

while True:
    entrada = input("Introduce un número entre 1 y 100 (o FIN para terminar): ")

    if entrada == "FIN":
        break  # Salir del bucle

    try:
        numero = int(entrada)
        if 1 <= numero <= 100:
            contador += 1      # Entrada válida
            suma += numero     # Acumular la suma

            # Actualizar máximo y mínimo
            if maximo is None or numero > maximo:
                maximo = numero
            if minimo is None or numero < minimo:
                minimo = numero
        else:
            print("Error: el número debe estar entre 1 y 100")
    except ValueError:
        print("Error: entrada no válida, introduce un número o FIN")

# Mostrar resultados
print("Número de entradas válidas:", contador)

if contador > 0:
    media = suma / contador
    print("Media de las entradas válidas:", round(media, 2))
    print("Número mayor introducido:", maximo)
    print("Número menor introducido:", minimo)
else:
    print("No se introdujeron entradas válidas, no se pueden calcular estadísticas")



    """ 12 Realiza un juego en el que debes de acertar un número entre el 1 y el 50 que el
ordenador ha elegido de forma aleatoria. El programa te indicará si has acertado, si te
has pasado o si te has quedado corto. El programa finaliza cuando se acierta o cuando
se superan el número máximo de intentos establecidos en 5."""

import random

numero_secreto = random.randint(1, 50)
max_intentos = 5
intentos = 0

print("¡Adivina el número entre 1 y 50! Tienes 5 intentos.")

while intentos < max_intentos:
    try:
        adivinanza = int(input(f"Intento {intentos + 1}: "))

        if not 1 <= adivinanza <= 50:
            print("Error: el número debe estar entre 1 y 50")
            continue

        intentos += 1

        if adivinanza == numero_secreto:
            print(f"¡Felicidades! Has acertado el número {numero_secreto} en {intentos} intento(s).")
            break
        elif adivinanza < numero_secreto:
            print("Te has quedado corto.")
        else:
            print("Te has pasado.")

    except ValueError:
        print("Error: introduce un número válido.")

else:
    print(f"Has agotado los {max_intentos} intentos. El número era {numero_secreto}.")


""" 13- 14 -15 Modifica el programa anterior para que el programa te de todos los intentos que
necesites pero que cuando aciertes te informe de cuantas veces has fallado antes de
lograrlo Modifica el programa anterior para que al final del programa te pida si quieres volver
a jugar y en caso afirmativo comience una nueva partida
Modifica el programa anterior para que al iniciar el juego te pida dos parámetros con
objeto de cambiar la dificultad del juego: el número máximo (antes era siempre 50) o
el número de intentos posibles (antes era siempre 5).
"""
import random

print("¡Juego de adivinar el número entre 1 y 50!")

while True:  # Bucle para reiniciar el juego
    numero_secreto = random.randint(1, 50)
    fallos = 0

    while True:  # Bucle del juego actual
        try:
            adivinanza = int(input("Introduce un número: "))

            if not 1 <= adivinanza <= 50:
                print("Error: el número debe estar entre 1 y 50")
                continue

            if adivinanza == numero_secreto:
                print(f"¡Felicidades! Has acertado el número {numero_secreto}.")
                print(f"Has fallado {fallos} vez/veces antes de acertar.")
                break
            elif adivinanza < numero_secreto:
                print("Te has quedado corto.")
            else:
                print("Te has pasado.")

            fallos += 1  # Contamos solo los fallos

        except ValueError:
            print("Error: introduce un número válido.")

    # Preguntar si quiere volver a jugar
    jugar_otra_vez = input("¿Quieres jugar otra vez? (S/N): ").upper()
    if jugar_otra_vez != "S":
        print("¡Gracias por jugar! Hasta la próxima.")
        break




        """ 15 lo de cambiar la dificultad"""

import random

print("🎯 ¡Bienvenido al juego de adivinar el número!")

while True:  # Bucle para reiniciar el juego
    # Configuración de dificultad
    try:
        numero_maximo = int(input("Elige el número máximo (por ejemplo 50): "))
        intentos_maximos = int(input("Elige el número máximo de intentos (por ejemplo 5): "))

        if numero_maximo < 1 or intentos_maximos < 1:
            print("⚠️ Los valores deben ser mayores que 0. Intenta de nuevo.")
            continue
    except ValueError:
        print("⚠️ Error: introduce valores numéricos válidos.")
        continue

    numero_secreto = random.randint(1, numero_maximo)
    fallos = 0

    print(f"\n🔢 He pensado un número entre 1 y {numero_maximo}. ¡Tienes {intentos_maximos} intentos para adivinarlo!")

    while fallos < intentos_maximos:
        try:
            adivinanza = int(input("Introduce un número: "))

            if not 1 <= adivinanza <= numero_maximo:
                print(f"⚠️ El número debe estar entre 1 y {numero_maximo}.")
                continue

            if adivinanza == numero_secreto:
                print(f"🎉 ¡Felicidades! Has acertado el número {numero_secreto}.")
                print(f"Has fallado {fallos} vez/veces antes de acertar.")
                break
            elif adivinanza < numero_secreto:
                print("📉 Te has quedado corto.")
            else:
                print("📈 Te has pasado.")

            fallos += 1
            print(f"Intentos restantes: {intentos_maximos - fallos}")

        except ValueError:
            print("⚠️ Error: introduce un número válido.")

    else:
        # Este bloque se ejecuta si el jugador no acierta en los intentos disponibles
        print(f"💀 Se acabaron los intentos. El número secreto era {numero_secreto}.")

    # Preguntar si quiere volver a jugar
    jugar_otra_vez = input("\n¿Quieres jugar otra vez? (S/N): ").upper()
    if jugar_otra_vez != "S":
        print("👋 ¡Gracias por jugar! Hasta la próxima.")
        break
