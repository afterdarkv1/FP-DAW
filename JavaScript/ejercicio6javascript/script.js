let numeroSecreto = Math.floor(Math.random() * 100) + 1;
let intentos = 0;
let maxIntentos = 10;
let lista = [];

function jugar(){

    if(intentos >= maxIntentos) return;

    let numero = Number(document.getElementById("numeroUsuario").value);

    if(numero < 1 || numero > 100){
        alert("Introduce número entre 1 y 100");
        return;
    }

    intentos++;
    lista.push(numero);

    document.getElementById("listaIntentos").textContent = lista.join(" ");

    let mensaje = document.getElementById("mensaje");
    mensaje.className = "";

    if(numero > numeroSecreto){
        mensaje.textContent = numero + " ES MAYOR";
        mensaje.classList.add("mayor");
    }
    else if(numero < numeroSecreto){
        mensaje.textContent = numero + " ES MENOR";
        mensaje.classList.add("menor");
    }
    else{
        mensaje.textContent = "HAS ACERTADO";
        mensaje.classList.add("acierto");
        terminarJuego();
    }

    // Marcar X
    let fila = document.getElementById("filaX").children;
    fila[intentos-1].textContent = "X";
    fila[intentos-1].classList.add("usado");

    if(intentos === maxIntentos && numero !== numeroSecreto){
        mensaje.textContent = "HAS PERDIDO. Era " + numeroSecreto;
        mensaje.className = "mayor";
        terminarJuego();
    }

    document.getElementById("numeroUsuario").value = "";
}

function terminarJuego(){
    document.getElementById("numeroUsuario").disabled = true;
}
