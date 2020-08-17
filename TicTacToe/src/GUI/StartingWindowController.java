package GUI;

import SourceCode.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StartingWindowController {
   SceneChanger sceneChanger = new SceneChanger();
    @FXML
    AnchorPane pane;
    public void onActionStart () throws Exception{
        AI ai = new RandomAI();
        Storage.storeObject(ai,"AI");
        GameBoard gameBoard = new GameBoard();
        Storage.storeObject(gameBoard,"gameBoard");
        sceneChanger.sceneChange("UIClassic.fxml",pane);



    }
    public void onActionStart2 () throws Exception{
        AI ai = new DefensiveAI();
        Storage.storeObject(ai,"AI");
        GameBoard gameBoard = new GameBoard();
        Storage.storeObject(gameBoard,"gameBoard");
        sceneChanger.sceneChange("UIClassic.fxml",pane);

    }
}
