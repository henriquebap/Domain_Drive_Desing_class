package classes;

/**
 * Classe Produto, que tem 3 atributos.
 * Um Codigo, uma Descrição e um Preço Unitario
 * 
 * @author Henrique Baptista - RM 97796 | Pedro Pacheco - RM 98043
 * @since 17/05/2023
 */
public class Produto {
    
    private int codigo;
    private String descricao;
    private float precoUnitario;

    /**
     * Construtor Parametrizado da Classe Produto
     * 
     * @param codigo
     * @param descricao
     * @param precoUnitario
     */
    public Produto(int codigo, String descricao, float precoUnitario){
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
    }

    /**
     * Metodo que usa o System.out.println() para printar
     * Os dados da objeto Produto, usando seu toString()
     */
    public void printarProduto(){
        System.out.println(toString());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "[PRODUTO -> Codigo: " + codigo + " | Descricao: " + descricao + " | Preço Unitario: " + precoUnitario + "]";
    }     

}
