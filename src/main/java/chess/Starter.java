package chess;

import chess.utils.FenUtils;

import java.util.Comparator;

/**
 * @author Emelyanov (01.08.17)
 */
public class Starter {

  public static void main(String[] args) {
    Board board = FenUtils.importFromFEN(args.length != 0 ? args[0] : FenUtils.QUEENS_FEN);
    System.out.println(board.printBoard());
    System.out.println("==================================\n");
    System.out.println(board.printCellsInfo(0, 0, false,
        Comparator.comparing(BoardCell::getCellCoordinates), ',', false));
  }
}

