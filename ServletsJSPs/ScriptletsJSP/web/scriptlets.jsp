<%-- 
    Document   : scriptlets
    Created on : 02-oct-2018, 11:03:24
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con ScriptletsPage</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <!--Scriptlets para enviar informacion al navegador-->
        <%
            out.println("Saludos dessde un scriptlets");
        %>
        <br>
        <!--Scriptlets para manipular los objetos implicitos-->
        <%
            String nombreAplicacion = request.getContextPath();
            out.println("nombreAplicacion: " + nombreAplicacion);
        %>
        <br>
        <!--Scriptlets con codigo condicionado-->
        <%
            if (session != null && session.isNew()) {
        %>
        la sesion SI es nueva
        <%
        } else if (session != null) {
        %>
        la sesion NO es nueva
        <%
            }
        %>
    </body>
</html>