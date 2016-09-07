
package Controls;

import ClassesAuxiliares.Msg;
import Interfaces.interfaceControl;




public class ProdutoControl extends OperadorControl implements interfaceControl
{
    
    
    public ProdutoControl(Object object) {      
        super(object);
    }
    

    @Override
    public void inserirBd() {
         if(inserirProduto()){
             Msg.confirm(Msg.confimaCadastro);
         }
    }

    @Override
    public void alterarBd() {          
          if(Msg.question(Msg.confirmaAlteracao)){
              alterarProduto();         
          }
    }

    @Override
    public void excluirBd() {
        excluirProduto();
    }

    @Override
    public Object pesquisarBd() {
        return pesquisarProduto();
    }
    
    
   
       
    
    
  
            
}
