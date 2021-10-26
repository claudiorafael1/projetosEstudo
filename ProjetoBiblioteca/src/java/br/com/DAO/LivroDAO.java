/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.DTO.LivroDTO;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author edza
 */
public class LivroDAO {
    Connection  con;
    PreparedStatement pstm;
    ResultSet  rs;
    ArrayList<LivroDTO> lista= new ArrayList<>();
    public LivroDAO() {
    }
    public void CadastrarLivro(LivroDTO objLivroDTO) throws ClassNotFoundException{
    String sql ="insert into livro (nome_livro) values (?)";
        con = new ConexaoDAO().conexaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getNome_livro());
          
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
        }
    }

    public ArrayList<LivroDTO> pesquisarLivro() throws ClassNotFoundException{
         String sql ="select * from  livro";
        con = new ConexaoDAO().conexaoBD();
        
         try {
            pstm = con.prepareStatement(sql);
           rs= pstm.executeQuery(sql);
          
           while(rs.next()){
           LivroDTO objLivroDTO = new LivroDTO();
           objLivroDTO.setLivroid(rs.getInt("livroid"));
           objLivroDTO.setNome_livro(rs.getString("nome_livro"));
           lista.add(objLivroDTO);
           
           } 
           pstm.execute();
            pstm.close();
        } catch (SQLException e) {
        }
    
return lista;
        }
}
