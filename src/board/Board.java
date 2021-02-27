package board;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	public Board(int rows, int columns) {
		if (rows<1 || columns<1) {
			throw new BoardException("Error creating Board: at least 1 Row and 1 Column are needed");
			
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];
	}


	public int getRows() {
		return rows;
	}



	public int getColumns() {
		return columns;
	}

	
	public Piece piece (int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException ("Position doesn`t exist on the Board");
		}
		return pieces[row][column];
	}
	public Piece piece (Position position) {
		if(!positionExists(position)) {
			throw new BoardException ("Position doesn`t exist on the Board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece (Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("The Position " + position + " is already occupied by a Piece");
		}
		pieces [position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece (Position position) {
		if (!positionExists(position)) {
			throw new BoardException ("Position doesn't exist on the Board");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	private boolean positionExists (int row, int column) {
		boolean verif = row >= 0 && row < rows && column >= 0 && column < columns; 
		return verif;
	}
	public boolean positionExists (Position position) {
		boolean verif = positionExists(position.getRow(), position.getColumn());
		return verif;
	}

	public boolean thereIsAPiece (Position position) {
		if(!positionExists(position)) {
			throw new BoardException ("Position doesn't exist on the Board");
		}
		boolean verif = piece(position) != null;
		return verif;
	}
}
