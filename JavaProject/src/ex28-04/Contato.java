package aula15_1_arrayObjetos;

public class Contato {
	
	private String nome;
	private String telefone;
	
	/**
	 * @param nome
	 * @param telefone
	 */
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		System.out.println(" *- toString -*");
		return "Nome: " + this.getNome() +
				"\nTelefone: " + getTelefone() +
				"\n------------------------------";
	}
	
}
