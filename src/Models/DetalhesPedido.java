
package Models;


public class DetalhesPedido {
    
    private int idDetalhePedido;
    private int idPedido;
    private int [] idProduto;
    private int [] quantProduto;
    
    
    public int getIdDetalhe() {
        return idDetalhePedido;
    }

    public void setIdDetalhe(int idDetalhe) {
        this.idDetalhePedido = idDetalhe;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int[] getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int[] idProduto) {
        this.idProduto = idProduto;
    }

    public int [] getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int[] quantProduto) {
        this.quantProduto = quantProduto;
    }
 
    
    
}
