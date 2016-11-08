
package Models;


public class ProdutoModel {
    
    
    private int idProduto;
    private String  tipoProduto;    
    private String  detalheProduto;
    private int quantidadeProduto;
    private String valorUnitario;

    
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getDetalheProduto() {
        return detalheProduto;
    }

    public void setDetalheProduto(String detalheProduto) {
        this.detalheProduto = detalheProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
       public int getQuntidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuntidadeProduto(int quntidadeProduto) {
        this.quantidadeProduto = quntidadeProduto;
    }
    
}
