let input1 = document.getElementById("input1")
let boton1 = document.getElementById("button1")
let botoncopy1 = document.getElementById("buttoncopy1")
let input2 = document.getElementById("input2")
let boton2 = document.getElementById("button2")
let botoncopy2 = document.getElementById("buttoncopy2")

botoncopy1.addEventListener("click", () => {
  input2.value = input1.value;
})
botoncopy2.addEventListener("click", () => {
    input1.value = input2.value;
})

boton1.addEventListener("click", () => {
    input1.value = "";
})
boton2.addEventListener("click", () => {
    input2.value = "";
})


