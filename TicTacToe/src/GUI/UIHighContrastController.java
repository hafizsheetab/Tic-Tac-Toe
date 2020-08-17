package GUI;

import SourceCode.Storage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.junit.Assert;

public class UIHighContrastController extends Controller{

    @Override
    public void setButton(Button button, String value) {
        super.setButton(button, value);
        if(value.equals("")){

        }
        switch (value) {
            case "X":
                button.setDisable(true);
                button.setStyle("-fx-opacity: 1.0;-fx-background-color: black;");
                break;
            case"O":
                button.setDisable(true);
                button.setStyle("-fx-opacity: 1.0;-fx-background-color: white;");
                break;
        }
        endGameOnAction();
    }

    @Override
    public void endGameOnAction() {
        super.endGameOnAction();
        if(showGameResult().equals("No Result")){

        }
        else{
            System.out.println(showGameResult());
            pane.setDisable(true);
            pane.setStyle("-fx-opacity: 1.0;-fx-background-color: darkGrey;");
        }
    }

    @Override
    public void classicOnAction() throws Exception {
        super.classicOnAction();
        //Storage.storeObject(gameBoard,"gameBoard");
        sceneChanger.sceneChange("UIClassic.fxml",pane);
    }

    @Override
    public void forestOnAction() throws Exception {
        super.forestOnAction();
        //Storage.storeObject(gameBoard,"gameBoard");
        sceneChanger.sceneChange("UIForest.fxml",pane);
    }
}
