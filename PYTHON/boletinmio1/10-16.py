import re
import random

# =================================================
# PROBLEMA 1 – Números semi-perfectos
# =================================================

def suma_divisores_propios(n):
    return sum(i for i in range(1, n) if n % i == 0)

def es_semiperfecto(n):
    return suma_divisores_propios(n) == n // 2

def mostrar_semiperfectos(a, b):
    for n in range(a, b + 1):
        if n > 0 and es_semiperfecto(n):
            print(n)

# =================================================
# PROBLEMA 2 – Casi amigos
# =================================================

def son_casi_amigos(a, b):
    return (suma_divisores_propios(a) == b - 1 and
            suma_divisores_propios(b) == a - 1)

# =================================================
# PROBLEMA 3 – Validador de usuario
# =================================================

def validar_usuario(cadena):
    if not (6 <= len(cadena) <= 12):
        return False
    if not cadena[0].isalpha():
        return False
    if not cadena.isalnum():
        return False
    if not any(c.isdigit() for c in cadena):
        return False
    return True

# =================================================
# PROBLEMA 4 – Analizador de texto
# =================================================

def contar_letras(c):
    return sum(1 for x in c if x.isalpha())

def contar_digitos(c):
    return sum(1 for x in c if x.isdigit())

def contar_espacios(c):
    return c.count(" ")

def contar_otros(c):
    return sum(1 for x in c if not x.isalnum() and x != " ")

def analizar_texto(c):
    print("Longitud:", len(c))
    print("Letras:", contar_letras(c))
    print("Dígitos:", contar_digitos(c))
    print("Espacios:", contar_espacios(c))
    print("Otros:", contar_otros(c))

# =================================================
# PROBLEMA 5 – *args con validación
# =================================================

def estadisticas(*nums):
    if not nums or not all(isinstance(n, (int, float)) for n in nums):
        return -1
    return {
        "max": max(nums),
        "min": min(nums),
        "media": sum(nums) / len(nums)
    }

# =================================================
# PROBLEMA 6 – Binario invertido
# =================================================

def binario_invertido(binario):
    if not re.fullmatch(r"[01]+", binario):
        return -1
    invertido = binario[::-1]
    return int(invertido, 2)

# =================================================
# PROBLEMA 7 – Decimal a binario flexible
# =================================================

def toBinarioFlex(n, bits):
    if not isinstance(n, int) or not isinstance(bits, int):
        return -1
    if n < 0 or bits <= 0:
        return -1
    binario = format(n, "b")
    if len(binario) > bits:
        return -1
    return binario.zfill(bits)

# =================================================
# PROBLEMA 8 – PIN cifrado nuevo
# =================================================

def linea_pin3(digito):
    return "O" * digito + "X" * (10 - digito)

def cifrar_pin3(pin):
    pin_str = f"{pin:04d}"
    return [linea_pin3(int(d)) for d in pin_str]

# =================================================
# PROBLEMA 9 – Divisores comunes mejorados
# =================================================

def divisores(n):
    return [i for i in range(1, n + 1) if n % i == 0]

def divisoresComunesPositivos(a, b):
    if not isinstance(a, int) or not isinstance(b, int) or a <= 0 or b <= 0:
        return None
    comunes = sorted(set(divisores(a)) & set(divisores(b)))
    return comunes

# =================================================
# PROBLEMA 10 – IP extendida
# =================================================

def clasificar_ip_extendida():
    ip = input("Introduce una dirección IP: ")

    if not re.fullmatch(r"\d+\.\d+\.\d+\.\d+", ip):
        print("Dirección no válida")
        return

    partes = list(map(int, ip.split(".")))
    if any(p < 0 or p > 255 for p in partes):
        print("Dirección no válida")
        return

    primer = partes[0]
    if 0 <= primer <= 127:
        print(ip + " Clase A /8")
    elif 128 <= primer <= 191:
        print(ip + " Clase B /16")
    elif 192 <= primer <= 223:
        print(ip + " Clase C /24")
    elif 224 <= primer <= 255:
        print("Dirección reservada")
    else:
        print("Dirección no válida")

# =================================================
# PROBLEMA 11 – MAC válida (3 formatos)
# =================================================

def es_mac_valida(mac):
    patron1 = r"^([0-9A-Fa-f]{2}:){5}[0-9A-Fa-f]{2}$"
    patron2 = r"^([0-9A-Fa-f]{4}\.){2}[0-9A-Fa-f]{4}$"
    patron3 = r"^[0-9A-Fa-f]{12}$"
    return bool(re.fullmatch(patron1, mac) or
                re.fullmatch(patron2, mac) or
                re.fullmatch(patron3, mac))

# =================================================
# PROBLEMA 12 – Matrícula internacional
# =================================================

def es_matricula_valida2(mat):
    patrones = [
        r"^\d{4}\s[A-Z]{3}$",
        r"^[A-Z]{2}-\d{3}-[A-Z]{2}$",
        r"^[A-Z]\d[A-Z]\d[A-Z]\d$"
    ]
    for p in patrones:
        if re.fullmatch(p, mat, re.IGNORECASE):
            return True
    return False

# =================================================
# PROBLEMA 13 – Contraseña fuerte
# =================================================

def es_contrasena_fuerte(c):
    if len(c) < 10:
        return False
    if sum(1 for x in c if x.isdigit()) < 2:
        return False
    if not any(x.isupper() for x in c):
        return False
    if not any(x.islower() for x in c):
        return False
    if not any(not x.isalnum() for x in c):
        return False
    return True

# =================================================
# PROBLEMA 14 – Juego modular nuevo
# =================================================

def generar_numero():
    return random.randint(1, 100)

def pedir_intento():
    return int(input("Adivina el número: "))

def comprobar(secreto, intento):
    if intento < secreto:
        return "mayor"
    elif intento > secreto:
        return "menor"
    else:
        return "igual"

def jugar():
    secreto = generar_numero()
    while True:
        try:
            intento = pedir_intento()
            res = comprobar(secreto, intento)
            print("El número es", res)
            if res == "igual":
                break
        except ValueError:
            print("Número no válido")

# =================================================
# PROBLEMA 15 – Fecha válida
# =================================================

def es_fecha_valida(fecha):
    if not re.fullmatch(r"\d{2}/\d{2}/\d{4}", fecha):
        return False

    d, m, y = map(int, fecha.split("/"))

    if m < 1 or m > 12 or d < 1:
        return False

    dias_mes = [
        31,
        29 if (y % 4 == 0 and (y % 100 != 0 or y % 400 == 0)) else 28,
        31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    ]

    return d <= dias_mes[m - 1]

# =================================================
# PRUEBAS RÁPIDAS (OPCIONAL)
# =================================================

if __name__ == "__main__":
    print("Usuario válido:", validar_usuario("Juan123"))
    print("Estadísticas:", estadisticas(10, 5, 8, 20))
    print("Binario invertido:", binario_invertido("10110"))
    print("Binario flexible:", toBinarioFlex(13, 8))
    print("Divisores comunes:", divisoresComunesPositivos(1725, 2500))
    print("MAC válida:", es_mac_valida("F4:8E:38:AF:F4:1C"))
    print("Matrícula válida:", es_matricula_valida2("7521-MXP"))
    print("Contraseña fuerte:", es_contrasena_fuerte("Abc123!@#9"))
    print("Fecha válida:", es_fecha_valida("29/02/2024"))
