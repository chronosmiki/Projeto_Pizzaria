
package Controls;

import ClassesAuxiliares.Msg;
import Dao.UsuarioDao;
import Interfaces.interfaceControl;
import Models.UsuarioModel;

public class UsuarioControl extends OperadorControl implements interfaceControl{
    
    private final UsuarioDao usuarioDao = new UsuarioDao();
    private UsuarioModel usuarioModel = new UsuarioModel();
    
    public UsuarioControl(Object object) {
        super(object);
    }
    
    public UsuarioControl(UsuarioModel model) {
       this.usuarioModel = model;
    }
    
        @Override
    public void inserirBd() {
           if(inserirUsuario()){
           Msg.confirm(Msg.confimaCadastro);    
        }            
    }

    
    @Override
    public void alterarBd() {
           if(alterarUsuario()){
           Msg.question(Msg.confimaCadastro);    
        }     
    }
    
    
    @Override
    public void excluirBd() {
           if(excluirUsuario()){
           Msg.confirm(Msg.confimaCadastro);    
        }     
    }

    
    @Override
    public Object pesquisarBd() {     
        return pesquisarUsuario();      
    }    
    
    
    public Boolean login (){         
        return  usuarioDao.getLogin(usuarioModel);
    }
    
}
