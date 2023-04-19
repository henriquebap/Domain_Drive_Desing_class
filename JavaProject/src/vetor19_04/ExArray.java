package vetor19_04;

import java.util.Scanner;

public class ExArray {
	public int  tamanhoVetor() {
		Scanner input = new Scanner(System.in);
		System.out.println("Tamanho: ");
		int t = input.nextInt();
		return t;
	} 

	public int[] criarVetor(int t){
		Scanner input = new Scanner(System.in);
		int[] vetor =  new int[t];
		for(int i=0; i<vetor.length; i++){
			System.out.printf("Vetor[%d]: ", i);
			vetor[i] = input.nextInt();
		}
		return vetor;
	}

	public void printElementos(int [] v){
		for(int i=0; i<v.length; i++)
			System.out.printf("vetor [%d]: %d \n", i, v[i]);
	}
}
