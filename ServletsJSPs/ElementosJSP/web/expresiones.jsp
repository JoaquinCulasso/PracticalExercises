<%-- 
    Document   : expresiones
    Created on : 02-oct-2018, 10:28:15
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP de Expresiones</title>
    </head>
    <body>
        <h1>JSP de Expresiones</h1>
        Concatenación: <%= "Saludos" + "JSP"%>
        <br>
        Operación Matemática: <%= 2 * 3 / 2%>
        <br>
        Session id: <%= session.getId()%>
        <br>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
