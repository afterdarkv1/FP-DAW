"""1Tienes que hacer un programa para un taller de coches. Una vez que pasas una revisión, se programan las
seis siguientes con un intervalo de 200 días cada uno. La salida por consola sería algo así:"""
from datetime import datetime, timedelta

# Obtener fecha y hora actual
fecha_actual = datetime.now()

# Mostrar registro y primera cita
print("Registro y primera cita:",
      fecha_actual.strftime("%d del %m de %Y a las %H:%M"))

print("Siguientes citas:")

# Intervalo de 200 días
intervalo = timedelta(days=200)

# Calcular y mostrar las siguientes 6 citas
for i in range(1, 7):
    siguiente_cita = fecha_actual + intervalo * i
    print(f"{i} - {siguiente_cita.strftime('%d del %m de %Y')}")

"""2

Tenemos una lista con cadenas de texto que, previsiblemente, deberían de ser fechas en formato
dd/mm/yy. Por ejemplo esta:"""

from datetime import datetime

# Lista de ejemplo (puede ser cualquier otra)
lista = ["13/02/25", "hola carmela", "12 34 56",
         "14/06/2026", "bra, bra", "56/13/26"]

fechas_correctas = []
fechas_incorrectas = []

for elemento in lista:
    try:
        # Intentamos primero con año de 2 dígitos
        try:
            datetime.strptime(elemento, "%d/%m/%y")
        except ValueError:
            # Si falla, intentamos con año de 4 dígitos
            datetime.strptime(elemento, "%d/%m/%Y")

        # Si no ha fallado ninguna conversión, es correcta
        fechas_correctas.append(elemento)

    except ValueError:
        fechas_incorrectas.append(elemento)

# Mostrar resultados
print("Fechas correctas:")
for fecha in fechas_correctas:
    print(f'"{fecha}"')

print("\nFechas incorrectas:")
for fecha in fechas_incorrectas:
    print(f'"{fecha}"')