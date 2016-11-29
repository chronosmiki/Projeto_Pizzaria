
package ClassesAuxiliares;

import Models.PedidoModel;
import Models.ProdutoModel;


public class CalcularPedido  {
    
     private PedidoModel pedidoModel;
     private Double valorTotal = 0.0;
     private Double desconto;
     private ProdutoModel p = new ProdutoModel();
     private Double valorUnitario;
    
    public CalcularPedido(PedidoModel pedidoModel){
        this.pedidoModel = pedidoModel;   
    }
    
    
    
    public PedidoModel calcular(){       
        for(ProdutoModel x : pedidoModel.getProdutos()){  
            int incremento = 0;
            p = pedidoModel.getProdutos().get(incremento);
            valorUnitario = Double.parseDouble(p.getValorUnitario().replace("R$", "").replace(" ", "").replace(",","."));
            int quantidade = p.getQuantidadeProduto();
            valorTotal +=  valorUnitario * quantidade;
            incremento++;    
        }        
        pedidoModel.setValorTotal(valorTotal);      
        return pedidoModel;
    }        
}
