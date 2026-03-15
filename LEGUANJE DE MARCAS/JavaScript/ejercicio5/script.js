let opciones = document.querySelectorAll("#menu li");
let indice = 0;

const up = document.getElementById("up");
const down = document.getElementById("down");
const calcular = document.getElementById("calcular");

function actualizarMenu(){

opciones.forEach(op => op.classList.remove("active"));
opciones[indice].classList.add("active");

}

up.addEventListener("click", () => {

if(indice > 0){
indice--;
}

actualizarMenu();

});

down.addEventListener("click", () => {

if(indice < opciones.length -1){
indice++;
}

actualizarMenu();

});

calcular.addEventListener("click", () => {

let numero = parseInt(document.getElementById("numero").value);
let resultado = document.getElementById("resultado");

if(numero <= 0 || numero > 100 || isNaN(numero)){
resultado.value = "Error: el número debe ser > 0 y <= 100";
return;
}

switch(indice){

case 0:
resultado.value = (numero % 2 === 0) ? "El número es PAR" : "No es PAR";
break;

case 1:
resultado.value = (numero % 2 !== 0) ? "El número es IMPAR" : "No es IMPAR";
break;

case 2:

let primo = true;

for(let i=2; i<numero; i++){
if(numero % i === 0){
primo = false;
break;
}
}

resultado.value = primo ? "El número es PRIMO" : "No es PRIMO";

break;

case 3:

let divisores = [];

for(let i=1;i<=numero;i++){
if(numero % i === 0){
divisores.push(i);
}
}

resultado.value = "Divisores: " + divisores.join(", ");

break;

}

});