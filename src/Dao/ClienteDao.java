
package Dao;

import ClassesAuxiliares.Msg;
import static Dao.ConexaoMysql.close;
import static Dao.ConexaoMysql.open;
import Interfaces.interfaceDao;
import Models.ClienteModel;
import Models.EnderecoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDao implements interfaceDao{
    ClienteModel clienteModel;
    EnderecoModel enderecoModel;
    ResultSet resultado = null;   
    String sql = "";          
    Statement stmt;    
    PreparedStatement pstm;
    Boolean success = false;    
    ArrayList <ClienteModel> clientes = new ArrayList();
    ArrayList <EnderecoModel> enderecos = new ArrayList();
  
    

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
                pstm.setInt(3, clienteModel.getTelefone());
                pstm.setString(4, clienteModel.getEmail());
                
                pstm.setInt(5, clienteModel.getIdCliente());
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
                clienteModel.setIdCliente(resultado.getInt("idCliente"));
                clienteModel.setNome(resultado.getString("nome"));
                clienteModel.setSobrenome(resultado.getString("sobrenome"));
                clienteModel.setTelefone(resultado.getInt("telefone"));
                clienteModel.setIdEndereco(resultado.getInt("id_endereco"));
                clienteModel.setDataCadastro(resultado.getDate("data_cad"));
                clienteModel.setEmail(resultado.getString("email"));
               
                enderecoModel.setIdEndereco(resultado.getInt("idendereco"));
                enderecoModel.setTipo(resultado.getString("tipo"));
                enderecoModel.setLogradouro(resultado.getString("logradouro"));
                enderecoModel.setNumero(resultado.getInt("numero"));
                enderecoModel.setBairro(resultado.getString("bairro"));
                enderecoModel.setMunicipio(resultado.getString("municipio"));
                enderecoModel.setEstado(resultado.getString("estado"));
                enderecoModel.setCep(resultado.getInt("cep"));              
                        
                clientes.add(clienteModel);
                enderecos.add(enderecoModel);
            }           
        }catch(SQLException ex)
        {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        close();
        return clientes;               
    }
    
    public ArrayList retornaEnd()
    {
        return enderecos;
    }
    
    
       
}
