<%-- 
    Document   : index
    Created on : 02-oct-2018, 11:33:37
    Author     : Joaquin
--%>
<%--Agregamos una declaración--%>
<%!
    //Declaramos una variable con su metodo get
    private String usuario = "Alberto";

    public String getUSuario() {
        return this.usuario;
    }
    //Declaramos un contador de visitas
    private int contadorVisitas = 1;
%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
        <title>Declaraciones JSP</title>
    </head>
    <body>
        <h1>Uso de Declaraciones</h1>
        Usuario por medio del atributo: <%= this.usuario%>
        <br>
        Usuario por medio del metodo: <%= this.getUSuario()%>
        <br>
        Contador de visitas desde que se reinicio el servidor:
        <%= this.contadorVisitas++%>
    </body>
</html>