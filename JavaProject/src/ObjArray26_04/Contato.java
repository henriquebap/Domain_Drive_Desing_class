package ObjArray26_04;

public class Contato{
    private String name;
    private String telefone;

    //Construtor
    public Contato(){
        
    }
    public Contato (String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}