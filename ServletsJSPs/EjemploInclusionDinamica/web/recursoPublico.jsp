<%-- 
    Document   : recursoPublico
    Created on : 08-oct-2018, 20:13:42
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br>
        <br>
        Inclusión de Contenido Dinámico desde un JSP Público
        <br>
        Nombre de la aplicación: <%= request.getContextPath()%>
    </body>
</html>
