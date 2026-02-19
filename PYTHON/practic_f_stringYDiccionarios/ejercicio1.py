from datetime import date

liga = {
    "Real Betis CF": [0, 0, 0, 0, 0, 0, 0],
    "Atlético de Madrid": [0, 0, 0, 0, 0, 0, 0],
    "Sevilla FC": [0, 0, 0, 0, 0, 0, 0],
    "Barcelona FC": [0, 0, 0, 0, 0, 0, 0],
    "Rayo Vallecano": [0, 0, 0, 0, 0, 0, 0],
    "Real Madrid FC": [0, 0, 0, 0, 0, 0, 0]
}


def resultadosPartido(equipo1, equipo2, goles1, goles2):
    for equipo in liga:
        if equipo[0] == equipo1:
            equipo[2] += 1  # PJ
            equipo[5] += goles1  # GF
            equipo[6] += goles2  # GC

            if goles1 > goles2:
                equipo[1] += 3  # PTS
                equipo[3] += 1  # PG
            elif goles1 == goles2:
                equipo[1] += 1
                equipo[4] += 1  # PE
            else:
                equipo[7] += 1  # PP

        if equipo[0] == equipo2:
            equipo[2] += 1
            equipo[5] += goles2
            equipo[6] += goles1

            if goles2 > goles1:
                equipo[1] += 3
                equipo[3] += 1
            elif goles1 == goles2:
                equipo[1] += 1
                equipo[4] += 1
            else:
                equipo[7] += 1


def verClasificacion(liga):
    fecha = date.today().strftime("%d-%m-%y")

    # Ordenar por puntos y diferencia de goles
    liga_ordenada = sorted(
        liga,
        key=lambda x: (x[1], x[5] - x[6]),
        reverse=True
    )

    print("-----------------------------------------------------------------")
    print(f"Competición: La Liga eaSports - Clasificación a día {fecha}")
    print("-----------------------------------------------------------------")
    print(f"{'EQUIPO':25}| {'Pts':^5}|{'PJ':^4}|{'PG':^4}|{'PE':^4}|{'PP':^4}|{'GF':^5}|{'GC':^5}")
    print("-----------------------------------------------------------------")

    for equipo in liga_ordenada:
        print(f"{equipo[0]:25}| {equipo[1]:^5}|{equipo[2]:^4}|{equipo[3]:^4}|{equipo[4]:^4}|{equipo[7]:^4}|{equipo[5]:^5}|{equipo[6]:^5}")


# 🔹 Simulación de partidos
resultadosPartido("Real Betis CF", "Real Madrid FC", 3, 1)
verClasificacion(liga)

