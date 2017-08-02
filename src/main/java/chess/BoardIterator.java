package chess;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Chess board iterator.
 * from LEFT to RIGHT, from TOP to BOTTOM
 *
 * @author Emelyanov (02.08.17)
 */
public class BoardIterator implements Iterator<BoardCell> {

  private char[][] board;
  private int rowCursor;
  private int colCursor;

  public BoardIterator(char[][] board, int startRow, int startCol) {
    this.board = board;
    this.rowCursor = startRow;
    this.colCursor = startCol;
  }

  public boolean hasNext() {
    return !(rowCursor == 7 && colCursor == 8);
  }

  public BoardCell next() {
    if (colCursor == 8) {
      colCursor = 0;
      rowCursor++;
    }
    String figureType = String.valueOf((board[rowCursor][colCursor]));
    BoardCell boardCell = new BoardCell(figureType, rowCursor, colCursor);
    colCursor++;
    return boardCell;
  }

  public List<BoardCell> getCells(boolean addEmptyCells) {
    List<BoardCell> cells = new ArrayList<>();
    while (hasNext()) {
      BoardCell cell = next();
      if (!addEmptyCells && cell.isEmpty())
        continue;
      cells.add(cell);
    }
    return cells;
  }

}
