package br.com.fernandoalmeida.model.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import br.com.fernandoalmeida.model.vo.Passos;

/**
 * @author Fernando Almeida
 * @see Classe que executa as operações de IO (entrada e saída)
 * do sistema com relação aos dados resultantes do passo a passo
 * 
 */

public class PassosDAO {
	
	/**
	 * Método que recebe os passos (lista), percorre os elementos
	 * dessa lista e salva-os em em arquivo.
	 * 
	 * @author Fernando Almeida
	 * @since 01/2023
	 * @param passos
	 * @throws FileNotFoundException
	 */
	public void salvarPassos(List<Passos> passos) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("passos.txt");
		
		for (Passos p : passos) {
			pw.print(p);
		}
		
		pw.flush();
		pw.close();
	}
}
