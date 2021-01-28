package Xadrez;

import tabuleiro.Position;

public class XadrezPosicao {

	private char coluna;
	private int linha;
	
	public XadrezPosicao(char coluna, int linha) {
	if(coluna < 'a' || coluna >'h' || linha < 1 || linha > 8) {
		throw new XadrezException("Erro: na instacia da posição. valor deve estar entre a1 e h8");
	}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
	
	protected Position toPosition() {
		return new Position(8 - linha, coluna - 'a');
	}
	
	protected static XadrezPosicao formPosition(Position posicao) {
		return new XadrezPosicao((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
	}
	@Override
	public String toString() {
		return ""+coluna + linha;
	}
	
	
}
