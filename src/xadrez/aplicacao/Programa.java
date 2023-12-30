package xadrez.aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.chess.ChessException;
import xadrez.chess.ChessMatch;
import xadrez.chess.ChessPiece;
import xadrez.chess.ChessPosition;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source:");

				ChessPosition source = UI.readChessPosition(sc);

				System.out.println();
				System.out.print("Target:");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source,
						target);

			} catch (ChessException e) {

				System.out.println(e.getMessage());
				sc.nextLine();

			} catch (InputMismatchException e) {

				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}

	}

}
