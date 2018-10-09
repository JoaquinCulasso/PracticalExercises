<%-- 
    Document   : getterJsp
    Created on : 08-oct-2018, 21:54:22
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee valores del JavaBeans</title>
    </head>
    <body>
        <h1>JSP que lee valores del JavaBeans</h1>
        <!--Declaramos el JavaBeans a utilizar si ya existe un bean en la sesion
        llamado "rectangulo", regresa el mismo objeto y no crea uno nuevo-->
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>

        <!--Recuperamos los valores y los desplegamo-->
        <br>
        Valor base: <jsp:getProperty name="rectangulo" property="base"/>
        <br>
        Valor altura: <jsp:getProperty name="rectangulo" property="altura"/>
        <br>
        <!--En este caso, no importa que la propiedad no exista en el JavaBean, solo
        con tener un metodo llamado getArea() es posible simular una propiedad-->
        Valor área: <jsp:getProperty name="rectangulo" property="area"/>
        <br>
        <br>
        <a href="index.jsp">Regresar al Inicio</a>
    </body>
</html>
