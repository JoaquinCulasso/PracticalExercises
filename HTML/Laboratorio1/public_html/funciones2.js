var usuarios = new Array();
var contadorUsuarios = 0;

function agregarUsuario(entrada) {
    var usuario = entrada.value;
    var x = document.getElementById("listado").innerHTML += usuario + "<br/>";
    usuarios[contadorUsuarios++] = usuario;
    //Limpiamos la caja de texto y la seleccionamos
    entrada.value = "";
    entrada.focus();
}

function buscarUsuario(entrada) {
    for (var i = 0; i < usuarios.length; i++) {
        if (usuarios[i] == entrada.value) {
            var x = document.getElementById("busqueda").innerHTML = "El usuario tiene la posición " + ++i;
            break;
        } else {
            var x = document.getElementById("busqueda").innerHTML = "No existe usuario";
        }
    }
    //Limpiamos la caja de texto y la seleccionamos
    entrada.value = "";
    entrada.focus();
}

