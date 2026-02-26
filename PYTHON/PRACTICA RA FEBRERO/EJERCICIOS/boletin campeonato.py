from datetime import datetime

# =========================
# Inicialización de la liga
# =========================

liga = {
    "Real Betis CF":      {"Pts": 0, "PJ": 0, "PG": 0, "PE": 0, "PP": 0, "GF": 0, "GC": 0},
    "Atlético de Madrid": {"Pts": 0, "PJ": 0, "PG": 0, "PE": 0, "PP": 0, "GF": 0, "GC": 0},
    "Sevilla":            {"Pts": 0, "PJ": 0, "PG": 0, "PE": 0, "PP": 0, "GF": 0, "GC": 0},
    "Barcelona FC":       {"Pts": 0, "PJ": 0, "PG": 0, "PE": 0, "PP": 0, "GF": 0, "GC": 0},
    "Rayo Vallecano":     {"Pts": 0, "PJ": 0, "PG": 0, "PE": 0, "PP": 0, "GF": 0, "GC": 0},
    "Real Madrid FC":     {"Pts": 0, "PJ": 0, "PG": 0, "PE": 0, "PP": 0, "GF": 0, "GC": 0}
}


# =========================
# Función para registrar partidos
# =========================

def resultadosPartido(equipo1, equipo2, goles1, goles2):

    liga[equipo1]["PJ"] += 1
    liga[equipo2]["PJ"] += 1

    liga[equipo1]["GF"] += goles1
    liga[equipo1]["GC"] += goles2

    liga[equipo2]["GF"] += goles2
    liga[equipo2]["GC"] += goles1

    if goles1 > goles2:
        liga[equipo1]["PG"] += 1
        liga[equipo1]["Pts"] += 3
        liga[equipo2]["PP"] += 1

    elif goles1 < goles2:
        liga[equipo2]["PG"] += 1
        liga[equipo2]["Pts"] += 3
        liga[equipo1]["PP"] += 1

    else:
        liga[equipo1]["PE"] += 1
        liga[equipo2]["PE"] += 1
        liga[equipo1]["Pts"] += 1
        liga[equipo2]["Pts"] += 1


# =========================
# Función para mostrar clasificación
# =========================

def verClasificacion(liga):

    fecha = datetime.now().strftime("%d-%m-%y")

    print("----------------------------------------------------------")
    print(f"Competición: La Liga eaSports - Clasificación a {fecha}")
    print("----------------------------------------------------------")
    print(f"{'EQUIPO':25}|{'PTS':^5}|{'PJ':^4}|{'PG':^4}|{'PE':^4}|{'PP':^4}|{'GF':^5}|{'GC':^5}")
    print("----------------------------------------------------------")

    clasificacion = sorted(
        liga.items(),
        key=lambda elemento: (
            elemento[1]["Pts"],
            elemento[1]["GF"] - elemento[1]["GC"]
        ),
        reverse=True
    )

    for equipo, datos in clasificacion:
        print(f"{equipo:25}|"
              f"{datos['Pts']:^5}|"
              f"{datos['PJ']:^4}|"
              f"{datos['PG']:^4}|"
              f"{datos['PE']:^4}|"
              f"{datos['PP']:^4}|"
              f"{datos['GF']:^5}|"
              f"{datos['GC']:^5}")


# =========================
# EJEMPLO DE USO
# =========================

resultadosPartido("Sevilla", "Barcelona FC", 1, 1)
resultadosPartido("Real Betis CF", "Real Madrid FC", 3, 0)
resultadosPartido("Atlético de Madrid", "Rayo Vallecano", 2, 0)

verClasificacion(liga)