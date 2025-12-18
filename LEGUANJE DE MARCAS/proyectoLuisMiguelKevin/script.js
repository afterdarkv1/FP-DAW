document.addEventListener("DOMContentLoaded", () => {
  const botones = document.querySelectorAll(".comprar");

  botones.forEach(boton => {
    boton.addEventListener("click", () => {
      Swal.fire({
        title: "¡Compra realizada!",
        text: "Lo has comprado correctamente",
        icon: "success",
        confirmButtonText: "Aceptar",
        confirmButtonColor: "#2c2c2c",
        background: "#ffffff",
        color: "#222"
      });
    });
  });
});