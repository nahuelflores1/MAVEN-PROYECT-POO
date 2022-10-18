
package controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
@WebServlet(name = "registro", urlPatterns = ("/registro"))
public class registro extends HttpServlet {
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()) {
            String nombre=request.getParameter("nombre");
            String apellido=request.getParameter("apellido");
            Double promedio=Double.parseDouble(request.getParameter("promedio"));
            
            GestorBD gestorBD= new GestorBD();
            
            if (gestorBD.registrar(nombre, apellido, promedio)){
                Alumno al=new Alumno(nombre,apellido,promedio);
                request.setAttribute("atribAlumn", al);
                request.getRequestDispatcher("/muestraDatos.jsp")
                .forward(request, response);
            }else{
            request.getRequestDispatcher("/errorEnRegistro.jsp")
.forward(request, response);         
            }
        }
    }
}
