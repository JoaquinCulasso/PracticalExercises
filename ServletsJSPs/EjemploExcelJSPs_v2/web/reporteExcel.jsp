<%-- 
    Document   : reporteExcel
    Created on : 06-oct-2018, 19:12:21
    Author     : Joaquin
--%>
<%@page errorPage="/WEB-INF/manejoErrores.jsp" %>
<%@page import="utilerias.Conversiones, java.util.Date"%>
<%@page contentType="aplicattion/vnd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline; filename= " + nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha Inicio</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos de la sintaxis basica de java</td>
                <td><%= Conversiones.format("500")%> </td>
            </tr>
            <tr>
                <td>2. Programacion con java</td>
                <td>Pondremos en práctica conceptos de la programación orientada objetos</td>
                <td><%= Conversiones.format(new Date())%></td>
            </tr>
        </table>
    </body>
</html>