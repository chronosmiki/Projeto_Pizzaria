
package Dao;

import ClassesAuxiliares.Msg;
import Interfaces.interfaceDao;
import Models.UsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioDao  extends ConexaoMysql implements interfaceDao {
   
        private UsuarioModel usuarioModel;
        private ResultSet resultado = null;   
        private String sql = "";          
        private Statement stmt;
        private PreparedStatement pstm;
        private Boolean success = false;    
        private ArrayList <UsuarioModel> usuarios = new ArrayList<>();
    
    
    @Override
    public Boolean inserir(Object object) {
        usuarioModel = (UsuarioModel) object;
        
        try {             
                stmt = open().createStatement();
              } catch (Exception ex) {
                    Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
                    Msg.exclamation(Msg.erroConexao + ex.getMessage());
              }
                    sql = "INSERT INTO usuarios (nome, sobrenome, login, password, nivel)"
                    + "VALUES ('"
                    + usuarioModel.getNome()
                    + "','" 
                    + usuarioModel.getSobrenome()
                    + "','"
                    + usuarioModel.getLogin()
                    + "','"
                    + usuarioModel.getPassword()
                    + ","
                    + usuarioModel.getNivel() + ");";
                    
               try {                   
                        stmt.execute(sql);
                        success = true;
               } catch (SQLException ex) {
                        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
                        Msg.exclamation(Msg.erroConexao + ex.getMessage());
               }   
                close();       
        return success;
    }

    @Override
    public Boolean alterar(Object object) {
        usuarioModel = (UsuarioModel) object;
        
        sql = "update usuarios set nome = ?, sobrenome = ?, login = ?, password = ?, nivel = ? where idusuarios = ?;";
        
        try{            
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            pstm.setString(1, usuarioModel.getNome());
            pstm.setString(2, usuarioModel.getSobrenome());
            pstm.setString(3, usuarioModel.getLogin());
            pstm.setString(4, usuarioModel.getPassword());
            pstm.setInt(5, usuarioModel.getNivel());
            
            pstm.setInt(6, usuarioModel.getIdUsuario());
            pstm.execute();
            success = true;
        }catch(SQLException ex)
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }        
        return success;
    }

    @Override
    public Boolean excluir(Object object) {
        usuarioModel = (UsuarioModel) object;
        
        sql = "delete from usuarios where idusuarios = ?;";
        
        try{            
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            pstm.setInt(1,usuarioModel.getIdUsuario());            
            pstm.execute();
            success = true;
        }catch(SQLException ex)
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }        
        return success;        
    }

    @Override
    public ArrayList pesquisar(String pesq) {
        sql = "select * from produtos where detalheProduto like '" + pesq + "%' OR tipoProduto like '" + pesq + "%' ;";
            
        try{
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            resultado = pstm.executeQuery(sql);
            usuarios.clear();
            while(resultado.next())
            {
                usuarioModel = new UsuarioModel();  
                usuarioModel.setIdUsuario(resultado.getInt("idusuarios"));
                usuarioModel.setNome(resultado.getString("nome"));
                usuarioModel.setSobrenome(resultado.getString("sobrenome"));
                usuarioModel.setLogin(resultado.getString("login"));
                usuarioModel.setPassword(resultado.getString("password"));
                usuarioModel.setNivel(resultado.getInt("nivel"));
               
                usuarios.add(usuarioModel);
            }           
        }catch(SQLException ex)
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        close();
        return usuarios;    
    }
    
    
    //MÉTODO PARA PREENCHER A TABELA
     public ArrayList retornaUsuarios() {        
        
        sql = "select * from produtos;";
            
        try{
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            resultado = pstm.executeQuery(sql);
            usuarios.clear();
            while(resultado.next())
            {
                //usuarioModel = new ProdutoModel();  
                //usuarioModel.setIdProduto(resultado.getInt("id_produto"));
               // usuarioModel.setDetalheProduto(resultado.getString("tipoProduto") + " - " + resultado.getString("detalheProduto"));
               // usuarioModel.setValorUnitario(resultado.getDouble("precoUnitario"));                  
               
                usuarios.add(usuarioModel);
            }           
        }catch(SQLException ex)
        {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        close();
        return usuarios;
    }    
    
   
     
   //METODO DE LOGIN
    public Boolean getLogin(UsuarioModel usuarioModel) {     
      
        sql = "select login, password from usuarios where login = '" + usuarioModel.getLogin() + "' and password = '" + usuarioModel.getPassword() + "' ;";
 
        try{
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            resultado = pstm.executeQuery(sql);
           
            if(resultado.next()){            
              success = true;                                           
            }           
        }catch(SQLException ex)
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        close();      
        return success;    
    }        
}
