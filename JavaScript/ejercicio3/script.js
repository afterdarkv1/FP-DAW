document.addEventListener("DOMContentLoaded", function () {

    const boton = document.getElementById("btnCapturar");

    boton.addEventListener("click", function () {

        const texto = document.getElementById("texto").value;
        const numero = document.getElementById("numero").value;
        const password = document.getElementById("password").value;
        const fecha = document.getElementById("fecha").value;
        const hora = document.getElementById("hora").value;

        const radio = document.querySelector('input[name="radio"]:checked').value;
        const check = document.getElementById("check").checked;
        const select = document.getElementById("select").value;

        alert(
            "TEXTO: " + texto + "\n" +
            "NUMERO: " + numero + "\n" +
            "PASSWORD: " + password + "\n" +
            "FECHA: " + fecha + "\n" +
            "HORA: " + hora + "\n" +
            "RADIO: " + radio + "\n" +
            "CHECKBOX: " + check + "\n" +
            "SELECT: " + select
        );

    });

});