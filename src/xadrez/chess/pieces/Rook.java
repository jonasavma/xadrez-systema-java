package xadrez.chess.pieces;

import xadrez.boardgame.Board;
import xadrez.chess.ChessPiece;
import xadrez.chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

}
