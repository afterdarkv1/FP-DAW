""" 12 13 este Las matrículas españolas constan de un número de cuatro dígitos y tres letras cualesquiera en mayúsculas a excepción de las vocales,
 la Ñ y la Q. Escribe un programa que detecte si una matrícula introducida por teclado es válida o no."""

# Pedir la matrícula al usuario
matricula = input("Introduce una matrícula (formato NNNN LLL o NNNN-LLL): ").upper()

# Quitar espacio o guión si existe entre números y letras
if len(matricula) == 8 and (matricula[4] == " " or matricula[4] == "-"):
    # Unir la matrícula para que quede como NNNNLLL
    matricula = matricula[:4] + matricula[5:]

# Definir letras no permitidas (vocales, Ñ y Q)
no_permitidas = "AEIOUÑQ"

# Comprobar que ahora la matrícula tiene 7 caracteres
if len(matricula) == 7:
    numeros = matricula[:4]
    letras = matricula[4:]

    # Validación: 4 números, 3 letras válidas
    if numeros.isdigit() and letras.isalpha() and all(l not in no_permitidas for l in letras):
        print("✅ Matrícula válida.")
    else:
        print("❌ Matrícula no válida.")
else:
    print("❌ La matrícula debe tener 4 números y 3 letras (con o sin espacio o guión).")



""" 15 Escribe un programa que reciba por teclado una fecha en el formato DD/MM/YYYY. El
programa debe de comprobar si la fecha es correcta teniendo en cuenta:
Qué el formato sea el correcto
Que la fecha sea totalmente válida teniendo en cuenta incluso los años que son
bisiestos (aquellos que son divisibles entre cuatro)."""

# Pedir fecha al usuario
fecha = input("Introduce una fecha (DD/MM/YYYY): ")

# Función para comprobar si un año es bisiesto
def es_bisiesto(año):
    return año % 4 == 0 and (año % 100 != 0 or año % 400 == 0)

# Validar formato
if len(fecha) == 10 and fecha[2] == "/" and fecha[5] == "/":
    try:
        dia = int(fecha[:2])
        mes = int(fecha[3:5])
        año = int(fecha[6:])

        # Comprobar mes válido
        if 1 <= mes <= 12:
            # Días por mes
            if mes in [1,3,5,7,8,10,12]:
                max_dia = 31
            elif mes in [4,6,9,11]:
                max_dia = 30
            else:  # febrero
                max_dia = 29 if es_bisiesto(año) else 28

            if 1 <= dia <= max_dia:
                print("✅ La fecha es correcta.")
            else:
                print("❌ Día no válido para el mes indicado.")
        else:
            print("❌ Mes no válido.")
    except ValueError:
        print("❌ La fecha contiene caracteres no válidos.")
else:
    print("❌ Formato incorrecto. Debe ser DD/MM/YYYY.")
