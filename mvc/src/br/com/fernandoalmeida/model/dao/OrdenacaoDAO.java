package br.com.fernandoalmeida.model.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import br.com.fernandoalmeida.model.vo.Ordenacao;

/**
 *
 * @author Fernando Almeida
 * @see Classe que executa as operacoes de IO (entrada e saida) do sistema 
 * com relacao aos dados resultantes da ordenacao
 * @version 0.1  - 21/9/2023
 */

public class OrdenacaoDAO {
    
	public void salvar(Ordenacao ordenacao) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("ordenacao.txt");
		pw.print(ordenacao);
		pw.flush(); //limpar o buffer
		pw.close(); // fecha o arquivo
	}
}