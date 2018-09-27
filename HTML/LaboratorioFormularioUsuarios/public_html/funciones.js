function validaForma(forma) {
    var nombre = forma.nombre;
    if (nombre.value === "" || !isNaN(nombre.value)) {
        alert("Debe proporcionar nombre y solo de letras");
        nombre.focus();
        nombre.select();
        return false;
    }

    var apellido = forma.apellido;
    if (apellido.value === "" || !isNaN(apellido.value)) {
        alert("Debe proporcionar apellido y solo de letras");
        apellido.focus();
        apellido.select();
        return false;
    }

    var email = forma.email;
    if (email.value === "") {
        alert("Dene proporcionar email");
        email.focus();
        email.select();
        return false;
    }

    alert("Formulario Valido, enviando datos...");
    return true;
}

