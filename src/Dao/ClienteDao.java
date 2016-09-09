
package Dao;

import Interfaces.interfaceDao;
import Models.ClienteModel;
import java.util.ArrayList;


public class ClienteDao implements interfaceDao{
    ClienteModel clienteModel;
    ArrayList clientes;
    

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
        clienteModel = new ClienteModel();
        
        
     return clientes;    
    }

   
    
}
