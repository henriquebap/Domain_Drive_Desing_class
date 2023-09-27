package aulamvc2109.br.com.henriquebap.model.vo;

public class Passos {

    private String numeroAnterior;
    private String numeroResultante;
    private String descricao;



    public Passos(String numeroAnterior, String numeroResultante, String descricao){
        this.numeroAnterior = numeroAnterior;
        this.numeroResultante =numeroResultante;
        this.descricao  = descricao;

    }
    
    public String getNumeroAnterior() {
        return this.numeroAnterior;
    }

    public void setNumeroAnterior(String numeroAnterior) {
        this.numeroAnterior = numeroAnterior;
    }

    public String getNumeroResultante() {
        return this.numeroResultante;
    }

    public void setNumeroResultante(String numeroResultante) {
        this.numeroResultante = numeroResultante;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        if(this.getNumeroAnterior()==null){
            return "\nDescricao: ".concat(getDescricao());
        }else{
            return this.getNumeroAnterior()
                    .concat(">>")
                    .concat(getNumeroAnterior())
                    .concat("\nDescricao: ")
                    .concat(this.getDescricao())
                    .concat("\n\n");
        }
    }
    
    
}
