package tabuleiro;

public class Peca {
	protected Position posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Position posicao, Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

}
