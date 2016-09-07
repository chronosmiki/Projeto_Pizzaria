
package Controls;


import ClassesAuxiliares.Msg;
import Interfaces.interfaceControl;
import Models.ClienteModel;



public class ClienteControl extends OperadorControl implements interfaceControl{
    
    public ClienteModel model = new ClienteModel();

    public ClienteControl(Object object) {
        super(object);
    }
    
   
  
    
    @Override
    public void inserirBd() {
           if(inserirCliente()){
           Msg.confirm(Msg.confimaCadastro);    
        }            
    }

    
    @Override
    public void alterarBd() {
           if(alterarCliente()){
           Msg.question(Msg.confimaCadastro);    
        }     
    }
    
    
    @Override
    public void excluirBd() {
           if(excluirCliente()){
           Msg.confirm(Msg.confimaCadastro);    
        }     
    }

    
    @Override
    public Object pesquisarBd() {     
        return pesquisarCliente();      
    }                      
}
