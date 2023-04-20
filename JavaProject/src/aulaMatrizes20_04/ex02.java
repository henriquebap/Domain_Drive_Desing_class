package aulaMatrizes20_04;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //criando uma matriz 3x3
        int[][] matriz = new int [3][3];

        for(int i=0; i<matriz.length; i++){
            System.out.printf("Elementos da %da. linha \n", i+1 );
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("matriz[%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();

            }
        }
        System.out.println("A sua tabela ficou assim");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("matriz [%d][%d]: %d\n", i,j, matriz[i][j]);
            }
        }
    }
}
