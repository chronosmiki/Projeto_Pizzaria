
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public ArrayList pesquisar(String pesq) {

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
    
    
}
