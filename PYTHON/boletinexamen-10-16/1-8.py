import re

# ============================================
# EJERCICIO 1: PIN CIFRADO (MÉTODO 1)
# ============================================

def linea_pin(digito: int) -> str:
    linea = ["X"] * 10
    linea[digito] = "O"
    return "".join(linea)


def cifrar_pin(pin: int):
    pin_str = f"{pin:04d}"
    return [linea_pin(int(d)) for d in pin_str]


# ============================================
# EJERCICIO 2: PIN CIFRADO (MÉTODO 2)
# ============================================

def linea_pin2(digito: int) -> str:
    return "X" * digito + "O" * (10 - digito)


def cifrar_pin2(pin: int):
    pin_str = f"{pin:04d}"
    return [linea_pin2(int(d)) for d in pin_str]


# ============================================
# EJERCICIO 3: BINARIO A DECIMAL
# ============================================

def toDecimal(binario: str) -> int:
    if not re.fullmatch(r"[01]+", binario):
        return -1
    return int(binario, 2)


# ============================================
# EJERCICIO 4: DECIMAL A BINARIO (OCTETO)
# ============================================

def toBinario(n):
    if not isinstance(n, int) or n < 0 or n > 255:
        return -1
    return format(n, "08b")


# ============================================
# EJERCICIO 5: DIVISORES COMUNES
# ============================================

def divisores(n: int):
    return [i for i in range(1, n + 1) if n % i == 0]


def divisoresComunes(a, b):
    if not isinstance(a, int) or not isinstance(b, int) or a <= 0 or b <= 0:
        print("No puedo calcular los divisores comunes de esos números")
        return

    da = set(divisores(a))
    db = set(divisores(b))
    comunes = sorted(da & db)

    if len(comunes) == 1:
        print(f"El único divisor común de {a} y {b} es: {comunes[0]}")
    else:
        lista = ", ".join(map(str, comunes))
        print(f"Los divisores comunes de {a} y {b} son: {lista}")


# ============================================
# EJERCICIO 6: CLASE DE IP
# ============================================

def clasificar_ip():
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
        print(ip + "/8")
    elif 128 <= primer <= 191:
        print(ip + "/16")
    elif 192 <= primer <= 223:
        print(ip + "/24")
    elif 224 <= primer <= 255:
        print("Dirección reservada")
    else:
        print("Dirección no válida")


# ============================================
# EJERCICIO 7: MACS VÁLIDAS
# ============================================

def es_mac_valida(mac: str) -> bool:
    patron1 = r"^([0-9A-Fa-f]{2}:){5}[0-9A-Fa-f]{2}$"
    patron2 = r"^([0-9A-Fa-f]{4}\.){2}[0-9A-Fa-f]{4}$"
    return bool(re.fullmatch(patron1, mac) or re.fullmatch(patron2, mac))


def macsValidas(*macs):
    validas = 0
    no_validas = 0

    for mac in macs:
        if es_mac_valida(mac):
            print(f"{mac} es válida")
            validas += 1
        else:
            print(f"{mac} no es válida")
            no_validas += 1

    print(f"MACs válidas: {validas}")
    print(f"MACs no válidas: {no_validas}")


# ============================================
# EJERCICIO 8: MATRÍCULAS VÁLIDAS
# ============================================

def es_matricula_valida(mat: str) -> bool:
    patron = r"^\d{4}([ -])?[B-DF-HJ-NP-TV-Z]{3}$"
    return bool(re.fullmatch(patron, mat, re.IGNORECASE))


def matriculasValidas(*mats):
    validas = 0
    no_validas = 0

    for m in mats:
        if es_matricula_valida(m):
            print(f"{m} es válida")
            validas += 1
        else:
            print(f"{m} no es válida")
            no_validas += 1

    print(f"Matrículas válidas: {validas}")
    print(f"Matrículas no válidas: {no_validas}")


# ============================================
# PRUEBAS
# ============================================

# 1 y 2
for linea in cifrar_pin(6240):
    print(linea)

print()

for linea in cifrar_pin2(6240):
    print(linea)

# 3
print(toDecimal("10110"))
print(toDecimal("345"))
print(toDecimal("hola"))

# 4
print(toBinario(22))
print(toBinario(129))
print(toBinario(345))
print(toBinario(22.5))
print(toBinario("hola"))
print(toBinario(-2))

# 5
divisoresComunes(22, 16)
divisoresComunes(33, 17)
divisoresComunes(1725, 2500)
divisoresComunes(22.5, 0)

# 7
macsValidas("F4:8E:38:AF:F4:1C", "7521-MXP")
macsValidas("F48E38AFF41C", "f48e.38af.f41c", "F:3:AF:4:1:11")

# 8
matriculasValidas("22CDR", "7521-MXP", "1224MN")
matriculasValidas("5432 – BCF", "3456BAC")
