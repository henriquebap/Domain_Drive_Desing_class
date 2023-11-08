package br.com.fernandoalmeida;

import br.com.fernandoalmeida.controller.ControllerPrincipal;
import br.com.fernandoalmeida.model.bo.OrdenacaoBO;
import br.com.fernandoalmeida.model.vo.Ordenacao;
import br.com.fernandoalmeida.view.FramePrincipal;

public class MVC {
	public static void main(String[] args) {
		Ordenacao ordenacao = new OrdenacaoBO().bubbleSort(532135);
		System.out.println(ordenacao);
		
		FramePrincipal framePrincipal = new FramePrincipal();
		new ControllerPrincipal(framePrincipal);
		framePrincipal.setVisible(true);
	}
}
