
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
            int legajo=Integer.parseInt(request.getParameter("legajo"));
            
            GestorBD gestorBD= new GestorBD();
            
            if (gestorBD.registrar(legajo, nombre, apellido, promedio)){
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
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
