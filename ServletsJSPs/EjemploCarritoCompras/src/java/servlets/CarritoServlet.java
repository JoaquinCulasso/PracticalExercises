package servlets;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("Metodo doGet no contemplado");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        //Procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");

        //Creamos o recuperamos la sesion http
        HttpSession sesion = request.getSession();

        //Recuperamos la lista de articulos previos si es que existe en la sesion
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //Verificamos si la lista de articulos existe
        if (articulos == null) {
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        //Ya tenemos la lista de articulos lista para trabajar
        //Agregamos el nuevo articulo
        //y lo agregamos por paso de referencia a la lista articulos
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try (PrintWriter out = response.getWriter()) {
            //Mostramos los articulos totales al cliente
            out.println("<h1>Lista de Artículos</h1>");
            out.println("<br>");
            //Iteramos todos los articulos, incluyendo el nuevo
            for (String articulo : articulos) {
                out.println("<li>" + articulo + "</li>");
            }
            //Agregamos un link para regresar al inicio
            out.println("<br>");
            out.println("<a href='/EjemploCarritoCompras'>Link para regresar</a>");
        }
    }
}
