package classes;
import java.util.ArrayList;

/**
 * Classe CatologoProdutos, que tem 1 atributo.
 * Uma lista de Produto
 * 
 * @author Henrique Baptista - RM 97796 | Pedro Pacheco - RM 98043
 * @since 17/05/2023
 */
public class CatalogoProdutos {
    
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    /**
     * Costrutor parametrizado que recebe uma lista de Produto
     * @param produtos
     */
    public CatalogoProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    /**
     * Metodo que recebe um produto como parametro
     * e o cadastra na lista de produtos
     * @param produto
     */
    public void cadastrarProduto(Produto produto){
        produtos.add(produto);
    }

    /**
     * Metodo que recebe um codigoProduto, e então, passa por todos os 
     * produtos na lista de produtos.
     * 
     * Se algum produto tiver o mesmo codigo informado como paremtro, 
     * este produto é retornado.
     * @param codigoProduto
     * @return Produto -> Produto do Codigo Informado
     */
    public Produto buscarProduto(int codigoProduto){
        for (Produto produto : produtos) {
            if(produto.getCodigo() == codigoProduto){
                return produto;
            }
        }
        return null;
    }

    /**
     * Metodo que passa por cada Produto na lista de produtos
     * e chama o seu metodo printarProduto()
     */
    public void imprimirDados(){
        for (Produto produto : produtos) {
            produto.printarProduto();;
        }
    }
    
}
