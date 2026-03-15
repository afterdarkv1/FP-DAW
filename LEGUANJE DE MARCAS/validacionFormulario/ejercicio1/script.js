function validar(){

let nombre = document.getElementById("nombre").value;
let apellido = document.getElementById("apellido").value;
let direccion = document.getElementById("direccion").value;
let edad = document.getElementById("edad").value;
let estudios = document.getElementById("estudios").value;
let acepto = document.getElementById("acepto").checked;

let password = document.getElementById("password").value;
let password2 = document.getElementById("password2").value;

let error = document.getElementById("error");

error.style.display = "none";

/* campos obligatorios */

if(nombre=="" || apellido=="" || direccion=="" || edad=="" || estudios=="" || password=="" || password2==""){
error.style.display="block";
return false;
}

/* nombre mínimo 2 */

if(nombre.length < 2){
error.style.display="block";
return false;
}

/* apellido mínimo 10 */

if(apellido.length < 10){
error.style.display="block";
return false;
}

/* mayor de edad */

if(edad < 18){
error.style.display="block";
return false;
}

/* contraseña mínimo 8 */

if(password.length < 8){
error.style.display="block";
return false;
}

/* contraseñas iguales */

if(password !== password2){
error.style.display="block";
return false;
}

/* aceptar condiciones */

if(!acepto){
error.style.display="block";
return false;
}

return true;

}