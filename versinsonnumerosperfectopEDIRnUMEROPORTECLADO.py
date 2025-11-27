# ...existing code...
while True:
    s = input("Por favor, introduce un numero: ")
    if not s.isdigit():
        print("Entrada no válida. Introduce un número entero positivo.")
        continue

    num = int(s)
    if num <= 0:
        print("Introduce un número entero positivo.")
        continue

    print(f"Hola, {num}")
    suma_divisores = 0
    for i in range(1, num):
        if num % i == 0:
            suma_divisores += i

    if suma_divisores == num:
        print(f"El numero {num} es un numero perfecto")
        break
    else:
        print(f"El numero {num} no es un numero perfecto")
# ...existing code...