package cp5.br.com.henriquebaptista.model.vo;

public class Score {
    
    //atributos

    private String jogador;
    private int pontos;
    

	public String getJogador() {
		return this.jogador;
	}

	public void setJogador(String jogador) {
		this.jogador = jogador;
	}

	public int getPontos() {
		return this.pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public Score(String jogador, int pontos){
		this.jogador = jogador;
		this.pontos = pontos;
	}

}
