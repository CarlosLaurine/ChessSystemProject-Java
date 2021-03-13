package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "B";
	}
	
	
	@Override
	public boolean[][] possibleMoves() {
		
		boolean [][] matrix = new boolean [getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0,0);
		
		//NORTHWEST
		p.setValues(position.getRow() -1, position.getColumn() -1);
		
		while (getBoard().positionExists(p)&& !getBoard().thereIsAPiece(p)) {
			matrix[p.getRow()][p.getColumn()]= true;
			
			p.setValues(p.getRow()-1, p.getColumn()-1);
		}
		
		if(getBoard().positionExists(p)&& isThereOpponentPiece(p)) {
			matrix[p.getRow()][p.getColumn()]= true;
		}
		
		//SOUTHWEST
				p.setValues(position.getRow() +1, position.getColumn() -1);
				
				while (getBoard().positionExists(p)&& !getBoard().thereIsAPiece(p)) {
					matrix[p.getRow()][p.getColumn()]= true;
					
					p.setValues(p.getRow()+1, p.getColumn()-1);

				}
				
				if(getBoard().positionExists(p)&& isThereOpponentPiece(p)) {
					matrix[p.getRow()][p.getColumn()]= true;
				}
		
		//NORTHEAST
				p.setValues(position.getRow() -1, position.getColumn()+ 1);
				
				while (getBoard().positionExists(p)&& !getBoard().thereIsAPiece(p)) {
					matrix[p.getRow()][p.getColumn()]= true;
					
					p.setValues(p.getRow()-1, p.getColumn()+1);

				}
				
				if(getBoard().positionExists(p)&& isThereOpponentPiece(p)) {
					matrix[p.getRow()][p.getColumn()]= true;
				}
		
		//SOUTHEAST
				p.setValues(position.getRow() +1, position.getColumn()+ 1);
				
				while (getBoard().positionExists(p)&& !getBoard().thereIsAPiece(p)) {
					matrix[p.getRow()][p.getColumn()]= true;
					
					p.setValues(p.getRow()+1, p.getColumn()+1);

				}
				
				if(getBoard().positionExists(p)&& isThereOpponentPiece(p)) {
					matrix[p.getRow()][p.getColumn()]= true;
				}
		
		
		
		
		
		
		
		
		
		
		
		
		return matrix;
	}

}
