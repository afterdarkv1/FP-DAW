# Tres en Raya 2D sin funciones y con posiciones 1-9

tablero = [[' ' for _ in range(3)] for _ in range(3)]
jugador = 'X'

while True:
    # Mostrar tablero
    print("-------------")
    for fila in tablero:
        print(f"| {fila[0]} | {fila[1]} | {fila[2]} |")
        print("-------------")

    # Pedir posición
    while True:
        try:
            pos = int(input(f"Jugador {jugador}, elige posición (1-9): "))
            if not 1 <= pos <= 9:
                print("Número inválido. Elige del 1 al 9.")
                continue
            fila = (pos - 1) // 3
            col  = (pos - 1) % 3
            if tablero[fila][col] != ' ':
                print("Esa casilla ya está ocupada.")
                continue
            break
        except ValueError:
            print("Introduce un número válido.")

    # Colocar ficha
    tablero[fila][col] = jugador

    # Revisar ganador
    ganador = None
    # Filas y columnas
    for i in range(3):
        if tablero[i][0] == tablero[i][1] == tablero[i][2] != ' ':
            ganador = tablero[i][0]
        if tablero[0][i] == tablero[1][i] == tablero[2][i] != ' ':
            ganador = tablero[0][i]
    # Diagonales
    if tablero[0][0] == tablero[1][1] == tablero[2][2] != ' ':
        ganador = tablero[0][0]
    if tablero[0][2] == tablero[1][1] == tablero[2][0] != ' ':
        ganador = tablero[0][2]

    if ganador:
        print("-------------")
        for fila in tablero:
            print(f"| {fila[0]} | {fila[1]} | {fila[2]} |")
            print("-------------")
        print(f"¡Jugador {ganador} gana!")
        break

    # Revisar empate
    lleno = True
    for fila in tablero:
        for c in fila:
            if c == ' ':
                lleno = False
    if lleno:
        print("-------------")
        for fila in tablero:
            print(f"| {fila[0]} | {fila[1]} | {fila[2]} |")
            print("-------------")
        print("¡Empate!")
        break

    # Cambiar jugador
    jugador = 'O' if jugador == 'X' else 'X'
