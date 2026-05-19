package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private Button startButton;

    @FXML
    private Button exitButton;

    @FXML
    protected void onStartButtonClick() throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApplication.class.getResource("map-view.fxml"));
        Scene scene = new Scene(loader.load(), 750, 500);

        Stage stage = (Stage) startButton.getScene().getWindow();
        stage.setTitle("Red Summer Map");
        stage.setScene(scene);
    }

    @FXML
    protected void onExitButtonClick() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}