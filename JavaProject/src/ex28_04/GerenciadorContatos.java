package ex28_04;

import java.util.Scanner;

public class GerenciadorContatos {
	
	//Declarando a lista de contatos
	private Contato[] contatos;
	private Scanner input;
	
	//Construtor que irá instanciar (criar) a lista
	public GerenciadorContatos(int t) {
		System.out.println("Lista criada: " + t + " elementos");
		System.out.println("================================");
		
		contatos = new Contato[t];
	}
	
	
	public Contato criarContato() {
		System.out.println("-* Criando um contato -*");
		System.out.println("========================");
		
		input = new Scanner(System.in);
		
		//Entrada do usuário
		System.out.println("Nome: ");
		String nome = input.next();
		System.out.println("Telefone: ");
		String telefone = input.next();
		
		//criando o objeto Contato
		Contato contato = new Contato(nome, telefone);
		
		return contato;
	}
	
	
	public void adicionarContatos() {
		System.out.println("*- Adicionando Contatos na Lista");
		System.out.println("================================");
		
		for(int i=0; i < contatos.length; i++) {
			
			//adicionando o Contato no vetor Contatos
			contatos[i] = criarContato();
			
		}
		
	}
	
	public void mostrarContatos() {
		System.out.println("*- Mostrando os Contatos da Lista");
		System.out.println("=================================");
		
		for(int i=0;i< contatos.length; i++) {
			
			
			System.out.println(contatos[i].toString());
			
//			System.out.println("Nome: " + contatos[i].getNome());
//			System.out.println("Telefone: " + contatos[i].getTelefone());
//			System.out.println("--------------------------------------");
		}
	}
	
	//TO DO
	// Criar um método para buscar um contato
	// Criar um método para apagar um contato
	public void buscarContatos(){
		System.out.println("Busca Contatos");
		System.out.println("=================================");
		

	}
	public Contato[] getContatos() {
		return contatos;
	}
}
