function sumar() {
    //Envolvemos todo el codigo en un bloque try y catch 
    //para procesar la excepcion en caso de que haya ocurrido alguna
    try {
        //Pedimos un valor del operando a
        var a = prompt("Valor a:", "");
        //validamos el parametro a, !a revisa si la cadena esta vacia o nula
        if (!a || isNaN(a)) {
            throw new Error("valor invalido de a: " + a);
        }

        //pedimos el valor del operando b
        var b = prompt("Valor b:", "");
        //validamos el parametro a, !b revisa si la cadena esta vacia o nula
        if (!b || isNaN(b)) {
            throw new Error("valor invalido de b: " + b);
        }

        /*
         * Si no hay problema, hacemos la suma necesitamos convertir a int los parametros
         * parseInt convierne en entero, si no es entero no va a realizar la suma si no que 
         * concatena los valores
         */

        var c = parseInt(a) + parseInt(b);
        alert("La suma es: " + c);

    } catch (e) {
        alert("El error es: " + e.message);
    }
}
