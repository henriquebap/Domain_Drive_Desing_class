package aula_2;

import java.util.Scanner;

public class Entrada_teclado {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String name = input.nextLine();
		System.out.println("eai, " + name);
	}
}
