package conditionals;

import java.util.Scanner;

public class SwitchJava {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char conceito;
		System.out.println("Calculo de media");
		System.out.println("Porfavor, Digite a Primeira nota: ");
		float n1 = input.nextFloat();
		System.out.println("Digite a Segunda nota: ");
		float n2 = input.nextFloat();
		float media = (n1+n2)/2;
		
		if(media >= 9) {
			conceito = 'A';
		}else if (media >= 8 && media <9) {
			conceito = 'B';
		}else if (media >= 7 && media <8) {
			conceito = 'C';
		}else if (media >= 6 && media < 7) {
			conceito = 'D';
		}else if (media >= 5 && media < 6) {
			conceito = 'E';
		}else {
			conceito = 'F';
		}
		//print conceito
		switch(conceito) {
		case 'A':
			//System.out.println("Aprovado - "+ conceito);
			//break;
		case 'B':
			//System.out.println("Muito bom - " + conceito);
			//break;
		case 'C':
			//System.out.println("Bomm - " + conceito);
			//break;
		case 'D':
			System.out.println("Parabens, voce esta aprovado! - " + conceito + " Media -" +  media);
			break;
		case 'E':
			System.out.println("Reprovavel - " + conceito + "Media -" + media);
			break;
		default:
			System.out.println("Conceito invalido");
			break;
		}
	}
}
