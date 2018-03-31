package Servlet;

import Armas.Lanza;
import Escudos.GilGalad;
import Logica.Arma;
import Logica.CapturarDatos;
import Logica.Escudo;
import Logica.Personaje;
import Logica.Raza;
import Razas.Elfo;
import Razas.Hombre;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //Capturando los datos desde el formulario
        String nombre= request.getParameter("txtnombre");
        String nombreRaza= request.getParameter("cbbraza");
        String nombreArma= request.getParameter("cbbarma");
        String nombreEscudo= request.getParameter("cbbescudo");
        //Capturando los datos, dependiendo de los ingresados por el usuario
        CapturarDatos datos= new CapturarDatos();
        Arma armaElegida= datos.capturarArma(nombreArma);
        Escudo escudoElegino= datos.capturarEscudo(nombreEscudo);
        Raza razaElegida= datos.capturarRaza(nombreRaza);
        datos.capturarRaza(nombreRaza);
        //Creando el personaje
        Raza personaje1 = new Personaje(nombre, razaElegida, armaElegida, escudoElegino);
        //Sustitución de Liskov
        Raza personaje2 = new Personaje("Pepe", new Elfo(), new Lanza(), new GilGalad());
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<link rel='stylesheet' href='Estilo2.css' type='text/css'>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Personaje</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form id='frmMain' action='index.html' accept-charset='UTF-8'>;");
            //Llamamos los datos desde un solo lugar
            out.println(personaje1.descripcionRaza());
//            out.println("	<div id='col1' style='float: left; width:500;  margin-left: 200px;'>");
//            out.println("        <table border=1>");
//            out.println("            <tr>");
//            out.println("                    <td colspan='3'>Pepe grillo</td>");
//            out.println("            </tr>");
//            out.println("            <tr>");
//            out.println("                    <td>Personaje</td>");
//            out.println("                    <td>Arma principal</td>");
//            out.println("                    <td>Escudo</td>");
//            out.println("            </tr>");
//            out.println("            <tr>");
//            out.println("                    <td>nombre</td>");
//            out.println("                    <td>Arma principal</td>");
//            out.println("                    <td>Escudo</td>");
//            out.println("            </tr>");
//            out.println("        </table>");
//            out.println("    </div>");
            out.println("<input type='submit' value='Regresar' style='margin: 0 auto;'>");
            out.println("</form>;");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
    }// </editor-fold>

}
