package SourceCode;

import jdk.nashorn.internal.runtime.linker.InvokeByName;
import org.junit.internal.runners.statements.InvokeMethod;

import java.util.Random;

public class RandomAI implements AI {

    public String makeTurn(GameBoard gameBoard) {
        Integer row;
        Integer column;
        while (true) {
            row = getRandomNumber(1, 4);
            column = getRandomNumber(1, 4);
            if (gameBoard.isBoxEmpty(row, column)) {
                break;
            }

        }

//        gameBoard.setBoxElements(row,column,value);
//        return gameBoard;

        return row.toString() + column.toString();
    }


    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }




}
