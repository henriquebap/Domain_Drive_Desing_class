package conta;

public class Conta {
	private String nome;
	private int numConta;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(String nome, int numConta, double Saldo) {
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = Saldo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depostar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
		System.out.println(getSaldo());
		if(saldo < valor) {
			System.out.println("Voce nao tem saldo suficiente");
		}
	}
	
	public void trasnferir(double valor, double newSaldo) {
		 saldo -= valor = newSaldo ;
		 setSaldo(newSaldo) ;
		 /*a verificar a caracteristica deste method
		 c1 saldo1 - valor transferencia ( + sald0o2) = transferencia =*/
	}
	
	
}
