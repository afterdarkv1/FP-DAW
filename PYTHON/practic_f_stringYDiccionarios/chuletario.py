lenguaje = "python"
alumno = "Pepe"
edad = 24
print("Hola, me llamo", alumno, "tengo", edad, "años y estoy dando", lenguaje)
print("Hola, me llamo %s tengo %d años y estoy dando %s"%(alumno, edad, lenguaje)) # %s = String, %d = entero, %f = float

print(f"Hola, me llamo {alumno} tengo {edad} años y estoy dando {lenguaje}")

n1 = 32.345
n2 = 234.235325458
n3 = 34
print(f"Los números son {n1:.2f} , {n2:.2f} y {n3:.2f}")

n1 = 0.34
n2 = 0.55555356
print(f"Los porcentajes son {n1:.2%} y {n2:.2%}")

poblacion = 5417985815
print(f"La población del país es de {poblacion:,} habitantes") # Nos pone el separador de miles

lista = [24, 135, 6534, 1, 325, 64]
for n in lista:
    print(f"{n:5d}") # Nos pone el tamaño(siempre poner mayor tamaño que el mayor número) de 5 a cada elemento de la lista para que todos ocupen lo mismo y darle forma alineada(unidades, decenas, centenas)
print()
lista.append(23.2367)
for n in lista:
    print(f"{n:8.3f}")
print()
for n in lista:
    print(f"{n:7.2f}")

print(f"A la izquierda: ---{lenguaje:<20}---") # el número es el espacio que ocupa el contenido
print(f"A la derecha  : ---{lenguaje:>20}---")
print(f"Centrado      : ---{lenguaje:^20}---")
cadenaConFormato = f"Centrado      : ---{lenguaje:^20}---"
print(cadenaConFormato)

nombre = "Juan"
apellidos = "Pérez"
telefono = 634235317
libro = "El hobbit"
fechaDevolucion = "12/03/2026"
# Si queremos usar varias líneas usar triple comillas
fichaLibro = f"""  
Nombre: {nombre}
Apellidos: {apellidos}
Telefono: {telefono}
Libro: {libro} - Fecha de devolución: {fechaDevolucion}
"""
print(fichaLibro)

# Para poder mostrar una llave en una fString usar doble llaves
print(f"{{hola}} {{{nombre}}}")