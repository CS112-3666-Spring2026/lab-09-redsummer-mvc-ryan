package cs112.lab09.controllers;

import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class EventController {
    @FXML
    private Label locationLabel;

    @FXML
    private Label dateLabel;

    @FXML
    private Label originalDescriptionLabel;

    @FXML
    private Label revisedDescriptionLabel;

    @FXML
    private Label citationLabel;

    @FXML
    private Button closeButton;

    public void initData(String location, RevisedHistoricalEvent event) {
        locationLabel.setText(location);
        dateLabel.setText(event.getEventDay().toString());
        originalDescriptionLabel.setText(event.getDescription());
        revisedDescriptionLabel.setText(event.getRevisedDescription());
        citationLabel.setText("Source: " + event.getCitation());
    }

    @FXML
    protected void onCloseButtonClick() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}