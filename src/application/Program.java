package application;

import java.util.Scanner;

import Xadrez.PartidaXadrez;
import tabuleiro.Tabuleiro;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		PartidaXadrez p = new PartidaXadrez();
		UI.printTabuleiro(p.getPeca());
		
		
	ler.close();	
	}

}
