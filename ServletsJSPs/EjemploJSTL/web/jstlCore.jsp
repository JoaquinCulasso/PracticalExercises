<%-- 
    Document   : jstlCore
    Created on : 09-oct-2018, 21:59:08
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--Con esta directiva importamos la libreria de core JSTL-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core</h1>

        <!--Manipulación Variables-->
        <c:set var="nombre" value="Ernesto" />
        Variable nombre: <c:out value="${nombre}" />

        <br>
        <br>

        Variable con código html:
        <c:out value="<h1>Hola</h1>" escapeXml="true" />

        <br>
        <br>

        <!--Condigo condicionado, uso del if-->
        <c:set var="bandera" value="true" />

        <c:if test="${bandera}" >
            La bandera es verdadera
        </c:if>

        <br>

        <!--codigo condicionado, similar a swicth-->
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br>
                    Opción 1 proporcionada
                    <br>
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br>
                    Opción 2 proporcionada
                    <br>
                </c:when>
                <c:otherwise>
                    <br>
                    Opción proporcionada desconocida: ${param.opcion}
                    <br>
                </c:otherwise>
            </c:choose>
        </c:if>

        <!--Iteración de un arreglo-->
        <%
            //Uso de Scriptlet
            //Creamos el arreglo con un scriplet (aunque no es una buena practica)
            String[] nombres = {"Claudia", "Pedro", "Carlos", "Ana"};
            //Compartimos el arreglo de nombres
            //en el alcance (scope) de request
            request.setAttribute("nombres", nombres);
        %>
        <br>
        Lista de nombres en el arreglo:
        <br>
        <ul>
            <c:forEach varStatus="status" var="personas" items="${nombres}">
                <li>${status.count} - Nombre: ${personas}</li>
                </c:forEach>
        </ul>

        <br>
        <a href="index.jsp">Regresar al Inicio</a>

    </body>
</html>
