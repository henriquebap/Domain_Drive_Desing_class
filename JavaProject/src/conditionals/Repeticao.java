package conditionals;

import java.util.Scanner;

public class Repeticao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inicio, coloque um numero: ");
		int inicio = input.nextInt();
		System.out.println("Digite a parada: ");
		int fim = input.nextInt();
		
		
		for(int i = inicio; i<= fim; i++) {
			if(i%2 == 0) {
			System.out.println("i: " + i);
			}
			
		}
	}
}
