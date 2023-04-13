const envio = document.getElementById("envio");
const nome = document.getElementById("nome");
const cate = document.getElementById("cate");
const linhas = document.getElementById("linhas");


envio.addEventListener('click', () => {
    validarEntrada(nome.value, cate.value);
})

function validarEntrada(nome, cate) {
    if(nome.length && cate.length > 0) {
       alert('Jogo ' + nome +
             'e categoria ' + cate + ' adicionados');
       return true
    }
    else{
        alert('Nome ou categoria está vazio')
        return false
    }
}






