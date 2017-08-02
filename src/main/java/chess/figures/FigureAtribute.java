package chess.figures;

import chess.utils.FigureColor;
import chess.utils.FigureType;

/**
 * @author Emelyanov (01.08.17)
 */
public interface FigureAtribute {

  FigureType getType();

  FigureColor getColor();

}
