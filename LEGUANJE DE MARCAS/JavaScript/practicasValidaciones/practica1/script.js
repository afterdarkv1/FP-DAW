function validar()
{
let nombre=document.getElementById("txtNombre");
if(nombre.value.length>2)
{
return true;
}
else{
return false;
}
}