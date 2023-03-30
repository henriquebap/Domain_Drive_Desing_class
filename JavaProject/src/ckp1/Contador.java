package ckp1;

public class Contador {
    private int contador;

    public void zerarContador() {
        contador = 0;
    }

    public void incrementarCOntador() {
        contador += 1;
    }

    public int obterContador() {
        return contador;
    }

    public static void main(String[] args) {
        Contador cont = new Contador();
        cont.zerarContador();
        System.out.println("Contador: " + cont.obterContador());
        cont.incrementarCOntador();
        cont.incrementarCOntador();
        cont.incrementarCOntador();
        System.out.println("Contador: " + cont.obterContador());
        cont.incrementarCOntador();
        cont.incrementarCOntador();
        cont.incrementarCOntador();
        System.out.println("Contador: " + cont.obterContador());
    }
}
