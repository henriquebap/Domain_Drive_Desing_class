package aula_methods;

import java.util.Scanner;

public class testeConta {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		conta c1 = new conta();
		conta c2 = new conta();
		conta c3 = new conta();
		
		
		//primeira entrada conta 1
		System.out.println("Escreva o nome do Titular: ");
		String nome_1 = input.nextLine();
		c1.setTitula(nome_1);
		
		System.out.println("Digite a Agencia: ");
		String agencia_1 = input.nextLine();
		c1.setAgencia(agencia_1);
		
		System.out.println("Conta: ");
		String conta1 = input.nextLine();
		c1.setnConta(conta1);
		
		System.out.println("Coloque o seu saldo: ");
		Double saldo1 = input.nextDouble();
		input.nextLine(); // consume the newline character
		c1.setSaldo(saldo1);
		
		System.out.println("----------------------");

		///Segunda entrada da Segunda Conta
		System.out.println("Ola, Escreva o seu nome: ");
		String nome_2 = input.nextLine();
		c2.setTitula(nome_2);
		
		System.out.println("Digite a sua Agencia: ");
		String agencia2 = input.nextLine();
		c2.setAgencia(agencia2);
		
		System.out.println("Insira a sua Conta: ");
		String conta2 = input.nextLine();
		c2.setnConta(conta2);
		
		System.out.println("DIgite o seu Saldo; $$");
		Double saldo2 = input.nextDouble();
		input.nextLine(); // consume the newline character
		c2.setSaldo(saldo2);
		
		System.out.println("----------------------");
		
		//terceira conta
		System.out.println("Escreva o nome do Titular: ");
		String nome_3 = input.nextLine();
		c3.setTitula(nome_3);
		
		System.out.println("Digite a Agencia: ");
		String agencia3 = input.nextLine();
		c3.setAgencia(agencia3);
		
		System.out.println("Conta: ");
		String conta3 = input.nextLine();
		c3.setnConta(conta3);
		
		System.out.println("Coloque o seu saldo: ");
		Double saldo3 = input.nextDouble();
		input.nextLine(); // consume the newline character
		c3.setSaldo(saldo3);
		
		System.out.println("----------------------");
		
		c1.verficSaldo();
		System.out.println("Titular: " + nome_1);
		System.out.println("Agencia: " + agencia_1);
		System.out.println("Conta: " + conta1);
		
		System.out.println("----------------------");

		System.out.println("Segunda conta.....");

		System.out.println("----------------------");
		
		c2.verficSaldo();
		System.out.println("Titular: " + nome_2);
		System.out.println("Agencia: " + agencia2);
		System.out.println("Conta: " + conta2);
		
		System.out.println("----------------------");
		
		System.out.println("Terceira conta.....");
		
		c3.verficSaldo();
		System.out.println("Titular: " + nome_3);
		System.out.println("Agencia: " + agencia3);
		System.out.println("Conta: " + conta3);
		
		
		input.close();
	}
}
