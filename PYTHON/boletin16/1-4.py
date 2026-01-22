# ============================================
# EJERCICIO 1: FORTALEZA DE CONTRASEÑA
# ============================================

def contar_longitud(cadena: str) -> int:
    return len(cadena)


def contar_mayusculas(cadena: str) -> int:
    return sum(1 for c in cadena if c.isupper())


def contar_minusculas(cadena: str) -> int:
    return sum(1 for c in cadena if c.islower())


def contar_cifras(cadena: str) -> int:
    return sum(1 for c in cadena if c.isdigit())


def contar_otros(cadena: str) -> int:
    return sum(1 for c in cadena if not c.isalnum())


def analizar_contrasena(cadena: str) -> None:
    print("Análisis de la contraseña:")
    print("Longitud:", contar_longitud(cadena))
    print("Mayúsculas:", contar_mayusculas(cadena))
    print("Minúsculas:", contar_minusculas(cadena))
    print("Cifras:", contar_cifras(cadena))
    print("Otros caracteres:", contar_otros(cadena))


# ============================================
# EJERCICIO 2: MÁXIMO, MÍNIMO Y MEDIA
# ============================================

def calcular_maximo(*numeros: float) -> float:
    return max(numeros)


def calcular_minimo(*numeros: float) -> float:
    return min(numeros)


def calcular_media(*numeros: float) -> float:
    return sum(numeros) / len(numeros)


def analizar_numeros(*numeros: float) -> None:
    print("Números:", numeros)
    print("Máximo:", calcular_maximo(*numeros))
    print("Mínimo:", calcular_minimo(*numeros))
    print("Media:", calcular_media(*numeros))


# ============================================
# EJERCICIO 3: JUEGO DE LAS ADIVINANZAS (MODULAR)
# ============================================

import random

def generar_numero(secreto_min: int, secreto_max: int) -> int:
    return random.randint(secreto_min, secreto_max)


def pedir_intento() -> int:
    return int(input("Adivina el número: "))


def comprobar_intento(secreto: int, intento: int) -> str:
    if intento < secreto:
        return "El número es mayor."
    elif intento > secreto:
        return "El número es menor."
    else:
        return "¡Correcto!"


def jugar_adivinanza() -> None:
    secreto = generar_numero(1, 100)
    intentos = 0
    print("He pensado un número entre 1 y 100.")

    while True:
        try:
            intento = pedir_intento()
            intentos += 1
            resultado = comprobar_intento(secreto, intento)
            print(resultado)
            if resultado == "¡Correcto!":
                print("Intentos:", intentos)
                break
        except ValueError:
            print("Introduce un número válido.")


# ============================================
# EJERCICIO 4: PIEDRA, PAPEL O TIJERA (MODULAR)
# ============================================

def eleccion_ordenador() -> str:
    return random.choice(["piedra", "papel", "tijera"])


def eleccion_usuario() -> str:
    while True:
        eleccion = input("Elige piedra, papel o tijera: ").lower()
        if eleccion in ["piedra", "papel", "tijera"]:
            return eleccion
        else:
            print("Opción no válida.")


def determinar_ganador(jugador: str, ordenador: str) -> str:
    if jugador == ordenador:
        return "empate"
    elif (jugador == "piedra" and ordenador == "tijera") or \
         (jugador == "papel" and ordenador == "piedra") or \
         (jugador == "tijera" and ordenador == "papel"):
        return "jugador"
    else:
        return "ordenador"


def jugar_piedra_papel_tijera() -> None:
    victorias_jugador = 0
    victorias_ordenador = 0

    print("Juego: Piedra, Papel o Tijera")
    while victorias_jugador < 3 and victorias_ordenador < 3:
        jugador = eleccion_usuario()
        ordenador = eleccion_ordenador()
        print("Ordenador eligió:", ordenador)

        ganador = determinar_ganador(jugador, ordenador)
        if ganador == "empate":
            print("Empate.")
        elif ganador == "jugador":
            print("Ganas esta ronda.")
            victorias_jugador += 1
        else:
            print("Gana el ordenador esta ronda.")
            victorias_ordenador += 1

        print(f"Marcador -> Jugador: {victorias_jugador} | Ordenador: {victorias_ordenador}")
        print()

    if victorias_jugador == 3:
        print("¡Has ganado la partida!")
    else:
        print("El ordenador ha ganado la partida.")


# ============================================
# PRUEBAS / USO
# ============================================

# Ejercicio 1
analizar_contrasena("Abc123!@#")

# Ejercicio 2
analizar_numeros(10, 5, 8, 20, 3)

# Ejercicio 3
# jugar_adivinanza()

# Ejercicio 4
# jugar_piedra_papel_tijera()
