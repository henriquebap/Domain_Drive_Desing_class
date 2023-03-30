package aula_2;

import java.util.Scanner;

public class ExercicioMedia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ola, Digite o seu nome: ");
		String name = input.nextLine();
		System.out.println("Digite a Sua primeira nota: ");
		float nota_1 = input.nextFloat();
		System.out.println("Digite a Sua segunda nota: ");
		float nota_2 = input.nextFloat();
		System.out.println("Digite a Sua terceira nota: ");
		float nota_3 = input.nextFloat();
		
		double media;
		media = (nota_1 + nota_2 + nota_3)/3;
		System.out.print("Aluno: "+name+" A sua media é: "+ media);
		input.close();
	}
}
