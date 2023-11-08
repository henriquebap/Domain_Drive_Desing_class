package exepctionP;

public class testeString {

    public void caixaAlta() {
        String frase = null;
        String novaFrase = null;

        // novaFrase = frase.toUpperCase();
        System.out.println("Frase Original: " + frase);
        System.out.println("Frase em Caixa alta: " + novaFrase);

    }

    public static void main(String[] args) { 
        testeString ts = new testeString();
        try {
            ts.caixaAlta();    
        } catch (NullPointerException e) {
            System.out.println("Xiii, deu erro. da para deixar em maiusculo nada nao meu fi " + e.getMessage());
        }
        
        
    }
}
