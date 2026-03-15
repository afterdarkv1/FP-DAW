let nombre = document.getElementById("nombre");
let email = document.getElementById("email");
let edad = document.getElementById("number");
let error = document.getElementById("error");
let button = document.getElementById("button");
let form = document.getElementById("form");

form.addEventListener("submit", (e) => {

    if(nombre.value === "" || email.value === "" || edad.value === ""){
        error.style.display = "block";
            e.preventDefault();
        return false
    }
    if(nombre.value.length < 3){
        error.style.display = "block";
            e.preventDefault();
        return false;
    }
    if(!email.value.includes("@")){
        error.style.display = "block";
            e.preventDefault();
        return false;
    }
    if(Number(edad.value) < 18){
        error.style.display = "block";
            e.preventDefault();
        return false;
    }
    alert("Formulario enviado correctamente");
    return true;
});