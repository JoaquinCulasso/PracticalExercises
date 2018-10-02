<%-- 
    Document   : procesaFormulario
    Created on : 02-oct-2018, 10:28:41
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesar Formulario</title>
    </head>
    <body>
        <h1>Resultado de procesar formulario</h1>
        Usuario: <%= request.getParameter("usuario")%>
        <br>
        Passwors: <%= request.getParameter("password")%>
        <br>
        <br>
        <a href="index.html">Regreasar al Inicio</a>
    </body>
</html>