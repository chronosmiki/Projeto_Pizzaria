
package ClassesAuxiliares;

import Models.PedidoModel;


public class CalcularPedido  {
    
     private PedidoModel pedidoModel;
     private Double valorTotal = 0.0;
     private Double desconto;
    
    public CalcularPedido(PedidoModel pedidoModel){
        this.pedidoModel = pedidoModel;   
    }
    
    
    
    public PedidoModel calcular(){       
        for(Double x : pedidoModel.getPrecoUnitario()){  
            int incremento = 0;
            int quantidade = pedidoModel.getQuantProduto()[incremento];
            valorTotal +=  x * quantidade;
            incremento++;    
        }        
        pedidoModel.setValorTotal(valorTotal);   
    
        return pedidoModel;
    }    
    
}
