
package Models;


public class ProdutoModel {
    
    
    private int idProduto;
    private String  nomeProduto;
    private int quantidadeProduto;
    private Double valorUnitario;

    
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
       public int getQuntidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuntidadeProduto(int quntidadeProduto) {
        this.quantidadeProduto = quntidadeProduto;
    }
    
}
