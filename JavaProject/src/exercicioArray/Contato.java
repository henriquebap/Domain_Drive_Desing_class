package exercicioArray;


public class Contato{
    private String name;
    private String telefone;

    public Contato(String name, String telefone){
        this.name = name;
        this.telefone = telefone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString(){
        System.out.println("*-toString-*");
        return "Nome: " + this.getName() +
        "\n Telefone: " + getTelefone() + 
        "\n ------------------";
    }
} 