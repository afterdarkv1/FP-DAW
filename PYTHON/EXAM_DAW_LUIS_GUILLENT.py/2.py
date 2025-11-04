
cantidad = input("Introduce una cantidad (por ejemplo 100P, 50R, 10F): ")

# Último carácter es la letra de la moneda
letra = cantidad[-1].upper()

# El resto son los euros
euros = float(cantidad[:-1])

if letra == 'P':
    resultado = euros * 27.93
    print(f"{euros} euros son {resultado:.2f} pesos.")

elif letra == 'R':
    resultado = euros * 102.81
    print(f"{euros} euros son {resultado:.2f} rupias.")

elif letra == 'F':
    resultado = euros * 23.9521
    print(f"{euros} euros son {resultado:.2f} francos.")

else:
    print("Moneda no reconocida. Usa P (pesos), R (rupias) o F (francos).")






