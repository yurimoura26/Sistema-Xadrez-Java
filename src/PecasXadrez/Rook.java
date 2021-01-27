package PecasXadrez;

import Xadrez.Color;
import Xadrez.PecaXadrez;
import tabuleiro.Tabuleiro;

public class Rook extends PecaXadrez{

	public Rook(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
	}
	@Override
	public String toString() {
		return "R";
	}
}
