let input = document.getElementById("inputTexto")
let boton = document.getElementById("cambiar_texto")
let p = document.getElementById("texto")
let div = document.getElementById("caja")
let color_fondo = document.getElementById("color_fondo")
let color_borde = document.getElementById("color_borde")
let color_texto = document.getElementById("color_texto")
let boton_fondo = document.getElementById("cambiar_fondo")
let boton_borde = document.getElementById("cambiar_borde")
let boton_texto = document.getElementById("cambiar_color_texto")

boton.addEventListener("click", () => {
   p.textContent = input.value;

});
boton_fondo.addEventListener("click", () => {
    div.style.backgroundColor = color_fondo.value;
});
boton_borde.addEventListener("click", () => {
    div.style.borderColor = color_borde.value;
});
boton_texto.addEventListener("click", () => {
    p.style.color = color_texto.value;
});

