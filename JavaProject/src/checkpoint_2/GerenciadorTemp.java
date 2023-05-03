package checkpoint_2;
import java.util.Scanner;


public class GerenciadorTemp {
    private Scanner input;
    private Periodo [][] peridos;

    public CriaPerido(int s, int d){

        peridos = new Periodo[s][d];
    }

    public Periodo SolicitaPeriodo(){
    //1) Um método que solicite ao usuário qual o período será mapeado (dias/semana)
        //System.out.println("Qual periodo deseja ver: ");
        //String periodo = input.next();
        //return periodo;
        System.out.println("Qual periodo voce quer ver?");
        System.out.println("Semana: ");
		int s = input.nextInt();
		System.out.println("Dia: ");
        int d = input.nextInt();

        Periodo periodo = new Periodo(s, d);
        //Criar lugar para salvar o periodo solicitado
    }
    public int [][] coletarTemperaturas(int s, int d) {
    //2) Um método para mapear/coletar as temperaturas em uma matriz (dias/semana)
        //int [][] data = new int [7][4];
        int[][]  data = new int [s][d];
		//for(int i=0; i<data.length; i++){
		//	System.out.printf("Semana[%d]: ", s ,"Dia[%d]: ", d);
		//	data[s][d] = input.nextInt();
		//}
		//return data;
       
    }
    public void getTemperatura() {
    //3) Um método para obter a maior e a menor temperatura mapeada no período
       // for(i=0; i<data; i++)
            //if ()
    }
    public void SeparadorTemp() {
    //4)  Um  método  para  ‘separar’  (em  um  array)  as temperaturas  negativas  no  período mapeado

    }
    public void getMedia() {
    //5) Um método para obter a temperatura média no período
    }
    

}
