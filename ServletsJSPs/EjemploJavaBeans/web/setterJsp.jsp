<%-- 
    Document   : setterJsp
    Created on : 08-oct-2018, 21:54:42
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que modifica a un JavaBeans</title>
    </head>
    <body>
        <h1>JSP que modifica a un JavaBeans</h1>
        <!--Declaramos el JavaBeans a utilizar-->
        <!--El alcance de la variable es de tipo session-->
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>


        Modificamos los atributos:
        <br>
        <br>
        <!--Scriptlets-->
        <%
            //Valores en codigo duro
            int baseValor = 5;
            int alturaValor = 10;
        %>
        <!--Asignamos el valor de la base al rectangulo-->
        <jsp:setProperty name="rectangulo" property="base" value="<%= baseValor%>"/>
        Nuevo valor base: <%= baseValor%>

        <br>

        <!--Asignamos el valor de la altura al rectangulo-->
        <jsp:setProperty name="rectangulo" property="altura" value="<%= alturaValor%>"/>
        Nuevo valor altura: <%= alturaValor%>

        <br>
        <br>

        <a href="index.jsp">Regresar al Inicio  </a>
    </body>
</html>
