package exepctionP;

public class exemplo3F {
    public static void main(String[] args) {
        try {
            int [] numeros = {1, 2, 3, 4, 5};
            
            for (int i=0; i<numeros.length; i++){
                System.out.println("Numrto: " + numeros[i]);
            }
        } catch (Exception e) {
            System.out.println("Ops, Algo deu errado!");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finalizando o APP...");
        }
        System.out.println("App finalizado");
    }
}
