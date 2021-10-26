
package Unidade2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rafael
 */
@WebServlet(name = "PrimeiroServlet", urlPatterns = {"/PrimeiroServlet"})
public class PrimeiroServlet extends HttpServlet {

 int acessos=0;
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            acessos++;
            PrintWriter out = response.getWriter();
            out.print("<html>");
            out.print("<head><title>Servlet</title></head>");
            out.print("<body>");
            out.print("Essa é a : ");
            out.print(this.getClass());
            out.print("Esse servlet foi acessado: "+acessos+"vezes");
            out.print("</body>");
            out.print("</html>");
            out.flush();
            out.close();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }



}
