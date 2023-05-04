package ex28_04;
import java.util.Scanner;

public class GerenciadorTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		GerenciadorContatos gc = new GerenciadorContatos(2);
		gc.adicionarContatos();
		gc.mostrarContatos();
		System.out.println("Digite o nome a ser procurado:");
		String nomeProcurado = input.next();
		Contato itemProcurado = new Contato(nomeProcurado, "");
		int indice = buscarContatos(gc.getContatos(), itemProcurado);
		if (indice >= 0) {
			System.out.println("Contato encontrado na posição " + indice + ":");
			System.out.println(gc.getContatos()[indice].toString());
		} else {
			System.out.println("Contato não encontrado.");
		}
	}

}
