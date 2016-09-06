
package Controls;


import ClassesAuxiliares.Msg;
import Dao.ClienteDao;
import Interfaces.interfaceControl;
import Models.ClienteModel;



public class ClienteControl extends ClienteDao implements interfaceControl{
    
    public ClienteModel model = new ClienteModel();
    
   
    //Recebe a instancia da Classe ProdutoModel no Construtor
    public ClienteControl (ClienteModel model){
        this.model = model;    
    }
    
    
    @Override
    public void inserirBd() {
           if(inserir(this.model)){
           Msg.confirm(Msg.confimaCadastro);    
        }            
    }

    
    @Override
    public void alterarBd() {
           if(alterar(this.model)){
           Msg.question(Msg.confimaCadastro);    
        }     
    }
    
    
    @Override
    public void excluirBd() {
           if(excluir(this.model)){
           Msg.confirm(Msg.confimaCadastro);    
        }     
    }

    
    @Override
    public Object pesquisarBd() {     
        return pesquisar(this.model);      
    }                      
}
