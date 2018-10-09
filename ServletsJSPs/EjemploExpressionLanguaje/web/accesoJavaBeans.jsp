<%-- 
    Document   : accesoJavaBeans
    Created on : 09-oct-2018, 0:16:50
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso a JavaBeans</title>
    </head>
    <body>
        <h1>Acceso a JavaBeans</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo"/>

        <!--asignamos los valores del formulario al JavaBean-->
        <jsp:setProperty name="rectangulo" property="*"/>
        <br>
        Valor base: ${rectangulo.base}
        <br>
        Valor altura: ${rectangulo.altura}
        <br>
        Valor area: ${rectangulo.area}
        <br>
        <!--No es recomendable, pero con fin practico-->
        Calculo del Area: ${rectangulo.base * rectangulo.altura}
        <br>
        <br>
        <a href="index.jsp">Regresar al Inicio</a>
    </body>
</html>
