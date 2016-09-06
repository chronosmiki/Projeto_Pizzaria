
package Models;


public class ProdutoModel {
    
    
    private int idProduto;
    private int idDetalheProduto;
    private String [] saborPizzaSalgada;
    private String [] saborPizzaDoce;
    private String [] bebidas;
    private String [] sobremesa;
    private Double valorUnitario;

    
    
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdDetalheProduto() {
        return idDetalheProduto;
    }

    public void setIdDetalheProduto(int idDetalheProduto) {
        this.idDetalheProduto = idDetalheProduto;
    }

    public String[] getSaborPizzaSalgada() {
        return saborPizzaSalgada;
    }

    public void setSaborPizzaSalgada(String[] saborPizzaSalgada) {
        this.saborPizzaSalgada = saborPizzaSalgada;
    }

    public String[] getSaborPizzaDoce() {
        return saborPizzaDoce;
    }

    public void setSaborPizzaDoce(String[] saborPizzaDoce) {
        this.saborPizzaDoce = saborPizzaDoce;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }

    public String[] getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String[] sobremesa) {
        this.sobremesa = sobremesa;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
}
