 
package Unidade2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ClicodeVida", urlPatterns = {"/ClicodeVida"})
public class ClicodeVida extends HttpServlet {


   
    public void init(ServletConfig config) throws ServletException{
        
        System.out.println("Iniciando Servlet");
    }
            
    @Override
     public void destroy(){
        
        System.out.println("Desligando Servidor");
    }

    @Override
     public void service(HttpServletRequest request, HttpServletResponse response){
         System.out.println("Executando o servlet");
     }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         System.out.println("Executando o servlet GET");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       System.out.println("Executando o servlet POST");
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
