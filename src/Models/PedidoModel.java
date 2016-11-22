
package Models;

import java.sql.Date;
import java.util.ArrayList;


public class PedidoModel {
        
    private int numPedido; 
    private int idDetalhe; 
    private double valorSubTotal;
    private int delivery;
    private String metodoPagamento;
    private ArrayList<ProdutoModel> produtos = new ArrayList<>(); 
   
    
    public ArrayList<ProdutoModel> getProdutos() {
        return produtos;
    }

    public void setProdutos(ProdutoModel produtoModel) {
        this.produtos.add(produtoModel);
    }
 

    public double getValorSubTotal() {
        return valorSubTotal;
    }

    public void setValorSubTotal(double valorSubTotal) {
        this.valorSubTotal = valorSubTotal;
    }
    private double valorTotal;    
    
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    
       public int getIdDetalhe() {
        return idDetalhe;
    }

    public void setIdDetalhe(int idDetalhe) {
        this.idDetalhe = idDetalhe;
    }
   
       public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }          
    
  
}
