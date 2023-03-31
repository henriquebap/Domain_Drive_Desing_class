package chkp1;

import java.util.Scanner;

public class testContador {
public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
	contador c1 =  new contador();
	
	System.out.println("Digite algo: ");
	int ent = input.nextInt();
	c1.setNumr(ent);
	System.out.println("1º: " + c1.getNumr());
	
	c1.zera(ent);
	System.out.println(c1.getNumr()); 
}
	
}
