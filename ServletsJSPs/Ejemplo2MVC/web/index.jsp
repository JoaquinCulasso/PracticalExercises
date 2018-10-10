<%-- 
    Document   : index
    Created on : 10-oct-2018, 2:12:33
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo MVC 2</title>
    </head>
    <body>
        <h1>Ejemplo MVC 2</h1>

        <div style="color:red">${mensaje}</div> <!--informacion que nos comparte el controlador-->
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador">
            Link al servlet controlador sin parametros</a>

        <br><br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregaVariables">
            Link al servlet controlador para agregar las variables</a>

        <br><br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
            Link al servlet controlador para listar las variables</a>

    </body>
</html>
