package GUI;

import SourceCode.GameBoard;
import SourceCode.Storage;
import SourceCode.TestObject;
import SourceCode.TicTacToeBox;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

public class UnitTest {
    @Test
    public void boxTest(){
        //GameBoard gameBoard = new GameBoard();
        //gameBoard.setBoxElements(1,1,"X");
        //Assert.assertEquals("X",gameBoard.getBoxElement(1,1));
        //Storage.storeObject(gameBoard,"gameBoard");
        GameBoard gameBoard1 =(GameBoard) Storage.getObject("gameBoard");
        Assert.assertEquals("X",gameBoard1.getBoxElement(1,1));

    }
}
