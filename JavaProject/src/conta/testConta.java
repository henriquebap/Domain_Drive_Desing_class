package conta;

import java.util.Scanner;

public class testConta {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	Conta c1 = new Conta();
	Conta c2 = new Conta();
	
	String greetings = "Vamos Criar uma conta";
	String nome = "Digite o seu nome: ";
	String numConta = "Digite a sua conta: ";
	String saldo = "Digite o seu Saldo: ";
	
	
	System.out.println(greetings);
	System.out.println(nome);
	String nome1 = input.next();
	c1.setNome(nome1);
	System.out.println(numConta);
	int numC1 = input.nextInt();
	c1.setNumConta(numC1);
	System.out.println(saldo);
	double saldo1 = input.nextDouble();
	c1.setSaldo(saldo1);
	
	
	System.out.println("Digite o valor para depositar: ");
	double valor = input.nextDouble();
	c1.depostar(valor);
	System.out.println(c1.getSaldo());
	
	
	System.out.println("-------------");
	input.nextLine();
	
	
	System.out.println(nome);
	String nome2 = input.next();
	c2.setNome(nome2);
	input.nextLine();
	
	System.out.println(numConta);
	int numC2 = input.nextInt();
	c2.setNumConta(numC2);
	input.nextLine();
	
	System.out.println(saldo);
	double saldo2 = input.nextDouble();
	c2.setSaldo(saldo2);
	input.nextLine();
	
	System.out.println("Digite o valor para Sacar: ");
	double sacar = input.nextDouble();
	c2.sacar(sacar);
	
	
	System.out.println("Valor para transferir: ");
	double trans = input.nextDouble();
	
	
}
	
}
