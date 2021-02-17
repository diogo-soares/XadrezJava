package boardgame;

public class Piece {
	
  //class peça e posição usando protected.
	
	protected Position position;
	private Board board;
	

	
	public Piece(Board board) {
		this.board = board;
		position = null;
		
	}


	protected Board getBoard() {
		return board;
	}
	
}
