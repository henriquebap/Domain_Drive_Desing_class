package conditionals;

import java.util.Scanner;

public class ExemploSwitch2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = input.next();
		
		if(nome.equals("FIAP")|| nome.equals ("Fiap")|| nome.equals("fiap")) {
			System.out.println("OK!");
		}else {
			System.out.println("Not ok!");
		}
		
		switch(nome) {
		case "FIAP":
		case "fiap":
		case "Fiap":
			System.out.println("OK!");
		default:
			System.out.println("Not OK!");
		}
		
	}
}
