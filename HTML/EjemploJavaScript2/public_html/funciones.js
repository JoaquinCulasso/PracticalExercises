/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.onload = iniciaDatos;
/*
 * Función que se llama 
 * al cargar la pagina HTML
 */
function iniciaDatos() {
    document.getElementById("link").onclick = validaSalir;
    document.getElementById("linkSearch").onclick = busqueda;
}
/*
 * Función que valida si el usuario quiere salir del sitio o no
 */
function validaSalir() {
    if (confirm("desea salir del sitio?")) {
        alert("nos vamos a google");
        return true; //regresamos verdadero para salir
    } else {
        alert("Nos quedamos en el sitio");
        return false;//regresamos falso para quedarnos, rompemos el flujo..F
    }
}

/*
 * Función que pide una cadena a buscar en google
 */
function busqueda() {
    //con al función prompt capturamos información del usuario
    var respuesta = prompt("Escribe la cadena a buscar:", "");
    //si hubo una respuesta concatenamos la cadena a buscar al link de google
    if (respuesta) {
        alert("Tu respuesta fue: " + respuesta);
        //el operador this nos sirve para referenciar al elemento que provoco
        //el evento, en este caso el elemento identificador "linkSearch" y 
        //concatenamos la respuesta como un parametro de una petición get
        var nuevoLink = this + "search?q=" + respuesta;
        alert("Nuevo link: " + nuevoLink);
        //redireccionamos el link
        window.location = nuevoLink;
        //regresamos false, si no nos lleva el link originalmente
        //registrado  en el elemento linkSearch
        return false;
    } else {
        alert("No proporcionaste ninguna cadena a buscar");
        return false;
    }
}





