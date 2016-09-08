
package Dao;

import ClassesAuxiliares.Msg;
import Interfaces.interfaceDao;
import Models.ProdutoModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProdutoDao  extends ConexaoMysql implements interfaceDao{

          ProdutoModel produtoModel;
          ResultSet resultado = null;   
          String sql = "";          
          Statement stmt;       
          Connection conn;
          Boolean success = false;         
   
        
//INSERE PRODUTOS    
    @Override
    public Boolean inserir(Object object) {              
            produtoModel = (ProdutoModel) object;            
                                     
              try {             
                   stmt = open().createStatement();
              } catch (Exception ex) {
                    Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
                    Msg.exclamation(Msg.erroConexao + ex.getMessage());
              }
                    sql = "INSERT INTO produtor (nome, precoUnitario)"
                    + "VALUES (' "
                    + produtoModel.getNomeProduto() 
                    + " ',' " 
                    + produtoModel.getValorUnitario() 
                    +"' );";
                    
               try {                   
                        stmt.execute(sql);
                        success = true;
               } catch (SQLException ex) {
                        Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
               }   
                close();
                return success;
    }



    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean excluir(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object pesquisar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
