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

	public PecaXadrez[][] getPeca() {
		PecaXadrez[][] m = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];

		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				m[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			}
		}
		return m;
	}

	private void placeNovaPeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.placePeca(peca, new XadrezPosicao(coluna,linha).toPosition());
	}
	
	
	private void inicialJogo() {
		placeNovaPeca('b',6, new Rook(tabuleiro, Color.White));
		placeNovaPeca('e',8, new King(tabuleiro, Color.Black));
		placeNovaPeca('e',1, new King(tabuleiro, Color.White));
	}

}
