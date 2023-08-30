package cp4;

class Onibus extends Veiculo implements Imprimir{
    
    private int assentos;
    private String cor;

    public Onibus(String modelo, String placa, int ano, int assentos, String cor){
        super(modelo, placa, ano);
        this.assentos = assentos;
        this.cor = cor;
    }

    public void setassentos(int assetnos){
        this.assentos = assetnos;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }   


    public int getAssentos(){
        return assentos;
    }
    
    
    void veiculo(){
    }
    @Override
    public void ExibirDados(){
        System.out.println("---");
        System.out.println("Dadoss do Onibus: ");
        System.out.println("---");
        System.out.println("Assentos: " + assentos);
        System.out.println("Cor"+ cor);
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano: " + getAno());
        System.out.println("---");
    }   

}
