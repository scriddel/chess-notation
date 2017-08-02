package chess.utils;

import chess.Board;
import chess.BoardCell;


/**
 * @author Emelyanov (01.08.17)
 */
public final class FenUtils {

  public static final String DEFAULT_FEN = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";
  public static final String QUEENS_FEN = "3Q4/6Q1/2Q5/7Q/1Q6/4Q3/Q7/5Q2 w KQkq - 0 1";
  private static final char SEPARATOR = '/';

  public static Board importFromFEN(String fen) {
    return createBoard(getFigurePositions(fen));
  }

  public static String getFigurePositions(String fen) {
    final String[] fenParts = fen.trim().split(" ");
    // рассматриваем только первый сегмент записи - положение фигур на доске
    String configuration = fenParts[0];
    StringBuilder positions = new StringBuilder();
    for (int i = 0; i < configuration.length(); i++) {
      char current = fen.charAt(i);
      if (SEPARATOR != current) {
        if ((current >= '1') && (current <= '8')) {
          int val = Character.getNumericValue(current);
          for (int j = 0; j < val; j++)
            positions.append(BoardCell.EMPTY_CELL);
        } else
          positions.append(current);
      }
    }
    return positions.toString();
  }

  public static Board createBoard(String str) {
    if (str.length() != 64)
      throw new RuntimeException("Invalid configuration params: " + str);
    return new Board(str);
  }

}
