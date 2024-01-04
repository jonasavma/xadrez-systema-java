package xadrez.chess.pieces;

import xadrez.boardgame.Board;
import xadrez.boardgame.Position;
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

	private boolean canMove(Position position) {

		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();

	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard()
				.getColumns()];

		Position p = new Position(0, 0);

		// above ,tradução acima
		p.setValues(position.getRow() - 1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}

		// below ,tradução abaixo
		p.setValues(position.getRow() + 1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}

		// left ,tradução esquerda
		p.setValues(position.getRow(), position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}

		// right ,tradução direita
		p.setValues(position.getRow(), position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}

		// nw
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}

		// ne
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}

		// sw
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}

		// se
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}

}
