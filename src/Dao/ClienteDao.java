
package Dao;

import ClassesAuxiliares.Msg;
import static Dao.ConexaoMysql.close;
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
        
        sql = "insert into clientes (nome, sobrenome, telefone, id_endereco, data_cad, email) "+
                "values ('" + clienteModel.getNome() + "', '" + clienteModel.getSobrenome() + "',"
                + clienteModel.getTelefone() + "," + clienteModel.getIdEndereco() + ", curtime(), " + "'" + clienteModel.getEmail() + "');";
        
        try{
            
            stmt.execute(sql);
            success = true;
        }catch(SQLException ex)
        {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
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
        clienteModel = (ClienteModel) object;
        
        sql = "delete from clientes where idCliente = ?;";
        
        try{            
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            pstm.setInt(1,clienteModel.getIdCliente());            
            pstm.execute();
            success = true;
        }catch(SQLException ex)
        {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        close();
        return success;        
    }

    @Override
    public ArrayList pesquisar(String pesq) {
                
        sql = "select * from clientes where nome like '" + pesq + "%';";
            
        try{
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            resultado = pstm.executeQuery(sql);
            clientes.clear();
            while(resultado.next())
            {
                clienteModel = new ClienteModel();  
                clienteModel.setIdCliente(resultado.getInt("idCliente"));
                clienteModel.setNome(resultado.getString("nome"));
                clienteModel.setSobrenome(resultado.getString("sobrenome"));
                clienteModel.setTelefone(resultado.getInt("telefone"));
                clienteModel.setIdEndereco(resultado.getInt("id_endereco"));
           //   clienteModel.setDataCadastro(resultado.getDate("data_cad"));   VERIFICAR!!!!!!!!!!
                clienteModel.setEmail(resultado.getString("email"));
               
                clientes.add(clienteModel);
            }           
        }catch(SQLException ex)
        {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        close();
        return clientes;
       
    }

   
    
}
