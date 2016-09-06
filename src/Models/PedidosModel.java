
package Models;

import java.util.Date;


public class PedidosModel {
    
    
    private int numPedido;
    private int idDetalhePedido;
    private double valorTotal;
    private Date dataPedido;
    private Boolean delivery;
    private String metodoPagamento;

    
    
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getIdDetalhePedido() {
        return idDetalhePedido;
    }

    public void setIdDetalhePedido(int idDetalhePedido) {
        this.idDetalhePedido = idDetalhePedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    
    
    public Double calcularPedido(DetalhesPedido detalhes){
        
        
            
    
         return 0.0;
    }    
}
