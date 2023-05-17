package classes;

/**
 * Classe ItemComanda, que tem 2 atributos.
 * Um Produto, e a quantidade referente a este Produto.
 * 
 * @author Henrique Baptista - RM 97796 | Pedro Pacheco - RM 98043
 * @since 17/05/2023
 */
public class ItemComanda {
 
    private Produto produto;
    private int quantidade;
    
    /**
     * Construtor parametrizado que recebe produto e quantidade
     * @param produto
     * @param quantidade
     */
    public ItemComanda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /**
     * Metodo que retorna o preço do ItemComanda, este preço
     * é o preço do seu produto vezes sua quantidade
     * @return preco do produto * quantidade existente dele
     */
    public float calcularPreco(){
        float precoTotal = this.produto.getPrecoUnitario() * quantidade;
        return precoTotal;
    }

    /**
     * Metodo que printa com o System.out.println() as informações
     * do ItemComanda, usando o seu toString()
     */
    public void printarItemComanda(){
        System.out.println(toString());
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "(ITEM COMANDA -> Produto: " + produto.toString() + " | Quantidade: " + quantidade + ")";
    }
}
