package Xadrez;

import PecasXadrez.King;
import PecasXadrez.Rook;
import tabuleiro.Position;
import tabuleiro.Tabuleiro;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		inicialJogo();
	}
	
	public PecaXadrez[][] getPeca(){
		PecaXadrez[][] m = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		
		for(int i = 0; i< tabuleiro.getLinhas(); i++) {
			for (int j = 0; j<tabuleiro.getColunas(); j++) {
				m[i][j] = (PecaXadrez)tabuleiro.peca(i, j);
			}
		}
		return m;
	}
	
	private void inicialJogo() {
		tabuleiro.placePeca(new Rook(tabuleiro, Color.White), new Position(2, 1));
		tabuleiro.placePeca(new King(tabuleiro, Color.Black), new Position(0, 4));
		tabuleiro.placePeca(new King(tabuleiro, Color.White), new Position(7, 4));
	}
	
	
}
