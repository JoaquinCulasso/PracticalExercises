<%-- 
    Document   : index
    Created on : 08-oct-2018, 20:13:11
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de Inclusión Dinámica</title>
    </head>
    <body>
        <br>
        <jsp:include page="WEB-INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo" value="yellow"/>
        </jsp:include>
        
        <br> 
        <jsp:include page="recursoPublico.jsp"/>
    </body>
</html>
