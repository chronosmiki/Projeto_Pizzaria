
package Controls;

import ClassesAuxiliares.Msg;
import Dao.ProdutosDao;
import Models.ProdutoModel;
import Interfaces.interfaceControl;




public class ProdutosControl extends ProdutosDao implements interfaceControl
{
    private ProdutoModel model = new ProdutoModel();
    
    
    //Recebe a instancia da Classe ProdutoModel no Construtor
    public ProdutosControl(ProdutoModel model){
        this.model = model;    
    }
       
    
    
    //Metodo para inserir Produto
    @Override
    public void inserirBd() {
           if(inserir(this.model)){
           Msg.confirm(Msg.confimaCadastro);    
        }      
    }

    
    
    @Override
    public void alterarBd() {
            if(alterar(this.model)){
                Msg.confirm(Msg.confimaCadastro);    
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
