package chess.figures;

import chess.utils.FigureColor;
import chess.utils.FigureType;

/**
 * @author Emelyanov (01.08.17)
 */
public class Figure {
  private FigureAtribute attributes;

  public Figure(String type) {
    this(FigureAttributes.valueOf(type));
  }

  public Figure(FigureAtribute attributes) {
    this.attributes = attributes;
  }

  public FigureType getType() {
    return attributes.getType();
  }

  public FigureColor getColor() {
    return attributes.getColor();
  }

  @Override
  public String toString() {
    return getColor() + " " + getType();
  }
}
