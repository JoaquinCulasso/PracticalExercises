package servlets;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet(name = "ContadorVisitasServlet", urlPatterns = {"/ContadorVisitasServlet"})
public class ContadorVisitasServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Declaramos la variable contador
        int contador = 0;

        //Si existe, obtenemos el contador de visitas actual
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cooky : cookies) {
                if (cooky.getName().equals("contadorVisitas")) {
                    try {
                        //Obetenemos el valor del contador visitas actual
                        contador = Integer.parseInt(cooky.getValue());
                    } catch (NumberFormatException e) {
                        //En caso de error, reiniciamos el contador de visitas
                        contador = 0;
                    }
                }
            }//cerramos for
        }//cerrramos if

        //Incrementamos el contador de visitas y lo agregamos al cooky en la respuesta
        contador++;
        Cookie cookie = new Cookie("contadorVisitas", Integer.toString(contador));
        //La cookie se almacenara en el cliente por 1 hora (3600seg)
        cookie.setMaxAge(3600);
        response.addCookie(cookie);

        //Mandamos el mensaje al navegador
        PrintWriter out = response.getWriter();
        out.println("Contador de visitas de cada cliente: " + contador);
    }
}
