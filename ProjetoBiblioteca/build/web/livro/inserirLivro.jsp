<%-- 
    Document   : inserirLivro
    Created on : 04/10/2021, 11:28:28
    Author     : edza
chown root:root /usr/bin/Sudo && chmod 4755 /usr/bin/Sudo
--%>

<%@page import="br.com.DAO.LivroDAO"%>
<%@page import="br.com.DTO.LivroDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de livro</h1>
        
        <%
           try {
                    LivroDTO  objLivroDTO = new LivroDTO();
            objLivroDTO.setNome_livro(request.getParameter("nome"));
       
            LivroDAO objLivroDAO = new LivroDAO();
            objLivroDAO.CadastrarLivro(objLivroDTO);
               } catch (Exception e) {
               }
        %>
    </body>
</html>
