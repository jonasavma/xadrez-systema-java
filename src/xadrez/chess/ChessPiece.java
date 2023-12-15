package xadrez.chess;

import xadrez.boardgame.Board;
import xadrez.boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	protected Color getColor() {
		return color;
	}


}
