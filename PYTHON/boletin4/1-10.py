# ===============================================================
# EJERCICIO 1 — FACTORIAL DE UN NÚMERO
# ===============================================================

print("EJERCICIO 1 - FACTORIAL")

n = int(input("Introduce un número: "))

factorial = 1
for i in range(1, n+1):
    factorial *= i

print(f"El factorial de {n} es {factorial}")



# ===============================================================
# EJERCICIO 2 — SUCESIÓN DE FIBONACCI (N ELEMENTOS)
# ===============================================================

print("\nEJERCICIO 2 - FIBONACCI N ELEMENTOS")

n = int(input("¿Cuántos números de Fibonacci quieres? "))

fib = [0, 1]

for i in range(2, n):
    fib.append(fib[-1] + fib[-2])

print("Sucesión:", ",".join(str(x) for x in fib[:n]))



# ===============================================================
# EJERCICIO 3 — FIBONACCI HASTA UN LÍMITE
# ===============================================================

n = int(input("Introduce un número: "))

if n < 0:
    print("Introduce un número mayor o igual a 0")

elif n == 0:
    print([0])

elif n == 1:
    print([0, 1])

else:
    fibonacci = [0, 1]

    while fibonacci[-1] + fibonacci[-2] <= n:
        fibonacci.append(fibonacci[-1] + fibonacci[-2])

    print(fibonacci)



# ===============================================================
# EJERCICIO 4 — CONTAR CIFRAS DE UN NÚMERO
# ===============================================================

print("\nEJERCICIO 4 - CONTAR CIFRAS")

num = input("Introduce un número: ")

print(f"El número {num} tiene {len(num)} cifras")



# ===============================================================
# EJERCICIO 5 — NÚMERO CAPICÚA
# ===============================================================

print("\nEJERCICIO 5 - CAPICÚA")

num = input("Introduce un número: ")

if num == num[::-1]:
    print("Es capicúa")
else:
    print("No es capicúa")



# ===============================================================
# EJERCICIO 6 — 50 PRIMEROS PRIMOS Y SUS POTENCIAS
# ===============================================================

print("\nEJERCICIO 6 - 50 PRIMEROS PRIMOS")

def primo(x):
    if x < 2:
        return False
    for i in range(2, int(x**0.5)+1):
        if x % i == 0:
            return False
    return True

primos = []
num = 2
while len(primos) < 50:
    if primo(num):
        primos.append(num)
    num += 1

print("Primo | Raíz | Cuadrado | Cubo")
for p in primos:
    print(p, p**0.5, p**2, p**3)



# ===============================================================
# EJERCICIO 7 — PRIMERA PAREJA DE PRIMOS GEMELOS > 50
# ===============================================================

print("\nEJERCICIO 7 - PRIMOS GEMELOS > 50")

n = 51
while True:
    if primo(n) and primo(n+2):
        print(f"Primos gemelos: {n} y {n+2}")
        break
    n += 1



# ===============================================================
# EJERCICIO 8 — SUMA DE CIFRAS PARES E IMPARES
# ===============================================================

print("\nEJERCICIO 8 - SUMA PARES E IMPARES")

num = input("Introduce un número: ")

suma_pares = 0
suma_impares = 0

for c in num:
    d = int(c)
    if d % 2 == 0:
        suma_pares += d
    else:
        suma_impares += d

print("Suma pares:", suma_pares)
print("Suma impares:", suma_impares)



# ===============================================================
# EJERCICIO 9 — BUSCAR UN CARÁCTER EN UNA CADENA
# ===============================================================

print("\nEJERCICIO 9 - BUSCAR CARÁCTER")

cadena = input("Introduce una cadena: ")
car = input("Carácter a buscar: ")

posiciones = [i for i, c in enumerate(cadena) if c == car]

print(f"El carácter '{car}' aparece {len(posiciones)} veces")
print("Posiciones:", ",".join(str(p) for p in posiciones))



# ===============================================================
# EJERCICIO 10 — EXTRAER CIFRAS DE UNA CADENA
# ===============================================================

print("\nEJERCICIO 10 - EXTRAER CIFRAS")

cadena = input("Introduce una cadena: ")
solo_numeros = "".join(c for c in cadena if c.isdigit())

print("Cifras encontradas:", solo_numeros)



# ===============================================================
# EJERCICIO 11 — SEPARAR PALABRAS CON GUIONES
# ===============================================================

print("\nEJERCICIO 11 - GUIONES ENTRE CARACTERES")

frase = input("Introduce una frase: ")

palabras = frase.split()
resultado = " ".join("-".join(p) for p in palabras)

print(resultado)



# ===============================================================
# EJERCICIO 12 — AÑO BISIESTO
# ===============================================================

print("\nEJERCICIO 12 - AÑO BISIESTO")

anio = int(input("Introduce un año: "))

if (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0):
    print("Es bisiesto")
else:
    print("No es bisiesto")



# ===============================================================
# EJERCICIO 13 — MATRIZ DE CARACTERES NxN
# ===============================================================

print("\nEJERCICIO 13 - MATRIZ")

n = int(input("Número de filas/columnas: "))
char = input("Carácter: ")

for _ in range(n):
    print(char * n)



# ===============================================================
# EJERCICIO 14 — HORA (24H Y 12H CON AM/PM)
# ===============================================================

print("\nEJERCICIO 14 - HORAS 12H/24H")

hora = input("Introduce una hora (HH:MM, con o sin am/pm): ").strip().lower()

# Detectar formato 12h
modo12 = hora.endswith("am") or hora.endswith("pm")

if modo12:
    sufijo = hora[-2:]       # am o pm
    hora = hora[:-2].strip() # quitar am/pm

try:
    hh, mm = hora.split(":")
    hh = int(hh)
    mm = int(mm)
except:
    print("No es una hora válida")
    exit()

# Validar minutos
if mm < 0 or mm > 59:
    print("No es una hora válida")
    exit()

# --- Conversión si es formato 12h ---
if modo12:
    if hh < 1 or hh > 12:
        print("No es una hora válida")
        exit()

    if sufijo == "pm" and hh != 12:
        hh += 12
    if sufijo == "am" and hh == 12:
        hh = 0

# --- Validar formato 24h ---
if hh < 0 or hh > 23:
    print("No es una hora válida")
    exit()

# Clasificación
if 6 <= hh <= 11:
    momento = "de la mañana"
elif 12 <= hh <= 19:
    momento = "de la tarde"
elif 20 <= hh <= 23:
    momento = "de la noche"
else:
    momento = "de la madrugada"

print(f"Son las {hh:02d}:{mm:02d} {momento}")
