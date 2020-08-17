package GUI;


import SourceCode.Storage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class UIForestController extends Controller {
    BackgroundSize size = new BackgroundSize(67.0,62.0,false,false,false,false);
    BackgroundImage iconAi = new BackgroundImage( new Image( getClass().getResource("Ai.png").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,size);
    Background backgroundAi = new Background(iconAi);
    BackgroundImage iconPlayer = new BackgroundImage( new Image( getClass().getResource("Player.png").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,size);
    Background backgroundPlayer = new Background(iconPlayer);
    @Override
    public void setButton(Button button, String value) {
        super.setButton(button, value);
        if(value.equals("")){

        }
        else {
            switch (value) {

                case "X":
                    button.setStyle("-fx-opacity: 1.0");
                    button.setBackground(backgroundPlayer);
                    button.setDisable(true);
                    break;
                case"O":
                    button.setStyle("-fx-opacity: 1.0");
                    button.setBackground(backgroundAi);
                    button.setDisable(true);
                    break;
            }
            endGameOnAction();
        }
    }

    @Override
    public void endGameOnAction() {
        super.endGameOnAction();
        super.endGameOnAction();
        if(showGameResult().equals("No Result")){

        }
        else{
            System.out.println(showGameResult());
            pane.setDisable(true);
            pane.setStyle("-fx-opacity: 1.0;-fx-background-color: lightGreen;");
        }
    }

    public void highContrastOnAction() throws Exception {
        super.highContrastOnAction();
        //Storage.storeObject(gameBoard,"gameBoard");
        sceneChanger.sceneChange("UIHighContrast.fxml",pane);
    }
    public void classicOnAction() throws Exception {
        super.classicOnAction();
        //Storage.storeObject(gameBoard,"gameBoard");
        sceneChanger.sceneChange("UIClassic.fxml",pane);
    }
}
