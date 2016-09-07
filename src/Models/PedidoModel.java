
package Models;

import java.util.Date;


public class PedidoModel {
    
    
    private int numPedido; 
    private int [] idProduto;
    private int [] nomeProduto;
    private int [] quantProduto;
    private Double [] precoUnitario;
    
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
    
       public int[] getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int[] idProduto) {
        this.idProduto = idProduto;
    }

    public int[] getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(int[] nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int[] getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int[] quantProduto) {
        this.quantProduto = quantProduto;
    }

        public Double[] getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double[] precoUnitario) {
        this.precoUnitario = precoUnitario;
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
    
  
}
