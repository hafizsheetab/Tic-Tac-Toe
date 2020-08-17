package SourceCode;

import java.io.Serializable;

public class GameBoard implements Serializable {


    private TicTacToeBox[][]boxes = new TicTacToeBox[3][3];

    public GameBoard() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                boxes[i][j] = new TicTacToeBox();
            }
        }
    }




    public boolean checkBoardIsFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(boxes[i][j].isBoxEmpty()){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean checkAngularMatch(){
        if(checkBoxesAreEqual(boxes[0][0],boxes[1][1],boxes[2][2]))
            return true;
        else return checkBoxesAreEqual(boxes[0][2], boxes[1][1], boxes[2][0]);
    }
    public boolean checkVerticalMatch(){
        if(checkBoxesAreEqual(boxes[0][0],boxes[1][0],boxes[2][0]))
            return true;
        else if(checkBoxesAreEqual(boxes[0][1],boxes[1][1],boxes[2][1]))
            return true;
        else return checkBoxesAreEqual(boxes[0][2],boxes[1][2],boxes[2][2]);

    }
    public boolean checkHorizontalMatch(){
        if(checkBoxesAreEqual(boxes[0][0],boxes[0][1],boxes[0][2]))
            return true;
        if(checkBoxesAreEqual(boxes[1][0],boxes[1][1],boxes[1][2]))
            return true;
        else return checkBoxesAreEqual(boxes[2][0],boxes[2][1],boxes[2][2]);
    }
    private boolean checkBoxesAreEqual(TicTacToeBox box1,TicTacToeBox box2,TicTacToeBox box3){
        if(box1.isBoxEmpty()||box2.isBoxEmpty()||box3.isBoxEmpty()){

        }
        else{
            if(box1.getBoxValue().equals(box2.getBoxValue()) && box1.getBoxValue().equals(box3.getBoxValue())){
                return true;
            }
        }

        return false;

    }
    public void setBoxElements(int row,int column,String value){

            boxes[row-1][column-1].setBoxValue(value);
        



    }
    public boolean isGameBoardEmpty(){
        if(numberOfGameBoardElement()<9){
            return true;
        }
        return false;
    }
    public boolean isBoxEmpty(int row,int column){
        return boxes[row-1][column-1].isBoxEmpty();
    }
    public String getBoxElement(int row,int column){
        return boxes[row-1][column-1].getBoxValue();
    }
    public int numberOfGameBoardElement(){
        int count = 0;
        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                if(boxes[i][j].isBoxEmpty()){

                }
                else
                    count ++;
            }
        }
        return count;
    }


}
