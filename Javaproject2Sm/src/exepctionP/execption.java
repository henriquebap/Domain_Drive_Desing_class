package exepctionP;

public class execption {
    public static void main(String[] args) {
        int a, b, result;
        try{

            a = 42;
            b = 0;
            result = a/b;        
            System.out.println("Resultado: " + result);

        }catch(ArithmeticException e ){
            System.out.println("Divisao por zero " + e.getMessage());
            
        }catch(Exception e){
            System.out.println("Generico");
        }
        System.out.println("Fora do Catch");
    }
}
