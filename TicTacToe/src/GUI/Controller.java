package GUI;

import SourceCode.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public abstract class Controller {

    SceneChanger sceneChanger = new SceneChanger();
    AI ai = (AI) Storage.getObject("AI") ;
    @FXML
    AnchorPane pane;
    GameBoard gameBoard = (GameBoard) Storage.getObject("gameBoard");
    @FXML
    public Button box11,box12,box13,box21,box22,box23,box31,box32,box33;


    public void box11OnMouseClick(){
        makeTurn(box11,1,1);

        if(!pane.isDisable())
            aiMakeTurn();



    }
    public void box12OnMouseClick(){
        makeTurn(box12,1,2);

        if(!pane.isDisable())
            aiMakeTurn();

    }
    public void box13OnMouseClick(){
        makeTurn(box13,1,3);

        if(!pane.isDisable())
            aiMakeTurn();


    }
    public void box21OnMouseClick(){
        makeTurn(box21,2,1);

        if(!pane.isDisable())
            aiMakeTurn();

    }
    public void box22OnMouseClick(){
        makeTurn(box22,2,2);

        if(!pane.isDisable())
            aiMakeTurn();

    }
    public void box23OnMouseClick(){
        makeTurn(box23,2,3);

        if(!pane.isDisable())
            aiMakeTurn();

    }
    public void box31OnMouseClick(){
        makeTurn(box31,3,1);

        if(!pane.isDisable())
            aiMakeTurn();
    }
    public void box32OnMouseClick(){
        makeTurn(box32,3,2);

        if(!pane.isDisable())
            aiMakeTurn();
    }
    public void box33OnMouseClick(){
        makeTurn(box33,3,3);


        if(!pane.isDisable())
            aiMakeTurn();

    }

    //    public static char makeTurn(GameBoard gameBoard){
//        System.out.println(gameBoard.numberOfGameBoardElement());
//
//    }
    public void makeTurn(Button button,int row,int column){
        if(gameBoard.numberOfGameBoardElement()%2==0){
            gameBoard.setBoxElements(row,column,"X");
            setButton(button,gameBoard.getBoxElement(row,column));

        }
        else{
            gameBoard.setBoxElements(row,column,"O");
            setButton(button,gameBoard.getBoxElement(row,column));
        }



    }
    public String showGameResult(){
        if(GameStatus.checkGameStatusWin(gameBoard)){
            return "Win";
        }
        else if(GameStatus.checkGameStatusDraw(gameBoard)){
            return "Draw";
        }
        return "No Result";

    }

    public void setButton(Button button,String value){

    }
    public void highContrastOnAction()throws Exception{

    }
    public void classicOnAction()throws Exception{

    }
    public void forestOnAction()throws Exception{

    }
    public void endGameOnAction(){

    }
//    void initialize(){
//        setButton(box11,gameBoard.getBoxElement(1,1));
//        setButton(box12,gameBoard.getBoxElement(1,2));
//        setButton(box13,gameBoard.getBoxElement(1,3));
//        setButton(box21,gameBoard.getBoxElement(2,1));
//        setButton(box22,gameBoard.getBoxElement(2,2));
//        setButton(box23,gameBoard.getBoxElement(2,3));
//        setButton(box31,gameBoard.getBoxElement(3,1));
//        setButton(box32,gameBoard.getBoxElement(3,2));
//        setButton(box33,gameBoard.getBoxElement(3,3));
//    }


    public Controller() {

    }
    public void aiMakeTurn() {
        switch (ai.makeTurn(gameBoard)){
            case "11":
                makeTurn(box11,1,1);
                break;
            case "12":
                makeTurn(box12,1,2);
                break;
            case"13":
                makeTurn(box13,1,3);
                break;
            case "21":
                makeTurn(box21,2,1);
                break;
            case "22":
                makeTurn(box22,2,2);
                break;
            case "23":
                makeTurn(box23,2,3);
                break;
            case "31":
                makeTurn(box31,3,1);
                break;
            case "32":
                makeTurn(box32,3,2);
                break;
            case "33":
                makeTurn(box33,3,3);
                break;
        }
    }
}
