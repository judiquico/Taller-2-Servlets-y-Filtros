package logic;

import com.sun.net.httpserver.HttpServer;
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
@WebServlet(name = "ProcesarLogin", urlPatterns = {"/ProcesarLogin"})
public class ProcesarLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");
            out.println("</head>");
            out.println("<body>");
            String user = req.getParameter("user");
            String pass = req.getParameter("pass");
            out.println(user.compareTo(pass) == 0 ? "Señor usuario  " + user + ", sea usted bienvenido" : "usuario o contraseña incorrecto");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
