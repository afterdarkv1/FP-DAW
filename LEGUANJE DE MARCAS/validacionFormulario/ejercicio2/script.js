function mostrarSolicitud(){

let asunto = document.getElementById("asunto").value;
let caja = document.getElementById("solicitudBox");

if(asunto === "Estado de una solicitud"){
caja.style.display = "block";
}else{
caja.style.display = "none";
}

}


function validar(){

let nombre = document.getElementById("nombre").value;
let email = document.getElementById("email").value;
let asunto = document.getElementById("asunto").value;
let mensaje = document.getElementById("mensaje").value;
let numSolicitud = document.getElementById("numSolicitud").value;

if(nombre=="" || email=="" || asunto=="" || mensaje==""){
alert("Todos los campos son obligatorios");
return false;
}

if(asunto === "Estado de una solicitud" && numSolicitud==""){
alert("Debes introducir el número de solicitud");
return false;
}

return true;

}
