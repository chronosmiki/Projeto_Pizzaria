
package Dao;

import ClassesAuxiliares.Msg;
import Interfaces.interfaceDao;
import Models.ProdutoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProdutoDao  extends ConexaoMysql implements interfaceDao{

          private ProdutoModel produtoModel;
          private ResultSet resultado = null;   
          private String sql = "";          
          private Statement stmt;
          private PreparedStatement pstm;
          private Boolean success = false;    
          private ArrayList <ProdutoModel> produtos = new ArrayList<>();
   
        
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
                    sql = "INSERT INTO produtos (tipoProduto, detalheProduto, precoUnitario)"
                    + "VALUES ('"
                    + produtoModel.getTipoProduto()
                    + "','" 
                    + produtoModel.getDetalheProduto()
                    + "','"
                    + produtoModel.getValorUnitario()
                    +"');";
                    
               try {                   
                        stmt.execute(sql);
                        success = true;
               } catch (SQLException ex) {
                        Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
                        Msg.exclamation(Msg.erroConexao + ex.getMessage());
               }   
                close();
                return success;
    }



    //ALTERA PRODUTOS
    @Override
    public Boolean alterar(Object object) {
        produtoModel = (ProdutoModel) object;
        
        sql = "update produtos set tipoProduto = ?, detalheProduto = ?, precoUnitario = ? where id = ?;";
        
        try{            
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            pstm.setInt(3, produtoModel.getIdProduto());
            pstm.setString(1,produtoModel.getTipoProduto());
            pstm.setString(1,produtoModel.getDetalheProduto());
            pstm.setDouble(2,produtoModel.getValorUnitario());          
                        
            pstm.execute();
            success = true;
        }catch(SQLException ex)
        {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }        
        return success;
    }

    
    
    //EXCLUI PRODUTO
    @Override
    public Boolean excluir(Object object) {
        produtoModel = (ProdutoModel) object;
        
        sql = "delete from produtos where id = ?;";
        
        try{            
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            pstm.setInt(1,produtoModel.getIdProduto());            
            pstm.execute();
            success = true;
        }catch(SQLException ex)
        {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }        
        return success;        
    }
    
    
    
    
    //PESQUISA PRODUTO
    @Override
    public ArrayList pesquisar(String pesq) {        
        
        sql = "select * from produtos where detalheProduto like '" + pesq + "%' OR tipoProduto like '" + pesq + "%' ;";
            
        try{
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            resultado = pstm.executeQuery(sql);
            produtos.clear();
            while(resultado.next())
            {
                produtoModel = new ProdutoModel();  
                produtoModel.setIdProduto(resultado.getInt("id_produto"));
                produtoModel.setTipoProduto(resultado.getString("tipoProduto"));
                produtoModel.setDetalheProduto(resultado.getString("detalheProduto"));
                produtoModel.setValorUnitario(resultado.getDouble("precoUnitario"));                  
               
                produtos.add(produtoModel);
            }           
        }catch(SQLException ex)
        {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        close();
        return produtos;
    }    
    
    
    //MÉTODO PARA PREENCHER A TABELA
     public ArrayList retornaProdutos() {        
        
        sql = "select * from produtos;";
            
        try{
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            resultado = pstm.executeQuery(sql);
            produtos.clear();
            while(resultado.next())
            {
                produtoModel = new ProdutoModel();  
                produtoModel.setIdProduto(resultado.getInt("id_produto"));
                produtoModel.setTipoProduto(resultado.getString("tipoProduto"));
                produtoModel.setDetalheProduto(resultado.getString("detalheProduto"));
                produtoModel.setValorUnitario(resultado.getDouble("precoUnitario"));                     
               
                produtos.add(produtoModel);
            }           
        }catch(SQLException ex)
        {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        close();
        return produtos;
    }    
}
