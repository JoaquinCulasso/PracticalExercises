function validarForma(forma) {
    //Validamos usuario
    var usuario = forma.usuario;
    if (usuario.value === "" || usuario.value === "escribir usuario") {
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    //Validamos password
    var password = forma.password;
    if (password.value === "" || password.value.length < 3) {
        alert("Debe proporcionar clave y ser mayor a 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    //Validamos tecnologia de interes
    var tecnologia = forma.tecnologia;
    var checkSeleccionado = false;

    //Revisamos si se selecciono alguna opcion
    for (var i = 0; i < tecnologia.length; i++) {
        if (tecnologia[i].checked) {
            checkSeleccionado = true;
        }
    }
    if (!checkSeleccionado) {
        alert("Debe proporcionar alguna tecnologia");
        return false;
    }
    //Validamos el genero
    var genero = forma.genero;
    var radioSeleccionado = false;

    //Revisamos si se selecciono alguna opcion
    for (var i = 0; i < genero.length; i++) {
        if (genero[i].checked) {
            radioSeleccionado = true;
        }
    }
    if (!radioSeleccionado) {
        alert("Debe proporcionar algun genero   ");
        return false;
    }

    var ocupacion = forma.ocupacion;
    if (ocupacion.value === "") {
        alert("Debe seleccionar alguna ocupación");
        return false;
    }

    //Formulario valido
    alert("Formulario valido, enviando datos");
    return true;
}