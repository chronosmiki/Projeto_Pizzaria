
package Controls;


import ClassesAuxiliares.Msg;
import Dao.ClienteDao;
import Interfaces.interfaceControl;
import Models.ClienteModel;
import java.util.ArrayList;



public class ClienteControl extends OperadorControl implements interfaceControl {
    
    public ClienteModel model = new ClienteModel(); 
    
    public ClienteControl(Object object)
    {
        super(object);
    }
    
    @Override
    public Boolean inserirBd() {
         Boolean retorno = inserirCliente();             
    return retorno;
    }            
  

    
    @Override
    public void alterarBd() {
           if(alterarCliente()){
           Msg.question(Msg.confirmaAlteracao);    
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
