package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "FormularioServlet", urlPatterns = "/FormularioServlet")
public class FormularioServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        //Simulador de valores
        String usuarioCorrecto = "Juan";
        String passCorrecto = "123";
        
        String pUsuario = request.getParameter("usuario");
        String pPassword = request.getParameter("password");
        
        if (usuarioCorrecto.equals(pUsuario) && passCorrecto.equals(pPassword)) {
            out.println("<h1>");
            out.println("Datos Correctos");
            out.println("<br> Usuario: " + pUsuario);
            out.println("<br> Password: " + pPassword);
            out.println("</h1>");
        } else {
            //Respondemos al navegador con un codigo de estado no autorizado
            response.sendError(response.SC_UNAUTHORIZED, "Las credencias son incorrectas");
        }
        
        //Lista de codigo de error
        //http://docstore.mik.ua/orelly/java-ent/servlet/appc_01.htm
        
        out.close();
    }
}
