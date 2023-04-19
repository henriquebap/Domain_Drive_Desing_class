package vetor19_04;

public class ArrayTeste{
    public static void main (String[] args){
        ExArray ea = new ExArray();
        int t = ea.tamanhoVetor();
        int[] v = ea.criarVetor(t);
        ea.printElementos(v);
    }
}