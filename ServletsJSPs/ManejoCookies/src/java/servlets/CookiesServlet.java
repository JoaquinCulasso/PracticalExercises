package servlets;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet(name = "CookiesServlet", urlPatterns = {"/CookiesServlet"})
public class CookiesServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Suponemos que el usuario esta visitando por primera vez el sitio
        boolean nuevoUsuario = true;

        //Obtenemos todas las cookies
        Cookie[] cookies = request.getCookies();

        //Buscamos si ya existe una cookie creada con anterioridad llamada visitanteRecurrente
        if (cookies != null) {
            for (Cookie cooky : cookies) {
                if (cooky.getName().equals("visitanteRecurrente") && cooky.getValue().equals("si")) {
                    //En caso de que ya exista una cookie indicando de que ya existe un usuario registrado
                    //con aterioridad ponemos la bandera en falso y salimos del ciclo
                    nuevoUsuario = false;
                    break;
                }
            }//fin del for
        }//fin del if

        //Revisamos si el usuario es nuevo visitante
        String mensaje = null;
        if (nuevoUsuario) {
            //En caso de ser un usuario es un nuevo creamos el objeto Cookie
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            //Agregamos la cookie en la respuesta
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio";
        } else {
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }
        //Escribimos la salida
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //Omitimos código HTML para simplificar el código
        out.println("Mensaje: " + mensaje);
    }
}
