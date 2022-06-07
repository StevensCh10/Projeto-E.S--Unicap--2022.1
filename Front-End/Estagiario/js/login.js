var user




function verificarLogin(){
    let usuario = document.getElementById('usuario').value
    let senha = document.getElementById('senha').value

    let url = `http://localhost:8080/login/${usuario}/${senha}`

    let request = new XMLHttpRequest()
    request.open("GET", url, false)
    request.send()
    
    if(request.responseText === ''){
        loginErrado()    
    }else{
        loginCorreto(request.responseText)
    }
}

function loginErrado(){

}

function loginCorreto(json){
    user = JSON.parse(json)
    
    if(user.cargo === 'Coordenador'){
        window.location.href = "http://127.0.0.1:5500/Estagiario/html/coordenador/coordenador.html"
    }else{
        window.location.href = "http://127.0.0.1:5500/Estagiario/html/estagiario/estagiario.html"
    }
}

function preencherCoordenador(user){
    let nome = document.getElementById('nome')
    let login = document.getElementById('login')
    let senha = document.getElementById('senha')
    let email = document.getElementById('email')
    let endereco = document.getElementById('endereco')
    let idade = document.getElementById('idade')
    let telefone = document.getElementById('telefone')

    nome.innerHTML = `Nome: ${user.nome}`
    login.innerHTML = `Login: ${user.login}`
    senha.innerHTML = `Senha: ${user.senha}`
    email.innerHTML = `Email: ${user.email}`
    endereco.innerHTML = `Endereço: ${user.endereco}`
    idade.innerHTML = `Idade: ${user.idade}`
    telefone.innerHTML = `Telefone: ${user.telefone}`
}
