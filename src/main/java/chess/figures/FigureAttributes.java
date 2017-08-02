package chess.figures;

import chess.utils.FigureColor;
import chess.utils.FigureType;

/**
 * @author Emelyanov (01.08.17)
 */
public enum FigureAttributes implements FigureAtribute {

  K {
    @Override
    public FigureType getType() {
      return FigureType.KING;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.WHITE;
    }
  },
  Q {
    @Override
    public FigureType getType() {
      return FigureType.QUEEN;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.WHITE;
    }
  },

  B {
    @Override
    public FigureType getType() {
      return FigureType.BISHOP;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.WHITE;
    }
  },

  R {
    @Override
    public FigureType getType() {
      return FigureType.ROOK;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.WHITE;
    }
  },

  N {
    @Override
    public FigureType getType() {
      return FigureType.KNIGHT;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.WHITE;
    }
  },

  P {
    @Override
    public FigureType getType() {
      return FigureType.PAWN;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.WHITE;
    }
  },

  k {
    @Override
    public FigureType getType() {
      return FigureType.KING;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.BLACK;
    }
  },

  q {
    @Override
    public FigureType getType() {
      return FigureType.QUEEN;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.BLACK;
    }
  },

  b {
    @Override
    public FigureType getType() {
      return FigureType.BISHOP;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.BLACK;
    }
  },

  r {
    @Override
    public FigureType getType() {
      return FigureType.ROOK;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.BLACK;
    }
  },

  n {
    @Override
    public FigureType getType() {
      return FigureType.KNIGHT;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.BLACK;
    }
  },

  p {
    @Override
    public FigureType getType() {
      return FigureType.PAWN;
    }

    @Override
    public FigureColor getColor() {
      return FigureColor.BLACK;
    }
  };
}
