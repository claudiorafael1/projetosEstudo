/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidade2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
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
@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {


    
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
        }
    }

    @Override
    public void init() throws ServletException {
        
        ServletContext context = getServletContext();
        context.setAttribute("classe", this.getClass());
        
    }
            
  


   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            String email = request.getParameter("email");
		String senha = request.getParameter("senha"); 	
		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		session.setAttribute("senha", senha);
               RequestDispatcher dispatcher = request.getRequestDispatcher("ServletLeitor");
            
             
		//RequestDispatcher dispatcher = request.getRequestDispatcher("ServletLeitor");
		//dispatcher.forward(request, response);
	}

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
