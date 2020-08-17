package SourceCode;

import java.io.Serializable;

public class GameStatus implements Serializable {

    public static boolean checkGameStatusDraw(GameBoard gameBoard){
        if(gameBoard.checkBoardIsFull()){
            return true;
        }
        return false;
    }
    public static boolean checkGameStatusWin(GameBoard gameBoard){
        if(gameBoard.checkAngularMatch()||gameBoard.checkHorizontalMatch()||gameBoard.checkVerticalMatch()){
            return true;
        }
        return false;

    }




}
