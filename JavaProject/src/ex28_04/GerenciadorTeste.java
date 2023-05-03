package ex28_04;

public class GerenciadorTeste {
	
	public static void main(String[] args) {
		
		GerenciadorContatos gc = new GerenciadorContatos(5);
		gc.adicionarContatos();
		gc.mostrarContatos();
		gc.buscarcontatos();
	}
	
}
