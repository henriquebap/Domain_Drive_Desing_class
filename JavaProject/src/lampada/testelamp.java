package lampada;

import java.util.Scanner;

public class testelamp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		excLp lp1 =  new excLp();
		
		String start = "Ola, voce quer desligar ou ligar a lampada";
		String func = "[1] Ligar, [0] Desligar";
		
		System.out.println(start);
		System.out.println(func);
		int entrada = input.nextInt();
		lp1.setlampada(entrada);		
		
		
		if(entrada == 1) {
			lp1.ligar(entrada);
		}else if (entrada == 0) {
			lp1.desliga(entrada);
		}else {
			System.err.println("Coloque um valor valido para a lampada");
		}
		
		
		
		
		input.close();
	}
}
