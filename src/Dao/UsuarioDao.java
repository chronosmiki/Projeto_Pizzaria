
package Dao;

import Interfaces.interfaceDao;
import java.util.ArrayList;


public class UsuarioDao implements interfaceDao {

    ArrayList usuarios;
    
    
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
    
}
