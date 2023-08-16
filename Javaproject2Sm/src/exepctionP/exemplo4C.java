package exepctionP;


import java.util.InputMismatchException;
import java.util.Scanner;

public class exemplo4C {
    public static double calcula(double numerador, double denominador){
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continua = true;

        do {
            try {
                System.out.println("Digite um numero: ");
                double numerador = input.nextDouble();

                System.out.println("Digite um Denominador: ");
                double denominador = input.nextDouble();

                double resultado = calcula(numerador, denominador);
                System.out.println("Resultado da conta é : " + resultado);
                
                continua = false;
                
            } catch (InputMismatchException e) {
                System.out.println("Somente Numeros, nao digite letras ");
                input.next();
            }catch(ArithmeticException e){
                System.out.println("Impossivel fazer divisao com 0, Porfavor digite um numero valido!");
                input.next();
            }finally{
                System.out.println("Parabens! Deu tudo certo, finalizando o programa...");
                input.close();
            }
        } while (continua);
        System.out.println("Programa Finalizado");
    }

}
