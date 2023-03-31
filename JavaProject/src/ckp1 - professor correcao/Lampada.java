package ckp1;

public class Lampada {
	private boolean estado;
	
	public Lampada() {
		estado = false;
	}
	
	public void ligar() {
		estado = true;
	}
	
	public void desligar() {
		estado = false;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		
		System.out.println("O estado" + lamp.isEstado());
		lamp.ligar();
		System.out.println(lamp.isEstado());
		lamp.desligar();
		System.out.println(lamp.isEstado());
		
	}
	
	
}
