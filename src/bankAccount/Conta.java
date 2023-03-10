package bankAccount;

public class Conta{
	//definicao dos atributos
	String titular;
	String numConta;
	double saldo;

	// methods acessories and modificadores k (getters and setters)
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getNome() {
		return this.titular;
		
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
		
	}
	
	public String getNumConta() {
		return this.numConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	//testing the code
	public static void main(String[] args) {
		//criando um objeto da class conta
		Conta c1 = new Conta();
		c1.titular = "Vanderlei";
		c1.numConta = "123-123-123";
		c1.saldo = 1000;
		
		
		System.out.println("Titular: " +c1.titular);
		System.out.println("Numero da conta: " +c1.numConta);
		System.out.println("Saldo da Conta: " +c1.saldo);
		
		Conta c2 = new Conta();
		c2.setTitular("Pedro");
		c2.setNumConta("122-122");
		c2.setSaldo(1000000);
		
		System.out.println("Titular: " +c2.getNome());
		System.out.println("Numero da conta: " +c2.getNumConta());
		System.out.println("Saldo da Conta: " +c2.getSaldo());
		
	}
	
}

