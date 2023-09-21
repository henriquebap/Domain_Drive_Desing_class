package aulamvc2109.br.com.henriquebap.model.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import aulamvc2109.br.com.henriquebap.model.vo.Ordenacao;

/**
 * @author Henrique Baptista
 * @see Classe que executa as operacoes de IO (Entrada e Saida)
 * @version 0.1 - 21/09/2023
 */

public class OrdenacaoDAO {
    /**
     * Metodo que salva em um arquivo texto os dados
     * @author
     * @version
     * @param ordenacao
     * @throws FileNotFoundException
     * @see
     * 
     */

    public void salvar(Ordenacao ordenacao)throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("ordenacao.txt");
        pw.print(ordenacao);

        pw.flush();
        pw.close();

    }
}
