
package SourceCode;

import java.io.Serializable;

public class TicTacToeBox implements Serializable {
    private String boxValue = "";

    public String getBoxValue() {
        return boxValue;
    }

    public void setBoxValue(String boxValue) {
        this.boxValue = boxValue;
    }
    public boolean isBoxEmpty(){
        if(boxValue.equals("")){
            return true;
        }
        return false;
    }

}