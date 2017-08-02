package chess;

import chess.utils.StringUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Emelyanov (01.08.17)
 */
public final class Board {

  private char[][] cells = new char[8][8];

  public Board(String posisitions) {
    for (int row = 0; row < 8; row++)
      for (int col = 0; col < 8; col++)
        this.cells[col][row] = posisitions.charAt(row + col * 8);
  }

  public char[][] getCells() {
    return cells;
  }

  @Override
  public String toString() {
    return Arrays.deepToString(getCells());
  }

  public List<BoardCell> getBoardCells(int row, int col, boolean addEmptyCells, Comparator<BoardCell> comparator) {
    BoardIterator it = new BoardIterator(getCells(), row, col);
    List<BoardCell> cells = it.getCells(addEmptyCells);
    if (comparator != null)
      cells.sort(comparator);
    return cells;
  }

  public BoardCell getBoardCell(int row, int col) {
    String figureType = String.valueOf(getCells()[row][col]);
    return new BoardCell(figureType, row, col);
  }

  public String printBoard() {
    StringBuilder result = new StringBuilder("");
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++)
        result.append(cells[i][j]).append(" | ");
      result.append("\n");
    }
    return result.toString();
  }

  public String printCellsInfo(int row, int col) {
    return printCellsInfo(row, col, true, null, ';', false);
  }

  public String printCellsInfo(int row, int col, boolean addEmptyCells, Comparator<BoardCell> sort,
                               char delimiter, boolean addFigureInfo) {
    List<BoardCell> cells = getBoardCells(row, col, addEmptyCells, sort);
    return StringUtils.toDelimitedString(delimiter,
        cell -> addFigureInfo ? cell.printCellInfo() : cell.getCellCoordinates(),
        cells.toArray(new BoardCell[cells.size()]));
  }


}
