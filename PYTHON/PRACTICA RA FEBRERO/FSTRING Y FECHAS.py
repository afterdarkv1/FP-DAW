"""
CHULETARIO RÁPIDO – FORMATEO EN PYTHON
"""

print("texto", variable)
"""Imprime texto y variables separadas por comas"""

print("texto %s %d %f" % (var1, var2, var3))
"""Formateo antiguo -> %s string, %d entero, %f float"""

print(f"Texto {variable}")
"""f-string -> inserta variables directamente"""

print(f"{numero:.2f}")
""":.2f -> 2 decimales"""

print(f"{numero:.2%}")
""":.2% -> porcentaje con 2 decimales"""

print(f"{numero:,}")
""":, -> separador de miles"""

print(f"{numero:5d}")
""":5d -> entero en 5 espacios (alineación)"""

print(f"{numero:8.3f}")
""":8.3f -> 8 espacios totales y 3 decimales"""

print(f"{numero:7.2f}")
""":7.2f -> 7 espacios totales y 2 decimales"""

print(f"{texto:<20}")
"""<20 -> alineado a la izquierda"""

print(f"{texto:>20}")
""">20 -> alineado a la derecha"""

print(f"{texto:^20}")
"""^20 -> centrado"""

variable = f"Texto {dato}"
"""Guardar f-string en variable"""

texto = f"""
Linea 1
Linea 2
"""
"""Triple comillas -> texto multilínea"""

print(f"{{texto}}")
"""{{ }} -> mostrar llaves literales"""