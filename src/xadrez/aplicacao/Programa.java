package xadrez.aplicacao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import xadrez.chess.ChessException;
import xadrez.chess.ChessMatch;
import xadrez.chess.ChessPiece;
import xadrez.chess.ChessPosition;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ChessMatch chessMatch = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();

		while (!chessMatch.getcheckMate()) {
			try {
				UI.clearScreen();
				UI.printMach(chessMatch, captured);
				System.out.println();
				System.out.print("Source:");

				ChessPosition source = UI.readChessPosition(sc);

				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);

				System.out.println();
				System.out.print("Target:");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

				if (capturedPiece != null) {
					captured.add(capturedPiece);
				}

				if (chessMatch.getPromoted() != null) {
					System.out.print("Enter piece for promotion (B/N/R/Q): ");
					String type = sc.nextLine().toUpperCase();
					while (!type.equals("B") && !type.equals("N") && !type.equals("R") && !type.equals("Q")) {
						System.out.println("invalid value Enter piece for promotion (B/N/R/Q)");
						type = sc.nextLine().toUpperCase();

					}
					chessMatch.replacePromotedPiece(type);

				}

			} catch (ChessException e) {

				System.out.println(e.getMessage());
				sc.nextLine();

			} catch (InputMismatchException e) {

				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		UI.clearScreen();
		UI.printMach(chessMatch, captured);
	}

}
