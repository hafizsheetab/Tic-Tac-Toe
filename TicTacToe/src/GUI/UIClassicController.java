package GUI;

import SourceCode.GameStatus;
import SourceCode.Storage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UIClassicController extends Controller {
    @Override
    public void setButton(Button button, String value) {
        if(value.equals("")){

        }
        else{
            button.setText(value);
            button.setDisable(true);
            button.setStyle("-fx-opacity: 1.0;-fx-background-color: white; -fx-text-fill: black;");
            endGameOnAction();
        }
    }

    @Override
    public void endGameOnAction()  {
        super.endGameOnAction();
        if(showGameResult().equals("No Result")){

        }
        else{
            System.out.println(showGameResult());
            pane.setDisable(true);
        }



    }

    @Override
    public void highContrastOnAction() throws Exception {
        super.highContrastOnAction();
        //Storage.storeObject(gameBoard,"gameBoard");
        sceneChanger.sceneChange("UIHighContrast.fxml",pane);

    }
    public void forestOnAction() throws Exception {
        //Storage.storeObject(gameBoard,"gameBoard");
        sceneChanger.sceneChange("UIForest.fxml",pane);
    }
}
