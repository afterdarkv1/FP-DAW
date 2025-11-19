""" 1-2 Escribir un programa que nos pida tres palabras por teclado en cualquier orden y nos
las muestre en pantalla ordenadas alfabeticamente en orden ascendente"""
"""Idem al anterior pero ordenando ahora en orden descendente: para el reverse solo es palabras.sort(reverse=True)"""

palabra1 = input("Introduce la primera palabra: ")
palabra2 = input("Introduce la segunda palabra: ")
palabra3 = input("Introduce la tercera palabra: ")
palabras = [palabra1, palabra2, palabra3]
palabras.sort()
print("Palabras ordenadas alfabéticamente:", palabras)


""" 3 Escribir un programa que pida un número por teclado al usuario que simule ser el
precio de un artículo y escriba el resultado de aplicarle el IVA del 21%. El resultado
debe de estar redondeado a dos decimales"""
precio = float(input("Introduce el precio del artículo: "))

precio_con_iva = precio * 1.21

print("Precio con IVA (21%):", round(precio_con_iva, 2))


""" 4 Escribir un programa que nos pida por teclado dos calificaciones numéricas de un
alumno y nos muestre la media aritmética resultante redondeada sin decimales. Las
notas introducidas deben de estar entre 0 y 10 y admiten decimales. Caso de que una
entrada sea errónea debería de advertirnos de ello y no hacer el cálculo
"""

nota1 = float(input("Introduce la primera calificación (0-10): "))
nota2 = float(input("Introduce la segunda calificación (0-10): "))

if 0 <= nota1 <= 10 and 0 <= nota2 <= 10:
    media = (nota1 + nota2) / 2
    print("La media aritmética redondeada es:", round(media))
else:
    print("Error: las calificaciones deben estar entre 0 y 10. No se puede calcular la media.")



""". 5  Escribir un programa que nos pida las notas obtenidas en un trimestre y nos muestre
la media ponderada sabiendo que;
1. La primera nota corresponde al trabajo en clase y cuenta como un 5% del total
2. La segunda corresponde a los ejercicios prácticos: 15%
3. La tercera la nota del examen: 80%
El resultado debería de mostrarse de dos formas: redondeado con dos decimales
(nota real) y sin redpmdeada sin decimales (nota de boletín)."""



nota_trabajo = float(input("Introduce la nota del trabajo en clase (5%): "))
nota_practicos = float(input("Introduce la nota de ejercicios prácticos (15%): "))
nota_examen = float(input("Introduce la nota del examen (80%): "))

if all(0 <= nota <= 10 for nota in [nota_trabajo, nota_practicos, nota_examen]):

    media_ponderada = (nota_trabajo * 0.05) + (nota_practicos * 0.15) + (nota_examen * 0.80)
    print("Nota real (dos decimales):", round(media_ponderada, 2))
    print("Nota de boletín (sin decimales):", round(media_ponderada))
else:
    print("Error: todas las notas deben estar entre 0 y 10. No se puede calcular la media.")



""" 6 Modifica el ejercicio anterior para que la nota del boletín se redondee
matemáticamente si es superior a 5 pero se trunquen los decimales si es inferior a 5"""

nota_trabajo = float(input("Introduce la nota del trabajo en clase (5%): "))
nota_practicos = float(input("Introduce la nota de ejercicios prácticos (15%): "))
nota_examen = float(input("Introduce la nota del examen (80%): "))

if all(0 <= nota <= 10 for nota in [nota_trabajo, nota_practicos, nota_examen]):
    media_ponderada = (nota_trabajo * 0.05) + (nota_practicos * 0.15) + (nota_examen * 0.80)

    print("Nota real (dos decimales):", round(media_ponderada, 2))

    if media_ponderada >= 5:
        nota_boletin = round(media_ponderada)
    else:
        nota_boletin = int(media_ponderada)

    print("Nota de boletín:", nota_boletin)
else:
    print("Error: todas las notas deben estar entre 0 y 10. No se puede calcular la media.")
