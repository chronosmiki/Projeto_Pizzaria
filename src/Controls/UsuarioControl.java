
package Controls;

import ClassesAuxiliares.Msg;
import Interfaces.interfaceControl;

public class UsuarioControl extends OperadorControl implements interfaceControl{
    
    
    public UsuarioControl(Object object) {
        super(object);
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
    
    
}
