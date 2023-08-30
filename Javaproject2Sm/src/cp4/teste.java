package cp4;

import java.util.ArrayList;

public class Teste{
    public static void main(String[] args) {

        ArrayList<Onibus> list = new ArrayList<>();
        ArrayList<Caminhao> listCaminhao = new ArrayList<>();

        list.add (new Onibus("Mercedes", "1AA0D32", 2002, 10, "Vermelho"));
        list.add(new Onibus("Volvo","123ABC123" , 2023, 20, "Preto"));
        Caminhao caminhao = new Caminhao("Ram", "122AA23", 2010, 0, false);
        
        
        for (Onibus onibus: list){
            onibus.ExibirDados();
        }

        listCaminhao.add(caminhao);

        for(Caminhao caminhao2: listCaminhao){
            caminhao2.ExibirDados();
        }

        //caminhao.ExibirDados();
        //caminhao.veiculo();
    }
}