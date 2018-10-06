<%-- 
    Document   : manejoErrores
    Created on : 06-oct-2018, 19:23:37
    Author     : Joaquin
--%>
<%@page isErrorPage="true"%>
<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Manejo de Errores</title>
        <meta http-equiv="Content-Type" content="html/text; charset=UTF-8" >
        <script type="text/javascript" src="<%= request.getContextPath()%>/recursos/funciones.js"></script>
    </head>
    <body>
        <h1>Manejo de Errores</h1>
        <br>
        <br>
        Ocurrió un error:
        <%= exception.getMessage()%>
        <br>
        <a href="<%= request.getContextPath()%>/index.html">Regresar al Inicio</a>
        <br>
        <br>
        <a href="#" onclick="cambio('mensaje1')">Ver Detalle</a>
        <div id="mensaje1" style="position: relative; visibility: hidden">
            <pre>
                <% exception.printStackTrace(new PrintWriter(out));%>
            </pre>
        </div>
    </body>
</html>