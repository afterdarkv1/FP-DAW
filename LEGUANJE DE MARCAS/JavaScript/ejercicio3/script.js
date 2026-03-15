const boton = document.getElementById("btnCapturar");

boton.addEventListener("click", () => {
  const caja_texto = document.getElementById("texto").value;
  const caja_numero = document.getElementById("numero").value;
  const caja_password = document.getElementById("password").value;
  const caja_fecha = document.getElementById("fecha").value;
  const caja_hora = document.getElementById("hora").value;
  const caja_radio = document.getElementById("radio").checked;
  const caja_checkbox = document.getElementById("check").checked;
  const caja_select = document.getElementById("select").checked;

  alert(
    `Texto: ${caja_texto}\nNúmero: ${caja_numero}\nContraseña: ${caja_password}\nFecha: 
    ${caja_fecha}\nHora: ${caja_hora}\nRadio: ${caja_radio}\nCheckbox: ${caja_checkbox} \nSelect: ${caja_select}`
  );
});