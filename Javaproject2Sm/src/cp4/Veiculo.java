package cp4;

abstract class Veiculo{
    private String modelo;
    private String placa;
    private int ano;

    

    public Veiculo(String modelo, String placa, int ano){
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }   

    public int getAno(){
        return ano;
    }

    abstract void veiculo();

    public void ExibirDados(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: "+ placa);
        System.out.println("Ano: "+ ano);
    }

}
