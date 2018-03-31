

//Función que cambia la imagen dependiendo del escudo escogido
function comboEscudos(){
    //Capturamos el valor seleccionado
    var opcionseleccionada= document.getElementById("cbbescudo").value;
    //Lo comparamos
    if(opcionseleccionada=="Easterling")
        document.getElementById('imgEscudo').src = "http://3.bp.blogspot.com/-VopCwNpbC28/TrAoWVXceDI/AAAAAAAAAVU/JBr5aFIN44E/s1600/shield44.jpg";
    else if(opcionseleccionada=="GilGalad")
        document.getElementById('imgEscudo').src = "http://4.bp.blogspot.com/-EYyoKOLZhKE/TrAnEcaMokI/AAAAAAAAAUk/ygN_d-BYIP8/s1600/shield11.jpg";
    else if(opcionseleccionada=="GuardiaRealRohirrim")
        document.getElementById('imgEscudo').src = "http://1.bp.blogspot.com/-Hbrnsg8qvnQ/TrAnpmkA_HI/AAAAAAAAAU0/U8bPJ5CwqWE/s1600/shield22.jpg";
    else if(opcionseleccionada=="Numenoriano")
        document.getElementById('imgEscudo').src = "http://4.bp.blogspot.com/-O_xbDnmu3fg/TrAoUxBw19I/AAAAAAAAAVM/wj-M13wLL9c/s1600/shield33.jpg";
}


//Función que cambia el gif dependiendo de la raza escogida
function changecbbRaza(){
    //Capturamos el valor seleccionado
    var opcionseleccionada= document.getElementById("cbbraza").value;
    //Lo comparamos
    if(opcionseleccionada=="Elfo")
        document.getElementById('gifRaza').src = "https://media.giphy.com/media/qKHsjE26sjKi4/giphy.gif";
    else if(opcionseleccionada=="Enano")
        document.getElementById('gifRaza').src = "https://media.giphy.com/media/9ayZUOG5AZ7Qk/giphy.gif";
    else if(opcionseleccionada=="Hobbit")
        document.getElementById('gifRaza').src = "https://media.giphy.com/media/1rlIAa3dAb3os/giphy.gif";
    else if(opcionseleccionada=="Hombre")
        document.getElementById('gifRaza').src = "https://media.giphy.com/media/RGMlNY9THG5So/giphy.gif";
    else if(opcionseleccionada=="Mago")
        document.getElementById('gifRaza').src = "https://media.giphy.com/media/ZQCRCYU6t8HmM/giphy.gif";
    else if(opcionseleccionada=="Orco")
        document.getElementById('gifRaza').src = "https://media.giphy.com/media/8v3WIOCM9Qy08/giphy.gif";
}

//Función que cambia la imagen dependiendo del arma escogida
function changecbbArma(){
    //Capturamos el valor seleccionado
    var opcionseleccionada= document.getElementById("cbbarma").value;
    //Lo comparamos
    if(opcionseleccionada=="Arco")
        document.getElementById('imgArma').src = "https://i.pinimg.com/originals/b5/12/58/b51258d5f59626270894bed1e56afe30.png";
    else if(opcionseleccionada=="Espada")
        document.getElementById('imgArma').src = "https://i.pinimg.com/originals/8b/5a/95/8b5a9599bf176438bd8f45c58173c866.png";
    else if(opcionseleccionada=="Hacha")
        document.getElementById('imgArma').src = "https://i.pinimg.com/originals/ff/87/86/ff87868e094448e61e1177a94522e855.png";
    else if(opcionseleccionada=="Lanza")
        document.getElementById('imgArma').src = "https://vignette.wikia.nocookie.net/elderscrolls/images/2/2a/LanzaMisericordiaAmarga.png/revision/latest?cb=20130704095439&path-prefix=es";
    else if(opcionseleccionada=="Martillo")
        document.getElementById('imgArma').src = "https://vignette.wikia.nocookie.net/labibliotecadelviejomundo/images/2/21/Martillo_Enano_03_Warhammer_Online_-_copia.png/revision/latest?cb=20151125175814&path-prefix=es";
}