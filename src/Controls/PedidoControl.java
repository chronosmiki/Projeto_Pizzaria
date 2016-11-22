
package Controls;

import ClassesAuxiliares.CalcularPedido;
import Dao.PedidoDao;
import Interfaces.interfaceControl;
import Models.PedidoModel;


public class PedidoControl extends PedidoDao implements interfaceControl {
    
    
    private PedidoModel pedidoModel;
    private CalcularPedido calc;
    
    public PedidoControl(PedidoModel model){
        this.pedidoModel = model;    
    }
    
    
    @Override
    public Boolean inserirBd() {
        calc = new CalcularPedido(pedidoModel);
        inserir(calc.calcular(), null);
        return null;
    }
    
    @Override
    public void alterarBd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirBd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object pesquisarBd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
    
}
