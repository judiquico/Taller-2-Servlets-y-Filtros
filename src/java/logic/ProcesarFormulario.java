package logic;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author Juan Quintero
 */
@WebServlet(name="ProcesarFormulario", urlPatterns = {"/ProcesarFormulario"})
public class ProcesarFormulario extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html;charset-UFT-8");
        try (PrintWriter out =resp.getWriter()){
            out.println("<!DOCTYPE html");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Prueba</title>");
            out.println("</head>");
            out.println("<body>");
            String nombre=req.getParameter("Nombre");
            String apellido=req.getParameter("Apellido");
    
            Integer edad =Integer.parseInt(req.getParameter("Edad"));
            
            out.println("Bienvenido "+ nombre+" " +apellido +", usted es" +(edad>18? "Mayor" : " Menor")+" de Edad");
            out.println("</body>");
            out.println("</html>");
        }  
    }    
}
