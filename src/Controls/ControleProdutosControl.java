
package Controls;

import ClassesAuxiliares.Msg;
import Interfaces.interfaceControl;




public class ControleProdutosControl extends OperadorControl implements interfaceControl
{   
    
    public ControleProdutosControl(Object object) {      
        super(object);       
    }
    

    
    @Override
    public Boolean inserirBd() {      
         if(inserirProduto()){
             Msg.confirm(Msg.confimaCadastro);
         }
         return null;
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
