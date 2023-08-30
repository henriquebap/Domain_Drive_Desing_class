package cp4;

class Caminhao extends Veiculo implements Imprimir{

    private int eixos;
    private boolean carreta;

    public Caminhao(String modelo, String placa, int ano, int eixos, boolean carreta){
        super(modelo, placa, ano);
        this.eixos = eixos;
        this.carreta = carreta;
    }

    
    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public boolean isCarreta() {
        return carreta;
    }

    public void setCarreta(boolean carreta) {
        this.carreta = carreta;
    }

   
    void veiculo(){
        System.out.println("teste Metodo Abstrato caminhao");
    }
    @Override
    public void ExibirDados(){
        System.out.println("---");
        System.out.println("Dados da Carreta: ");
        System.out.println("Eixos: "+ eixos);
        System.out.println("Carreta?: "+ carreta);
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Placa: "+ getPlaca());
        System.out.println("Ano: " + getAno() );
        System.out.println("---");
    }
}    
