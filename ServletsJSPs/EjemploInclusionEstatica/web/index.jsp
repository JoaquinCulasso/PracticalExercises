<%-- 
    Document   : index
    Created on : 08-oct-2018, 18:41:33
    Author     : Joaquin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Inclusion Estaatica</title>
        <script type="text/javascript" src="recursos/funciones.js"></script>
        <link rel="stylesheet" href="recursos/estilos.css" type="text/css">
    </head>
    <body>
        <h1>Inclusion de archivos estaticos</h1>
        <!--Esto es por cada menu-->
        <br>
        <!--Menu principal-->
        <span class="noticias" align="left">
            <a href="javascript:desplegar ('noticias');">
                <img border="0" src="http://icursos.net/cursos/ServletsJSPs/Leccion14/noticias.gif">
            </a>
        </span>
        <span id="noticias" class="ocultar_menu">
            <!--Submenu-->
            <ul>
                <li><%@include file="pages/noticia1.html" %></li>
                <li><%@include file="pages/noticia2.html" %></li>
            </ul>
        </span>
        <!--Esto es por cada menu-->
        <br>
        <!--menu principal-->
        <span class="videos" align="left">
            <a href="javascript:desplegar ('videos');">
                <img border='0' src="http://icursos.net/cursos/ServletsJSPs/Leccion14/videos.gif">
            </a>
        </span>
        <span id="videos" class="ocultar_menu">
            <!--Submenu-->
            <ul>
                <li><%@include file="pages/video1.html" %></li>
            </ul>
        </span>
    </body>
</html>
