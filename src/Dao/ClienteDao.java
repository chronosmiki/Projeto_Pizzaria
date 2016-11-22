
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
    String sql, sql1 = "";          
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
        
        sql = "insert into clientes (nome, sobrenome, telefone, data_cad, email) "+
                "values ('" + clienteModel.getNome() + "', '" + clienteModel.getSobrenome() + "',"
                + clienteModel.getTelefone() + ", curtime(), " + "'" + clienteModel.getEmail() + "');";
        sql1 = "insert into enderecos (tipo, logradouro, numero, bairro, municipio, estado, cep, id_cliente)"
                + "values ('" + clienteModel.getTipo() + "', '" + clienteModel.getLogradouro() + "'," + 
                clienteModel.getNumero() + ",'" + clienteModel.getBairro() + "','" + clienteModel.getMunicipio() + 
                "','" + clienteModel.getEstado() + "'," + clienteModel.getCep() + ", (select LAST_INSERT_ID()));";        
        
        try{
            
            stmt.execute(sql);
            stmt.execute(sql1);           
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
        clienteModel = (ClienteModel) object;
        
        sql = "update clientes set nome = ?, sobrenome = ?, telefone = ?, email =? where idCliente = ?";        
        try{
            try{
                pstm = open().prepareStatement(sql);
               }catch(Exception ex)
                    {
                        Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                        Msg.exclamation(Msg.erroConexao + ex.getMessage());
                    }
                pstm.setString(1, clienteModel.getNome());
                pstm.setString(2, clienteModel.getSobrenome());
                pstm.setString(3, clienteModel.getTelefone());
                pstm.setString(4, clienteModel.getEmail());
                
                pstm.setInt(5, Integer.parseInt(clienteModel.getIdCliente()));
                pstm.execute();
                success = true;
        }catch(SQLException ex)
        {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        
        return success;
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
            pstm.setInt(1,Integer.parseInt(clienteModel.getIdCliente()));            
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
                
        sql = "select c.*, ie.* from clientes c join enderecos ie on ie.id_cliente = c.idCliente where nome like '" + pesq + "%';";
      
        try{
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            resultado = pstm.executeQuery(sql);
            clientes.clear();
            while(resultado.next())
            {
                clienteModel = new ClienteModel();  
                clienteModel.setIdCliente(String.valueOf(resultado.getInt("idCliente")));
                clienteModel.setNome(resultado.getString("nome"));
                clienteModel.setSobrenome(resultado.getString("sobrenome"));
                clienteModel.setTelefone(resultado.getString("telefone"));
                clienteModel.setDataCadastro(resultado.getDate("data_cad"));
                clienteModel.setEmail(resultado.getString("email"));
               
                clienteModel.setIdEndereco(resultado.getInt("idendereco"));
                clienteModel.setTipo(resultado.getString("tipo"));
                clienteModel.setLogradouro(resultado.getString("logradouro"));
                clienteModel.setNumero(resultado.getString("numero"));
                clienteModel.setBairro(resultado.getString("bairro"));
                clienteModel.setMunicipio(resultado.getString("municipio"));
                clienteModel.setEstado(resultado.getString("estado"));
                clienteModel.setCep(Integer.parseInt(resultado.getString("cep")));                               
                clientes.add(clienteModel);              
            }           
        }catch(SQLException ex)
        {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        close();
        return clientes;               
    }     
    
    
       
}
