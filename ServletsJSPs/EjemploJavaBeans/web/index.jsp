<%-- 
    Document   : index
    Created on : 08-oct-2018, 21:51:59
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Java Beans</title>
    </head>
    <body>
        <h1>Ejemplo JavaBeans</h1>
        <!--JSP para modificar valores-->
        <a href="setterJsp.jsp">Modificar valores del JavaBeans</a>
        <br>
        <!--JSP para leer valores del JavaBeans-->
        <a href="getterJsp.jsp">Leer valores del JavaBeans</a>
        <br>
        <br>
        <!--JSP para recuperar parametros de un formulario-->
        <!--Formulario 1-->
        Formulario 1:
        <form name="form1" action="setterParamJsp.jsp">
            Base: <input type="text" name="baseParam">
            <br>
            Altura: <input type="text" name="alturaParam">
            <input type="submit" value="Enviar">
        </form>

        <br>
        <!--Formulario 2-->
        Formulario 2:
        <form name="form2" action="setterAllParamsJsp.jsp">
            Base: <input type="text" name="base">
            <br>
            Altura: <input type="text" name="altura">
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>