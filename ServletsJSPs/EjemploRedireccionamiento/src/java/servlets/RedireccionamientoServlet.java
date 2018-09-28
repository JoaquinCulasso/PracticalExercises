package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "RedireccionamientoServlet", urlPatterns = {"/RedireccionamientoServlet"})
public class RedireccionamientoServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Ya no utilizamos el objeto PrintWriter para mandar la respuesta, utilizamos el redireccionamiento..
        String url = null;
        String tipoNavegador = request.getHeader("User-Agent");
        System.out.println("Tipo de navegador: " + tipoNavegador);
        if (tipoNavegador != null && tipoNavegador.contains("Trident")) {
            url = "http://www.microsoft.com";
        } else if (tipoNavegador != null && tipoNavegador.contains("Firefox")) {
            url = "http://www.firefox.com";
        } else if (tipoNavegador != null && tipoNavegador.contains("Chrome")) {
            url = "http://www.google.com";
        }

        //Redireccionamiento de URL selecionado
        response.sendRedirect(url);
    }
}
