document.addEventListener("DOMContentLoaded", function () {

    const n1 = document.getElementById("numero1");
    const n2 = document.getElementById("numero2");
    const barra = document.getElementById("barraResultado");
    const texto = document.getElementById("textoResultado");

    const btnSumar = document.getElementById("sumar");
    const btnRestar = document.getElementById("restar");
    const btnMultiplicar = document.getElementById("multiplicar");
    const btnDividir = document.getElementById("dividir");
    const btnLimpiar = document.getElementById("limpiar");

    function obtenerValores() {
        const num1 = parseFloat(n1.value);
        const num2 = parseFloat(n2.value);

        if (isNaN(num1) || isNaN(num2)) {
            mostrarError("Error");
            return null;
        }

        return { num1, num2 };
    }

    function mostrarResultado(valor) {
        barra.classList.remove("error");
        texto.textContent = valor;
    }

    function mostrarError(mensaje) {
        barra.classList.add("error");
        texto.textContent = mensaje;
    }

    btnSumar.addEventListener("click", function () {
        const valores = obtenerValores();
        if (!valores) return;
        mostrarResultado(valores.num1 + valores.num2);
    });

    btnRestar.addEventListener("click", function () {
        const valores = obtenerValores();
        if (!valores) return;
        mostrarResultado(valores.num1 - valores.num2);
    });

    btnMultiplicar.addEventListener("click", function () {
        const valores = obtenerValores();
        if (!valores) return;
        mostrarResultado(valores.num1 * valores.num2);
    });

    btnDividir.addEventListener("click", function () {
        const valores = obtenerValores();
        if (!valores) return;

        if (valores.num2 === 0) {
            mostrarError("Error");
            return;
        }

        mostrarResultado(valores.num1 / valores.num2);
    });

    btnLimpiar.addEventListener("click", function () {
        n1.value = "";
        n2.value = "";
        barra.classList.remove("error");
        texto.textContent = "0";
    });

});