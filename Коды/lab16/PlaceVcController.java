package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PlaceVcController {

    @FXML
    private TextField companyField;

    @FXML
    private TextField specialisationField;

    @FXML
    private TextField workingConditions;

    @FXML
    private TextField paymentField;

    @FXML
    private TextField epxField;

    @FXML
    private TextField educationField;

    @FXML
    private TextField EnglishField;

    @FXML
    private TextField licenseField;

    @FXML
    private Button PvSubmitButton;

    @FXML
    private Button FindVacancyButton;

    @FXML
    private Button PlaceVacancyButton;

    @FXML
    void submit(ActionEvent event) throws IOException {
       /* FXMLLoader loader = new FXMLLoader(getClass().getResource("sample/list.fxml"));
        Parent root = (Parent)loader.load();*/


        /*FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/list.fxml"));
        try {
            loader.load();
            listController listController = loader.getController();
            listController.myFunction(companyField.getText(),specialisationField.getText(),workingConditions.getText(),paymentField.getText(),
                    epxField.getText(),educationField.getText(),EnglishField.getText(),licenseField.getText());
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/list.fxml"));
            root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Second window");

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.initOwner(PvSubmitButton.getScene().getWindow());

            //SecondWindowController controller = loader.getController();
            //controller.someMethodCall();

            stage.showAndWait();
        } catch (Exception exc) {
            exc.printStackTrace();
        }



        /*Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();*/

    }

    @FXML
    void initialize()
    {

    }

}
















































































        /*assert FindVacancyButton != null : "fx:id=\"FindVacancyButton\" was not injected: check your FXML file 'PlaceVacancy.fxml'.";
        assert PlaceVacancyButton != null : "fx:id=\"PlaceVacancyButton\" was not injected: check your FXML file 'PlaceVacancy.fxml'.";*/
        /*PlaceVacancyButton.setOnAction(event -> {
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
        });*/

        /*FindVacancyButton.setOnAction(event -> {
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
/*PvSubmitButton.setOnAction(event -> {
    String company = companyField.getText().trim();
    String specialisation = specialisationField.getText().trim();
    String conditions = conditionsField.getText().trim();
    String payment = paymentField.getText().trim();
    String experience = epxField.getText().trim();
    String education = educationField.getText().trim();
    String english = EnglishField.getText().trim();
    String license = licenseField.getText().trim();

    if(!company.equals("") && specialisation.equals("") && conditions.equals("") && payment.equals("") && experience.equals("") && education.equals("") && english.equals("") && license.equals(""))
    {
        AddVacancy(company,specialisation,conditions,payment,experience,education,english,license);
    }else
    {
        System.out.println("U entered uncorrect data");
    }
});*/
        /*DatabaseHandler dbHandler = new DatabaseHandler();
        PvSubmitButton.setOnAction(event -> {
            dbHandler.AddVacancy(companyField.getText(),specialisationField.getText(),conditionsField.getText(),paymentField.getText(),epxField.getText(),educationField.getText(),EnglishField.getText(),licenseField.getText());
                });

    }

    private void AddVacancy(String company, String specialisation, String conditions, String payment, String experience, String education, String english, String license) {
    }*/
