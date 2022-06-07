function menu(){
    let menu = document.getElementById('menu-itens')
    if(menu.style.width === '0px' || menu.style.width === ''){
        menu.style.width = '320px'
    }else{
        menu.style.width = '0px'
    }
}