package aula_methods;

public class conta {
	private String titula;
    private String agencia;
    private String nConta;
    private double saldo;
    public int id;
    
	public String getTitula() {
		return titula;
	}
	public void setTitula(String titula) {
		this.titula = titula;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getnConta() {
		return nConta;
	}
	public void setnConta(String nConta) {
		this.nConta = nConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void verficSaldo() {
		System.out.println("O valor do seu Saldo e: " + getSaldo());
	}
	
}
