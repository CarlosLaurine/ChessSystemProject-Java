package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
	}
	
	
	@Override
	public String toString() {
		return "H";
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean [][] matrix = new boolean [getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		
		//NorthWest
		p.setValues(position.getRow() +1, position.getColumn() +2);
		if(getBoard().positionExists(p) && canMove(p)) {
		matrix[p.getRow()][p.getColumn()] = true;
		}	
		
		//Above
		p.setValues(position.getRow() - 1, position.getColumn() -2);
		if(getBoard().positionExists(p) && canMove(p)) {
			matrix[p.getRow()][p.getColumn()] = true;
		}
		
		//NorthEast
		p.setValues(position.getRow() +2, position.getColumn() +1);
		if(getBoard().positionExists(p) && canMove(p)) {
		matrix[p.getRow()][p.getColumn()] = true;
		}

		//Left
		p.setValues(position.getRow() -2, position.getColumn() +1);
		if(getBoard().positionExists(p) && canMove(p)) {
		matrix[p.getRow()][p.getColumn()] = true;
		}	
		
		//Right
		p.setValues(position.getRow() -1, position.getColumn() +2);
		if(getBoard().positionExists(p) && canMove(p)) {
		matrix[p.getRow()][p.getColumn()] = true;
		}	
		
		//SouthWest
		p.setValues(position.getRow() +2, position.getColumn() -1);
		if(getBoard().positionExists(p) && canMove(p)) {
		matrix[p.getRow()][p.getColumn()] = true;
		}
		
		//Below
		p.setValues(position.getRow() - 2, position.getColumn() -1);
		if(getBoard().positionExists(p) && canMove(p)) {
		matrix[p.getRow()][p.getColumn()] = true;
		}
			
		//SouthEast
		p.setValues(position.getRow() +1, position.getColumn() -2);
		if(getBoard().positionExists(p) && canMove(p)) {
		matrix[p.getRow()][p.getColumn()] = true;
		}	
		
		
		
		
		
		return matrix;
	}

	
}
