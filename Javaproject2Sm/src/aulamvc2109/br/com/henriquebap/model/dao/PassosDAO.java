package aulamvc2109.br.com.henriquebap.model.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author Henrique Baptista
 * @see Classer que executa as operacoes IO (Entrada e Saida)
 * Do sistema com relacao aos dados resultantes do passo a passo
 */

import aulamvc2109.br.com.henriquebap.model.vo.Passos;

public class PassosDAO {
    
    /**
     * Metodo que recebe os passos (lista) / percorre a lista e salva todos os passos
     * em um arquivo texto
     * @author Henrique Baptista
     * @since 21/09/2023
     * @param passos
     * @throws FileNotFoundException
     */

    public void salvarPassos(List<Passos> passos)throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("passos.txt");


        for(Passos p : passos){
            pw.print(p);
        }

        pw.flush();
        pw.close();

    }

}
