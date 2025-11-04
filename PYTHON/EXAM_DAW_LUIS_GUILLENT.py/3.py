
texto1 = ["Hola", "¿Cómo", "estás?"]
texto2 = ["Espero", "que", "bien"]


resultado = []

for i in range(min(len(texto1), len(texto2))):
    resultado.append(texto1[i] + " " + texto2[i])

texto_final = " ".join(resultado)

print(texto_final)

