<%-- 
    Document   : recursoPrivado
    Created on : 08-oct-2018, 20:14:38
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String colorFondo = request.getParameter("colorFondo");
    if (colorFondo == null || colorFondo.trim().equals("")) {
        colorFondo = "white";//valor por default
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="<%=colorFondo%>">
        Despliegue del contenido desde un JSP privado en WEB-INF
    </body>
</html>
