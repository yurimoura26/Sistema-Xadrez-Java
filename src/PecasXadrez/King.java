package PecasXadrez;

import Xadrez.Color;
import Xadrez.PecaXadrez;
import tabuleiro.Tabuleiro;

public class King extends PecaXadrez {

	public King(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
	}
	@Override
	public String toString() {
		return "K";
	}
}
