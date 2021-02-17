package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class Rook extends ChessPiece{

	// repassando a chamada para super class
	public Rook(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "R";
	}
	
}
