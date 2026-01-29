import random
from operator import truediv

nombres = ["Gimli", "Legolas", "Frodo", "Gandalf"]
adjetivos = ["Barbarroja","Pies Grandes","el Gris","PiedraDura", "el Deslumbrante "]
clases = ["Mago","Guerrero","Ladron","Bardo"]
razas = ["Elfo", "Humano", "Enano"]


def nombre_caracteristica(nombres, adjetivos, clases, razas):
    nombres = random.choice(nombres)
    adjetivos = random.choice(adjetivos)
    clases = random.choice(clases)
    razas = random.choice(razas)
    personaje_costruido = []
    personaje_costruido.append(nombres + " " + adjetivos)
    personaje_costruido.append(clases)
    personaje_costruido.append(razas)

    return personaje_costruido
print(nombre_caracteristica(nombres, adjetivos, clases, razas))





"""
def calcular_fuerza():
    fuerza = random.randint(50, 100)
    return fuerza
def calcular_inteligencia(f):
    inteligencia = 100 - f
    return inteligencia
def calcular_resistencia(f):
    resistencia = (f*2)
    return resistencia

def construye_personaje(personaje_caracteristicas):
    fuerza = calcular_fuerza()
    personaje_caracteristicas.append(fuerza)
    personaje_caracteristicas.append(calcular_inteligencia(fuerza))
    personaje_caracteristicas.append(calcular_resistencia(fuerza))
    return personaje_caracteristicas


print(construye_personaje(personaje_caracteristicas))



personaje1 = ["Ines Perado", "Bardo", "Humano", 59, 41, 118]
personaje2 = ["Ricardo Borriquero", "Mago", "Elfo", 90, 10, 180]


def personaje_con_mas_inteligencia(personaje1, personaje2):
    if personaje1[-3] > personaje2[-3]: return personaje1
    else: return personaje2


print(personaje_con_mas_inteligencia(personaje1,personaje2))


def personaje_vivo(p1):
    v=p1[5]
    if v > 0:
        return True
    else:
        return False


print(personaje_vivo(personaje1))
"""