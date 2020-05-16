package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView EpamImageButton;

    @FXML
    private ImageView NixImageButton;

    @FXML
    private ImageView GLimageButton;

    @FXML
    private ImageView BeetrotAcademyImageButton;

    @FXML
    private Label joobleButton;

    @FXML
    private Button FindVacancyButton;

    @FXML
    private Button PlaceVacancyButton;


    @FXML
    void initialize() {

        PlaceVacancyButton.setOnAction(event -> {
            PlaceVacancyButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/list.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });


    }
}











































































































































       /* assert EpamImageButton != null : "fx:id=\"EpamImageButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert NixImageButton != null : "fx:id=\"NixImageButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert GLimageButton != null : "fx:id=\"GLimageButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert BeetrotAcademyImageButton != null : "fx:id=\"BeetrotAcademyImageButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert FindVacancyButton != null : "fx:id=\"FindVacancyButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert PlaceVacancyButton != null : "fx:id=\"PlaceVacancyButton\" was not injected: check your FXML file 'sample.fxml'.";*/
       /* PlaceVacancyButton.setOnAction(event -> {
            PlaceVacancyButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/PlaceVacancy.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        FindVacancyButton.setOnAction(event -> {
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

