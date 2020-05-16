package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FindVcController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button FindVacancyButton;

    @FXML
    private Button PlaceVacancyButton;

    @FXML
    void initialize() {

    }
}







































































































       /* assert FindVacancyButton != null : "fx:id=\"FindVacancyButton\" was not injected: check your FXML file 'FindVacancy.fxml'.";
        assert PlaceVacancyButton != null : "fx:id=\"PlaceVacancyButton\" was not injected: check your FXML file 'FindVacancy.fxml'.";*/


        /*PlaceVacancyButton.setOnAction(event -> {
            PlaceVacancyButton.getScene().getWindow().hide();
            FXMLLoader loadere = new FXMLLoader();
            loadere.setLocation(getClass().getResource("/sample/PlaceVacancy.fxml"));
            try {
                loadere.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent roote = loadere.getRoot();
            Stage stagee = new Stage();
            stagee.setScene(new Scene(roote));
            stagee.showAndWait();
        });*/

       /* FindVacancyButton.setOnAction(event -> {
            FindVacancyButton.getScene().getWindow().hide();
            FXMLLoader loadern = new FXMLLoader();
            loadern.setLocation(getClass().getResource("/sample/FindVacancy.fxml"));
            try {
                loadern.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent rootn = loadern.getRoot();
            Stage stagen = new Stage();
            stagen.setScene(new Scene(rootn));
            stagen.showAndWait();
        });*/



