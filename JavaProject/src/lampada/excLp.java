package lampada;

public class excLp {
	
	private int ligada;
	private int desligada;
	private int lampada;
	
	public excLp(){
		
	}
	
	public excLp(int ligada, int desligada) {
		this.ligada = 1;
		this.desligada = 0;
	}
	
	public int getLigada() {
		return ligada;
	}
	public void setLigada(int ligada) {
		this.ligada = ligada;
	}
	public int getDesligada() {
		return desligada;
	}
	public void setDesligada(int desligada) {
		this.desligada = desligada;
	}
	
	
	public int getlampada() {
		return lampada;
	}
	public void setlampada(int lampada) {
		this.lampada = lampada;
	}
	
	
	public void ligar(int ligada) {
		if(ligada == 1 ) {
			System.out.println("A lampada esta ligada");
		}
	}
	
	public void desliga(int desligada) {
		if(desligada == 0) {
			System.out.println("A lampada esta desligada");	
		}
		
		
	}
	
	
	
}
