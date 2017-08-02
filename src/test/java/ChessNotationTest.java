import chess.Board;
import chess.BoardCell;
import chess.utils.FenUtils;
import chess.utils.FigureType;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Comparator;
import java.util.concurrent.ExecutionException;

/**
 * @author Emelyanov (02.08.17)
 */
public class ChessNotationTest {

  private static final Board QUEENS_BOARD = FenUtils.importFromFEN(FenUtils.QUEENS_FEN);

  @Test
  public void testDefaultFigurePositionParcer() throws IOException, ExecutionException, InterruptedException {
    String positions = FenUtils.getFigurePositions(FenUtils.DEFAULT_FEN);
    Assert.assertEquals("rnbqkbnr" + "pppppppp" + "********" + "********" + "********" + "********" + "PPPPPPPP" +
        "RNBQKBNR", positions);
  }

  @Test
  public void testQueensPositionParcer() throws IOException, ExecutionException, InterruptedException {
    String positions = FenUtils.getFigurePositions(FenUtils.QUEENS_FEN);
    Assert.assertEquals("***Q****" + "******Q*" + "**Q*****" + "*******Q" + "*Q******" + "****Q***" + "Q*******" +
        "*****Q**", positions);
  }

  @Test
  public void testQueenPosition() {
    BoardCell cell = QUEENS_BOARD.getBoardCell(2, 2);
    Assert.assertEquals("C6", cell.getCellCoordinates());
  }

  @Test
  public void testEmptyPosition() {
    BoardCell cell = QUEENS_BOARD.getBoardCell(2, 2);
    Assert.assertEquals(FigureType.QUEEN, cell.getFigure().getType());
  }

  @Test
  public void testCellsInfo() {
    String notation = QUEENS_BOARD.printCellsInfo(0, 0, false, null, ';', false);
    Assert.assertEquals("D8;G7;C6;H5;B4;E3;A2;F1", notation);
  }

  @Test
  public void testSortedCellsInfo() {
    String notation = QUEENS_BOARD.printCellsInfo(0, 0, false,
        Comparator.comparing(BoardCell::getCellCoordinates), ',', false);
    Assert.assertEquals("A2,B4,C6,D8,E3,F1,G7,H5", notation);
  }
}
