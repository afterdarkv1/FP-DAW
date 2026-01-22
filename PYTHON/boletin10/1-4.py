# ============================================
# 1. NÚMEROS AMIGOS
# ============================================

def suma_divisores_propios(n: int) -> int:
    """Devuelve la suma de los divisores propios de n."""
    suma = 0
    for i in range(1, n):
        if n % i == 0:
            suma += i
    return suma


def son_amigos(a: int, b: int) -> bool:
    """Devuelve True si a y b son números amigos, False en caso contrario."""
    if a == b:
        return False
    return suma_divisores_propios(a) == b and suma_divisores_propios(b) == a


# ============================================
# 2. NÚMERO PERFECTO
# ============================================

def es_perfecto(n: int) -> bool:
    """Devuelve True si n es un número perfecto."""
    return suma_divisores_propios(n) == n


def pedir_entero_positivo() -> int:
    """Pide un entero positivo por teclado usando excepciones."""
    while True:
        try:
            n = int(input("Introduce un entero positivo: "))
            if n <= 0:
                raise ValueError("Debe ser un entero positivo.")
            return n
        except ValueError as e:
            print("Error:", e)


# ============================================
# 3. NÚMEROS ABUNDANTES
# ============================================

def es_abundante(n: int) -> bool:
    """Devuelve True si n es un número abundante."""
    return suma_divisores_propios(n) > n


def mostrar_abundantes(ini: int, fin: int) -> None:
    """Muestra por consola los números abundantes entre ini y fin (incluidos)."""
    print(f"Números abundantes entre {ini} y {fin}:")
    for n in range(ini, fin + 1):
        if n > 0 and es_abundante(n):
            print(n, end=" ")
    print()


# ============================================
# 4. NÚMEROS DEFICIENTES
# ============================================

def es_deficiente(n: int) -> bool:
    """Devuelve True si n es un número deficiente."""
    return suma_divisores_propios(n) < n


def mostrar_deficientes(ini: int, fin: int) -> None:
    """Muestra por consola los números deficientes entre ini y fin (incluidos)."""
    print(f"Números deficientes entre {ini} y {fin}:")
    for n in range(ini, fin + 1):
        if n > 0 and es_deficiente(n):
            print(n, end=" ")
    print()


# ============================================
# PRUEBAS / USO
# ============================================

# Ejercicio 1
print("¿220 y 284 son amigos?", son_amigos(220, 284))

# Ejercicio 2
n = pedir_entero_positivo()
print(f"¿{n} es perfecto?", es_perfecto(n))

# Ejercicio 3
mostrar_abundantes(1, 120)

# Ejercicio 4
mostrar_deficientes(1, 50)
