lista = []
let total = 0
let mensaje = document.getElementById("mensaje")
let cantidadTotal = document.getElementById("total")
document.getElementById("formulario").addEventListener("submit", function(event) {
  
let descripcion = document.getElementById("descripcion").value;
let cantidad = document.getElementById("cantidad").value;
let opciones = document.getElementById("opciones").value;
let error = document.getElementById("error");

error.style.display = "none";
    
if(descripcion=="" || cantidad=="" || opciones==""){
error.style.display="block";
event.preventDefault(); 
return false;
}



if(cantidad <= 0){
error.style.display="block";
event.preventDefault(); 
return false;
}
else {
    alert("formulario enviado correctamente")
    lista.push(cantidad)
    lista.push(descripcion)
    lista.push(opciones)

    total += cantidad
  

    return true;
}
});

lista.forEach(element => {
    mensaje.textContent = element + " ";
});

mensaje.textContent = total;



