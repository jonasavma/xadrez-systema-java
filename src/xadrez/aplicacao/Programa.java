package xadrez.aplicacao;

import xadrez.chess.ChessMatch;

public class Programa {

	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();

		UI.printBoard(chessMatch.getPieces());

	}

}
