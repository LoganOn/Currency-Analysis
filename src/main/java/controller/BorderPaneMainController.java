package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;


import java.io.IOException;
import java.time.LocalDate;

public class BorderPaneMainController {
    private LocalDate localDate;
    private LocalDate date;
    ObservableList currencyList = FXCollections.observableArrayList("USD", "EUR", "GBP", "CHF", "AUD", "CAD", "SGD", "JPY","RUB","SEK");
    ObservableList analysisList = FXCollections.observableArrayList("Wyznaczenie ilości sesji", "Miary statystyczne", "Rozkład częstości zmian");
    ObservableList periodList = FXCollections.observableArrayList("Tydzień" , "2 Tygodnie", "Miesiąc", "1/4 Roku", "1/2 Roku", "Rok");
    @FXML
    private CheckBox currencyBox2;
    @FXML
    private ChoiceBox currencyChoiceBox1;
    @FXML
    private ChoiceBox currencyChoiceBox2;
    @FXML
    private ChoiceBox analysisChoiceBox;
    @FXML
    private ChoiceBox periodChoiceBox;
    @FXML
    private Button quitButton;
    @FXML
    private Button applyButton;

    public BorderPaneMainController() throws IOException {
    }

    @FXML
    private void initialize() {
        currencyChoiceBox1.setValue("USD");
        currencyChoiceBox1.setItems(currencyList);
        currencyChoiceBox2.setItems(currencyList);
        analysisChoiceBox.setValue("Wyznaczenie ilości sesji");
        analysisChoiceBox.setItems(analysisList);
        periodChoiceBox.setValue("Tydzień");
        periodChoiceBox.setItems(periodList);
    }

    @FXML
    private void quitOnClick() {

    }

    @FXML
    private void applyOnClick() {

    }
}