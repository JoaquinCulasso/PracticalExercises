package servlets;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet(name = "SesionesServlet", urlPatterns = {"/SesionesServlet"})
public class SesionesServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession sesion = request.getSession();
        String titulo = null;

        //Pedimos el atributo y verificamos si existe
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");

        //Si es igual a nulo, quiere decir que es la primera vez que accedemos al recurso
        if (contadorVisitas == null) {
            contadorVisitas = new Integer(1);
            titulo = "Bienvenido por primera vez...";
        } else {
            //Si es distinto de nulo, incrementamos el contador
            titulo = "Bienvenido nuevamente...";
            contadorVisitas += 1;
        }

        //En cualquier caso, agregamos el valor del contador a la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);

        //Mostramos los valores en el cliente
        PrintWriter out = response.getWriter();

        out.println("Titúlo: " + titulo);
        out.println("<br>");
        out.println("Nro de accesos al recurso: " + contadorVisitas);
        out.println("<br>");
        out.println("ID de las sesión: " + sesion.getId());
    }
}
