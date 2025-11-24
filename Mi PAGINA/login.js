document.getElementById("loginForm").addEventListener("submit", function(e){
  e.preventDefault();

  let usuario = document.getElementById("username").value.trim();
  let clave = document.getElementById("password").value.trim();
  let mensaje = document.getElementById("error-msg");
  let modal = document.getElementById("loginModal");

  const USER = "admin";
  const PASS = "1234";

  if (usuario === "" || clave === "") {
    mensaje.style.color = "red";
    mensaje.textContent = "Por favor completa todos los campos";
    return;
  }

  if (usuario !== USER || clave !== PASS) {
    mensaje.style.color = "red";
    mensaje.textContent = "Usuario o contraseña incorrectos";
    return;
  }

  // Si todo está correcto
  mensaje.style.color = "green";
  mensaje.textContent = "Ingresando...";

  setTimeout(() => {
    modal.style.display = "none"; // Oculta el login
  }, 1000);
});
