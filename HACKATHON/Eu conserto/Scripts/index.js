var tipoUsuario = document.getElementById("usuario");
var divTiposServicos = document.getElementById("lista");

tipoUsuario.addEventListener("change", ()=>{

    if (tipoUsuario.value === "prestador") {
        divTiposServicos.style.display = "block";
      } else {
        divTiposServicos.style.display = "none";
      }

})

