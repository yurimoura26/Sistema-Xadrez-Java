package tabuleiro;

public class Tabuleiro {
		
		private int linhas;
		private int colunas;
		private Peca[][] pecas;
		
		public Tabuleiro(int linhas, int colunas) {
			if (linhas < 1 || colunas < 1) {
				throw new TabuleiroExceprion("Erro: tabuleiro não jogavel");
			}
			this.linhas = linhas;
			this.colunas = colunas;
			pecas = new Peca[linhas][colunas];
		}

		public int getLinhas() {
			return linhas;
		}

		public int getColunas() {
			return colunas;
		}
		
		public Peca peca(int linha, int coluna) {
			if (!positionExiste(linha ,coluna)) {
				throw new TabuleiroExceprion("Erro: Posição não Existe no tabuleiro");
			}
			return pecas[linha][coluna];
		}
		
		public Peca peca(Position posicao) {
			if (!positionExiste(posicao)) {
				throw new TabuleiroExceprion("Erro: já existe uma peça na posição ");
			}
			return pecas[posicao.getLinha()][posicao.getColuna()];
		}
		
		public void placePeca(Peca peca, Position posicao) {
			if (temPecaPosicao(posicao)) {
				throw new TabuleiroExceprion("Erro: já existe uma peça na posição "+posicao);
			}
			pecas[posicao.getLinha()][posicao.getColuna()] = peca;
			peca.posicao = posicao;
		}
		
		private boolean positionExiste(int linha, int coluna) {
			return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
		}
		
		public boolean positionExiste(Position posicao) {
			return positionExiste(posicao.getLinha(), posicao.getColuna());
		}
		
		public boolean temPecaPosicao(Position posicao) {
			if (!positionExiste(posicao)) {
				throw new TabuleiroExceprion("Erro: Posição não Existe no tabuleiro ");
			}
			return peca(posicao) !=null;
		}

}
