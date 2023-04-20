package aulaMatrizes20_04;

public class matrixEx01 {
    public static void main(String[] args) {
        int i;
        int[] v = new int [10];
        int[] [] m = new int [3][3];
        int [] [] matriz = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        
        m [0][0] = 1;
        m [0][1] = 10;
        m [0][2] = 100;
        m [1][0] = 1;
        m [1][1] = 10;
        m [1][2] = 100;
        m [2][0] = 1;
        m [2][1] = 10;
        m [2][2] = 100;

        System.out.println("Elemento: " + m[1][1]);

    }
}
