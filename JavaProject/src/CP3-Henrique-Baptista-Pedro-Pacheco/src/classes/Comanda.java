package classes;
import java.util.ArrayList;

/**
 * Classe Comanda, que tem 1 atributo.
 * Uma lista de ItemComanda
 * 
 * @author Henrique Baptista - RM 97796 | Pedro Pacheco - RM 98043
 * @since 17/05/2023
 */
public class Comanda {
    
    private ArrayList<ItemComanda> itensComanda = new ArrayList<ItemComanda>();

    /**
     * Construtor Parametrizado que recebe uma Lista de ItemComanda
     * @param itensComanda
     */
    public Comanda(ArrayList<ItemComanda> itensComanda) {
        this.itensComanda = itensComanda;
    }

    /**
     * Metodo que salva um novo item na lista itensComanda, recebe um
     * ItemComanda como parametro
     * @param item
     */
    public void registrarItem(ItemComanda item){
        itensComanda.add(item);
    }

    /**
     * Metodo que calcula o valor total da comanda, passando por todos os seus itens
     * e somando os seus valores a uma variavel precoTotal, que é retornada
     * @return float - preco total de todos os ItemProduto da Comanda somados
     */
    public float calcularValorTotal(){
        float precoTotal = 0;
        for (ItemComanda item : itensComanda) {
            precoTotal += item.calcularPreco();
        }
        return precoTotal;
    }

    /**
     * Metodo que passa por cada ItemComanda na lista de itensComanda
     * e chama o seu metodo de printarItemComanda()
     */
    public void printarItens(){
        for (ItemComanda itemComanda : itensComanda) {
            itemComanda.printarItemComanda();
        }
    }
}
