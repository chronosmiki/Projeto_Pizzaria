
package Dao;

import ClassesAuxiliares.Msg;
import static Dao.ConexaoMysql.open;
import Interfaces.interfaceDao;
import Models.ClienteModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDao implements interfaceDao{
    ClienteModel clienteModel;
    ResultSet resultado = null;   
    String sql = "";          
    Statement stmt;
    PreparedStatement pstm;
    Boolean success = false;    
    ArrayList <ClienteModel> clientes = new ArrayList();
    

    @Override
    public Boolean inserir(Object object) {
        clienteModel = (ClienteModel) object;
        
        try{
             
            stmt = open().createStatement();
            
        }catch(Exception ex)
        {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        
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
    public ArrayList pesquisar(String pesq) {
        clienteModel = new ClienteModel();
        
        
     return clientes;    
    }

   
    
}
