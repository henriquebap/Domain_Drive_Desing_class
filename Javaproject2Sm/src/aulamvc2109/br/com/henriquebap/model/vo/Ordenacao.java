package aulamvc2109.br.com.henriquebap.model.vo;

/**
 * @author Henrique Baptista
 * @see Classe que cria objeto capaz de armazenar os dados relativos ao processo de ordenacao
 * @version 0.1 - 21/09/23
 * 
 * 
 * Model 
 * VO - Value Object
 */


public class Ordenacao {
    //atributos

    private int numeroOriginal;
    private String numeroOrdenado;
    private int qtdeTrocas;

    public int getNumeroOriginal() {
        return this.numeroOriginal;
    }

    public void setNumeroOriginal(int numeroOriginal) {
        this.numeroOriginal = numeroOriginal;
    }

    public String getNumeroOrdenado() {
        return this.numeroOrdenado;
    }

    public void setNumeroOrdenado(String numeroOrdenado) {
        this.numeroOrdenado = numeroOrdenado;
    }

    public int getQtdeTrocas() {
        return this.qtdeTrocas;
    }

    public void setQtdeTrocas(int qtdeTrocas) {
        this.qtdeTrocas = qtdeTrocas;
    }

    public Ordenacao(int numeroOriginal, String numeroOrdenado, int qtdeTrocas){
        this.numeroOrdenado = numeroOrdenado;
        this.numeroOriginal =numeroOriginal;
        this.qtdeTrocas  = qtdeTrocas;

    }


    public String toString(){
        //casting de int para String
        return String.valueOf(this.getNumeroOriginal())
                .concat("Virou: \n")
                .concat(String.valueOf(this.getNumeroOrdenado()))
                .concat("\n Qunatidade de Trocas: ")
                .concat(String.valueOf(this.getQtdeTrocas()));
    }
    
}
