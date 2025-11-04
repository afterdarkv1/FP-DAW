""" 16 Escribe un programa que pida por teclado el radio de una circunferencia, admitiendo
valores con decimales y calcule la longitud y el área de la circunferencia (redondeando
a cinco decimales). Si no las recuerdas, las fórmulas son las siguientes:
area = 3.14159 * radio2
longitud = 2 * 3.14159 * radio"""

print("📏 Cálculo del área y longitud de una circunferencia")

try:
    # Pedimos el radio (puede tener decimales)
    radio = float(input("Introduce el radio de la circunferencia: "))

    if radio < 0:
        print("⚠️ El radio no puede ser negativo.")
    else:
        pi = 3.14159
        area = pi * (radio ** 2)
        longitud = 2 * pi * radio

        # Mostramos los resultados redondeados a 5 decimales
        print(f"\n🔹 Longitud de la circunferencia: {round(longitud, 5)}")
        print(f"🔹 Área de la circunferencia: {round(area, 5)}")

except ValueError:
    print("⚠️ Error: introduce un número válido SUSAN(usa punto decimal si es necesario).")


    """17. Escribir un programa que reciba por teclado una temperatura en cualquiera de las
tres unidades básicas (Celcius, Farenheit o Kelvin) y la devuelva en las otras dos.
Tu programa reconocerá la unidad que has usado al introducir la entrada por teclado
porque irá acompañado de una letra que lo indique. Por ejemplo, 12C, 280.57K o
98.6F
Se admitirán decimales en la entrada, (como se ve en los ejemplos anteriores) y se
devolverá el resultado con dos decimales
Las formulas de conversión entre unidades son las siguientes:
Para convertir de ºC a ºF use la fórmula: ºF = ºC x 1.8 + 32.
Para convertir de ºF a ºC use la fórmula: ºC = (ºF-32) ÷ 1.8.
Para convertir de ºK a ºC use la fórmula: ºC = ºK – 273.15
Para convertir de ºC a ºK use la fórmula: ºK = ºC + 273.15.
Para convertir de ºF a ºK use la fórmula: ºK = 5/9 (ºF – 32) + 273.15.
Para convertir de ºK a ºF use la fórmula: ºF = 1.8(ºK – 273.15) + 32"""

# Programa para convertir temperaturas entre Celsius, Fahrenheit y Kelvin

# Pedimos la entrada al usuario
entrada = input("Introduce la temperatura (por ejemplo, 25C, 77F o 300K): ").strip()

# Obtenemos la unidad (último carácter) y el valor numérico
" :-1 selecciona todo menos el ultimos"
"upper convierte en mayusculas"
unidad = entrada[-1].upper()
try:

    valor = float(entrada[:-1])
except ValueError:
    print("Error: la parte numérica no es válida.")
    exit()

# Conversiones según la unidad introducida
if unidad == 'C':
    f = valor * 1.8 + 32
    k = valor + 273.15
    print(f"{valor:.2f}°C equivalen a {f:.2f}°F y {k:.2f}K")

elif unidad == 'F':
    c = (valor - 32) / 1.8
    k = (5/9) * (valor - 32) + 273.15
    print(f"{valor:.2f}°F equivalen a {c:.2f}°C y {k:.2f}K")

elif unidad == 'K':
    c = valor - 273.15
    f = 1.8 * (valor - 273.15) + 32
    print(f"{valor:.2f}K equivalen a {c:.2f}°C y {f:.2f}°F")

else:
    print("Error: la unidad debe ser 'C', 'F' o 'K'.")





"""18. La tabla de tarifas impositivas en España para 2022 es la siguiente:
Escribe un programa que le pida al usuario su sueldo anual (lógicamente puede ser
un número con decimales) y le informe que porcentaje de retención le corresponde, el
importe de la misma y el importe neto restante que cobrará."""
# Programa que calcula la retención del IRPF según el salario anual (España 2022)

# Pedir el sueldo al usuario
sueldo = float(input("Introduce tu sueldo anual en euros: "))

# Determinar el porcentaje de retención según la tabla
if sueldo <= 12450:
    porcentaje = 19
elif sueldo <= 20200:
    porcentaje = 24
elif sueldo <= 35200:
    porcentaje = 30
elif sueldo <= 60000:
    porcentaje = 37
elif sueldo <= 300000:
    porcentaje = 45
else:
    porcentaje = 47

# Calcular retención e importe neto
retencion = sueldo * porcentaje / 100
neto = sueldo - retencion

# Mostrar resultados con formato
print(f"\nSueldo bruto anual: {sueldo:,.2f} €")
print(f"Tipo de retención: {porcentaje}%")
print(f"Importe retenido: {retencion:,.2f} €")
print(f"Sueldo neto: {neto:,.2f} €")
