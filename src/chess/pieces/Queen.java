package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {

		boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);

		// ABOVE
		p.setValues(position.getRow() - 1, position.getColumn());

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;

			p.setRow(p.getRow() - 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;
		}

		// NORTHEAST
		p.setValues(position.getRow() - 1, position.getColumn() + 1);

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;

			p.setValues(p.getRow() - 1, p.getColumn() + 1);

		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;
		}

		// RIGHT
		p.setValues(position.getRow(), position.getColumn() + 1);

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;

			p.setColumn(p.getColumn() + 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;
		}

		// SOUTHEAST
		p.setValues(position.getRow() + 1, position.getColumn() + 1);

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;

			p.setValues(p.getRow() + 1, p.getColumn() + 1);

		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;
		}

		// BELOW
		p.setValues(position.getRow() + 1, position.getColumn());

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;

			p.setRow(p.getRow() + 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;
		}

		// SOUTHWEST
		p.setValues(position.getRow() + 1, position.getColumn() - 1);

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;

			p.setValues(p.getRow() + 1, p.getColumn() - 1);

		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;
		}

		// LEFT
		p.setValues(position.getRow(), position.getColumn() - 1);

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;

			p.setColumn(p.getColumn() - 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;
		}

		// NORTHWEST
		p.setValues(position.getRow() - 1, position.getColumn() - 1);

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;

			p.setValues(p.getRow() - 1, p.getColumn() - 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matrix[p.getRow()][p.getColumn()] = true;
		}

		return matrix;
	}

}
