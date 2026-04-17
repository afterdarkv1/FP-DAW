lista = []
let total = 0
let mensaje = document.getElementById("mensaje")
let cantidadTotal = document.getElementById("total")
let formulario = document.getElementById("formulario")
formulario.addEventListener("submit", function(event) {
event.preventDefault(); 
let descripcion = document.getElementById("descripcion").value;
let cantidad = parseFloat(document.getElementById("cantidad").value);
let opciones = document.getElementById("opciones").value;
let error = document.getElementById("error");

error.style.display = "none";
    
if(descripcion=="" || isNaN(cantidad) || opciones==""){
error.style.display="block";
return;
}



if(cantidad <= 0){
error.style.display="block";
return;
}

    alert("formulario enviado correctamente")
    lista.push({ 
        cantidad: cantidad,
        descripcion: descripcion,
        opciones: opciones
    });
    mensaje.innerHTML= "";
    total += cantidad;
    formulario.reset();



    lista.forEach(element => {
    mensaje.innerHTML += `<li>${element.cantidad} ${element.descripcion} ${element.opciones}</li>`;
   
});
 cantidadTotal.textContent = "Total: " + total;
});



