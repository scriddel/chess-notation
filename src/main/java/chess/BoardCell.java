package chess;

import chess.figures.Figure;
import chess.figures.FigureAttributes;

/**
 * @author Emelyanov (01.08.17)
 */
public class BoardCell {

  public static final String EMPTY_CELL = "*";

  private Figure figure;
  private int row;
  private int col;

  public BoardCell(String figureType, int row, int col) {
    this(!EMPTY_CELL.equals(figureType) ? new Figure(FigureAttributes.valueOf(figureType)) : null, row, col);
  }

  public BoardCell(Figure figure, int row, int col) {
    this.figure = figure;
    this.row = row;
    this.col = col;
  }

  public Figure getFigure() {
    return figure;
  }

  public int getRow() {
    return row;
  }

  public int getCol() {
    return col;
  }

  public boolean isEmpty() {
    return getFigure() == null;
  }

  public String getCellCoordinates() {
    char c = (char) (65 + getCol());
    return String.valueOf(c) + String.valueOf(8 - getRow());
  }

  public String printCellInfo() {
    StringBuilder sb = new StringBuilder(getCellCoordinates());
    if (!isEmpty())
      sb.append("(").append(getFigure().toString()).append(")");
    return sb.toString();
  }

  @Override
  public String toString() {
    return "cell " + getCellCoordinates() + "; " + (isEmpty() ? "empty" : "figure " + getFigure().toString());
  }
}
