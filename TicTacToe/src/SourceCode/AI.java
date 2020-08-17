package SourceCode;

import java.io.Serializable;

public interface AI extends Serializable {
    public String makeTurn(GameBoard gameBoard);
}
