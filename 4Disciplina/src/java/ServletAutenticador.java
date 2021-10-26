

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/ServletAutenticador"})
public class ServletAutenticador extends HttpServlet {

   private static final long serialVersionUID = 1L;
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String usuario = "cursojava";
	static String senha = "schema";
	static Connection conexao;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletAutenticador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAutenticador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    
               PrintWriter out = response.getWriter();
            String email = request.getParameter("email");
		String senha = request.getParameter("senha"); 	
		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		session.setAttribute("senha", senha);
               RequestDispatcher dispatcher = request.getRequestDispatcher("ServletLeitor");
            
    
    
    }
public void init() throws ServletException{
   
       try {
            Class.forName("");   
           conexao= DriverManager.getConnection(url,usuario,senha);
                   conexao.setAutoCommit(false);

       } catch (SQLException ex) {
           Logger.getLogger(ServletAutenticador.class.getName()).log(Level.SEVERE, null, ex);
       }
}

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
