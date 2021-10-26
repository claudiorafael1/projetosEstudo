
package Unidade2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rafael
 */
@WebServlet(name = "ServletLeitor", urlPatterns = {"/ServletLeitor"})
public class ServletLeitor extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletLeitor</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletLeitor at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      HttpSession session = request.getSession();
		String email =session.getAttribute("email").toString();
		String senha = session.getAttribute("senha").toString();
           
                
               PrintWriter out = response.getWriter();
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletLeitor</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("email: "+email);
          //  out.println("senha: "+senha);
            out.println("</body>");
            out.println("</html>");
               
              
            
           
    }

  
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
