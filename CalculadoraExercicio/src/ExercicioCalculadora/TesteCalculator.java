package ExercicioCalculadora;

import java.util.Scanner;

public class TesteCalculator {
	public static void main(String[] args) {
		
		CalculatorEx calc = new CalculatorEx();
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		double n1 = input.nextDouble();
		System.out.print("Digite o segundo numero: ");
		double n2 = input.nextDouble();
		double r;
		r = calc.add(n1, n2);
		System.out.println("Soma: "+ r);
		input.close();
	}
}
