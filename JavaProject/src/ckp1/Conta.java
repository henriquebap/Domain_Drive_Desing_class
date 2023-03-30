package ckp1;

public class Conta {
    private String nome;
    private int conta;
    private double saldo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta(String nome, int conta, double saldo){
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(saldo > valor){
            saldo -= valor;
        }else{
            System.err.println("Voce nao pode sacar o valor");
        }
    }

    public void trasnferir(Conta contaDesConta, double valor){
        this.sacar(valor);
        contaDesConta.depositar(valor);
    }

    public static void main(String[] args) {
        Conta c1 =  new Conta("julia", 123, 22);
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Conta: " + c1.getConta());
        System.out.println("Saldo: " + c1.getSaldo());
        c1.depositar(100);
        System.out.println("Novo saldo: " + c1.getSaldo());


        Conta c2 = new Conta("Pedro", 122, 200);
        System.out.println("Nome: " + c2.getNome());
        System.out.println("Conta: " + c2.getConta());
        System.out.println("Saldo: " + c2.getSaldo());
        c2.sacar(50);

        c1.trasnferir(c2, 10);
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Saldo: " + c2.getSaldo());
    }

}
