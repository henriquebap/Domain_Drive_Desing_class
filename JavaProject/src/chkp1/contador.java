package chkp1;

public class contador {
	
	private int numr;
	
	
	public contador(){
	}
	
	public contador(int numr) {
		this.numr = numr;
	}
	
	public int getNumr() {
		return numr;
	}

	public void setNumr(int numr) {
		this.numr = numr;
	}

	public void zera(int valor) {
		valor = 0;
		setNumr(valor); 		
	}
	public void incr(int numr) {

	}
	public void retorna(int numr) {
		return;
	}
	
}
