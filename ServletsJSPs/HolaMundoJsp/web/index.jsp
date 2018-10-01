<%-- 
    Document   : index
    Created on : 30-sep-2018, 21:59:18
    Author     : Joaquin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Hola Mundo JSP</title>
    </head>
    <body>
        <h1>Ejercicio de Hola Mundo con JSPs</h1>
        <!--Impresion de cadenas con diferentes tecnologias-->
        <ul>
            <li> Hola mundo con HTML 
            <li> <% out.print("Hola mundo con Scriptlets");%>
            <li> ${"Hola Mundo con Expression Lenguaje (EL)"}
            <li> <c:out value="Hola mundo con JSTL"/>
        </ul>
        <!--Algunos valores del lado del servidor-->
        <ul>
            <li> Hola: <%= new java.util.Date()%>
            <li> Nombre del Contexto de la aplicación: <%=request.getContextPath()%>
            <li> Valor del parámetro: <%=request.getParameter("x")%>
        </ul>
    </body>
</html>
