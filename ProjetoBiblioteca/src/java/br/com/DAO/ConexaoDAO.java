/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author edza
 */
public class ConexaoDAO {
    
    public Connection conexaoBD() throws ClassNotFoundException{
    Connection  con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sistemabiblioteca?user=root&password=toor";
            con= DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("br.com.DAO.ConexaoDAO.conexaoBD()");
        }
        return con;
    }
    
}
