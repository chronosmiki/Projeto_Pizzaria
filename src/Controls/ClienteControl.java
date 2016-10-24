
package Controls;


import ClassesAuxiliares.Msg;
import Dao.ClienteDao;
import Models.ClienteModel;
import java.util.ArrayList;



public class ClienteControl extends ClienteDao {
    
    public ClienteModel model = new ClienteModel();    

    public void inserirBd() {
           if(inserir(model)){
           Msg.confirm(Msg.confimaCadastro);    
        }            
    }

    

    public void alterarBd() {
           if(alterar(model)){
           Msg.question(Msg.confimaCadastro);    
        }     
    }
    
    
 
    public void excluirBd() {
           if(excluir(model)){
           Msg.confirm(Msg.confimaCadastro);    
        }     
    }

    

    public Object pesquisarBd(String pesq) {     
        return pesquisar(pesq);      
    }     
        
}
