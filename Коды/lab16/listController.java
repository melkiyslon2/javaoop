package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;

public class listController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<SecondCreate> TableView;

    @FXML
    private TableColumn<SecondCreate, String> company;

    @FXML
    private TableColumn<SecondCreate, String> specialisation;

    @FXML
    private TableColumn<SecondCreate, String> workingConditions;

    @FXML
    private TableColumn<SecondCreate, String> payment;

    @FXML
    private TableColumn<SecondCreate, String> workingExperience;

    @FXML
    private TableColumn<SecondCreate, String> education;

    @FXML
    private TableColumn<SecondCreate, String> English;

    @FXML
    private TableColumn<SecondCreate, String> License;

    @FXML
    private Button DeleteButton;

    @FXML
    private Button EditButton;

    @FXML
    private Button AddButton;

    @FXML
    private TextField SearchField;

    @FXML
    private Button FindButton;

    @FXML
    private TextField companyButton;

    @FXML
    private TextField workingExpButton;

    @FXML
    private TextField paymentButton;

    @FXML
    private TextField conditionsButton;

    @FXML
    private TextField specialisationButton;

    @FXML
    private TextField LicenseButton;

    @FXML
    private TextField educationButton;

    @FXML
    private TextField EnglishButton;

    @FXML
    private Label joobleButton;

    @FXML
    private Button FindVacancyButton;

    @FXML
    private Button PlaceVacancyButton;

    @FXML
    private void add() {
        items.add(new SecondCreate(companyButton.getText(), specialisationButton.getText(), conditionsButton.getText(), paymentButton.getText(),
                workingExpButton.getText(), educationButton.getText(), EnglishButton.getText(), LicenseButton.getText()));
        companyButton.clear();
        specialisationButton.clear();
        conditionsButton.clear();
        paymentButton.clear();
        workingExpButton.clear();
        educationButton.clear();
        EnglishButton.clear();
        LicenseButton.clear();
    }

   /* @FXML
    private void SearchBtn()
    {
        *//*PlaceVacancyButton.setOnAction(event -> {
            searchField();
        });*//*
        searchField();

    }*/


    private FilteredList<SecondCreate> filterdata;

    @FXML
    public void SearchBtn()
    {

        SearchField.textProperty().addListener((o, ov, nv) -> {
            filterdata.setPredicate((SecondCreate s) -> {
                String newVal=nv.toLowerCase();

                return s.getCompany().toLowerCase().contains(newVal);

                //return false;
            });
        });

        TableView.setItems(filterdata);
    }





    @FXML
    private void delete()
    {
        ObservableList<SecondCreate> selectedRows, allPeople;

        allPeople = TableView.getItems();

        //this gives us the rows that were selected
        selectedRows = TableView.getSelectionModel().getSelectedItems();

        //loop over the selected rows and remove the Person objects from the table
        for (SecondCreate person: selectedRows)
        {
            allPeople.remove(person);
        }

    }

    @FXML
    private void edit()
    {
        TableView.refresh();
    }

    public void editCompany(TableColumn.CellEditEvent edittedCell)
    {
    SecondCreate person = TableView.getSelectionModel().getSelectedItem();
    person.setCompany(edittedCell.getNewValue().toString());
    }



    ObservableList<SecondCreate> items = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        filterdata = new FilteredList<SecondCreate>(items ,e->true);
    TableView.itemsProperty().setValue(items);

    company.setCellValueFactory(param-> new SimpleStringProperty(param.getValue().getCompany()));
        specialisation.setCellValueFactory(param-> new SimpleStringProperty(param.getValue().getSpecialisation()));
        workingConditions.setCellValueFactory(param-> new SimpleStringProperty(param.getValue().getWorkingConditions()));
        payment.setCellValueFactory(param-> new SimpleStringProperty(param.getValue().getPayment()));
        workingExperience.setCellValueFactory(param-> new SimpleStringProperty(param.getValue().getWorkingExperience()));
        education.setCellValueFactory(param-> new SimpleStringProperty(param.getValue().getEducation()));
        English.setCellValueFactory(param-> new SimpleStringProperty(param.getValue().getEnglish()));
        License.setCellValueFactory(param-> new SimpleStringProperty(param.getValue().getLicence()));

        TableView.setEditable(true);
        company.setCellFactory(TextFieldTableCell.forTableColumn());

    }


}

