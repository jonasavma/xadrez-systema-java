package xadrez.chess.pieces;

import xadrez.boardgame.Board;
import xadrez.chess.ChessPiece;
import xadrez.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

}
