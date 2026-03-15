document.addEventListener("DOMContentLoaded", () => {

    const n1 = document.getElementById("numero1");
    const n2 = document.getElementById("numero2");
    const texto = document.getElementById("textoResultado");
    const barra = document.getElementById("barraResultado");

    function calcular(operacion) {
        const num1 = parseFloat(n1.value);
        const num2 = parseFloat(n2.value);

        if (isNaN(num1) || isNaN(num2)) {
            mostrarError();
            return;
        }

        if (operacion === "/" && num2 === 0) {
            mostrarError();
            return;
        }

        const resultado = {
            "+": num1 + num2,
            "-": num1 - num2,
            "*": num1 * num2,
            "/": num1 / num2
        }[operacion];

        barra.classList.remove("error");
        texto.textContent = resultado;
    }

    function mostrarError() {
        barra.classList.add("error");
        texto.textContent = "Error";
    }

    document.getElementById("sumar").onclick = () => calcular("+");
    document.getElementById("restar").onclick = () => calcular("-");
    document.getElementById("multiplicar").onclick = () => calcular("*");
    document.getElementById("dividir").onclick = () => calcular("/");

    document.getElementById("limpiar").onclick = () => {
        n1.value = "";
        n2.value = "";
        barra.classList.remove("error");
        texto.textContent = "0";
    };

});