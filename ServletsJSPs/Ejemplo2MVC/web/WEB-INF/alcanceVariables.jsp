<%-- 
    Document   : alcanceVariables
    Created on : 10-oct-2018, 2:15:00
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance de Variables</title>
    </head>
    <body>
        <!--Todas estas variables las vamos a recibir de nuestro Servlet Controlador
        y en caso de no tenerlas aparecen en blanco-->
        <h1>Alcance de Variables</h1>
        <br>
        Variable Request:
        Base: ${rectanguloRequest.base}
        Altura: ${rectanguloRequest.altura}
        Area: ${rectanguloRequest.area}

        <br><br>
        Variable Session:
        Base: ${rectanguloSession.base}
        Altura: ${rectanguloSession.altura}
        Area: ${rectanguloSession.area }

        <br><br>
        Variable Application
        Base: ${rectanguloApplication.base}
        Altura ${rectanguloApplication.altura}
        Area ${rectanguloApplication.area}

        <br><br>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al Inicio</a>
    </body>
</html>
