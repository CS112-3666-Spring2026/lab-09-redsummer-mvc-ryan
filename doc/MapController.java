package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import cs112.lab09.models.Date;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MapController {
    @FXML
    private Button tulsaOkButton;

    @FXML
    private Button chicagoIlButton;

    @FXML
    protected void onTulsaOkButtonClick() throws Exception {
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(
                "A violent race riot occurred in Tulsa after an accusation against a Black teenager.",
                new Date(5, 31, 1921),
                "The Tulsa Race Massacre was a white mob attack on the Greenwood District, a prosperous Black community known as Black Wall Street. Homes and businesses were destroyed, residents were killed, and survivors were displaced.",
                "https://www.smithsonianmag.com/history/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/"
        );

        openEventWindow("Tulsa, Oklahoma", event);
    }

    @FXML
    protected void onChicagoIlButtonClick() throws Exception {
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(
                "Racial conflict broke out in Chicago during the summer of 1919.",
                new Date(7, 27, 1919),
                "The Chicago Race Riot of 1919 began after a Black teenager, Eugene Williams, was killed after drifting into a segregated area of Lake Michigan. The violence that followed reflected housing segregation, labor tension, and white hostility toward Black residents.",
                "https://www.history.com/topics/black-history/chicago-race-riot-of-1919"
        );

        openEventWindow("Chicago, Illinois", event);
    }

    private void openEventWindow(String location, RevisedHistoricalEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApplication.class.getResource("event-view.fxml"));
        Scene scene = new Scene(loader.load(), 600, 450);

        EventController controller = loader.getController();
        controller.initData(location, event);

        Stage stage = new Stage();
        stage.setTitle(location);
        stage.setScene(scene);
        stage.show();
    }
}