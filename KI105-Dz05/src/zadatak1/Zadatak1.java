/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak1 extends Application {

    private TextField tfIme = new TextField();
    private TextField tfPrezime = new TextField();
    private TextField tfEmail = new TextField();
    private PasswordField tfPassword = new PasswordField();
    private ComboBox<String> cbo1 = new ComboBox<>();
    private ComboBox<String> cbo2 = new ComboBox<>();
    private ComboBox<String> cbo3 = new ComboBox<>();
    private ComboBox<String> cbo4 = new ComboBox<>();
    private RadioButton rb1 = new RadioButton(" Zaposlen");
    private RadioButton rb2 = new RadioButton(" Nezaposlen");
    private Button btnPotvrdi = new Button("Potvrdi");

    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setStyle("-fx-background-color: AQUAMARINE");
        pane.setAlignment(Pos.CENTER);

        pane.add(new Label("Ime:"), 0, 0);
        pane.add(tfIme, 1, 0);
        pane.add(new Label("Prezime:"), 0, 1);
        pane.add(tfPrezime, 1, 1);
        pane.add(new Label("Email:"), 0, 2);
        pane.add(tfEmail, 1, 2);
        pane.add(new Label("Sirfa:"), 0, 3);
        pane.add(tfPassword, 1, 3);
        pane.add(new Label("Pol:"), 0, 4);
        pane.add(cbo1, 1, 4);
        pane.add(new Label("Godina rodjenja:"), 0, 5);
        pane.add(cbo2, 1, 5);
        pane.add(new Label("Mesec rodjenja:"), 0, 6);
        pane.add(cbo3, 1, 6);
        pane.add(new Label("Dan rodjenja:"), 0, 7);
        pane.add(cbo4, 1, 7);
        pane.add(new Label("Status zaposlenja: "), 0, 8);
        pane.add(rb1, 1, 8);
        pane.add(rb2, 1, 9);
        pane.add(btnPotvrdi, 1, 10);

        tfIme.setAlignment(Pos.BOTTOM_RIGHT);
        tfPrezime.setAlignment(Pos.BOTTOM_RIGHT);
        tfEmail.setAlignment(Pos.BOTTOM_RIGHT);
        tfPassword.setAlignment(Pos.BOTTOM_RIGHT);
        // dodajem godine u listu
        cbo1.getItems().addAll("M", "Z");
        cbo2.getItems().addAll("1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990",
                "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000");
        cbo3.getItems().addAll("Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "Septembar",
                "Oktobar", "Novembar", "Decembar");
        cbo4.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");

        // radio-button
        rb1.setTextFill(Color.BLACK);
        rb1.setContentDisplay(ContentDisplay.LEFT);
        rb2.setTextFill(Color.BLACK);
        rb2.setContentDisplay(ContentDisplay.LEFT);
        ToggleGroup radioGroup1 = new ToggleGroup();
        rb1.setToggleGroup(radioGroup1);
        rb2.setToggleGroup(radioGroup1);
        RadioButton selectedRadioButton = (RadioButton) radioGroup1.getSelectedToggle();

        //vrsim validaciju i zadajem klik event na dugme konvertuj
        btnPotvrdi.setOnAction(e -> {
            if (tfIme.getText().isEmpty() || tfPrezime.getText().isEmpty()
                    || tfEmail.getText().isEmpty() || tfPassword.getText().isEmpty()
                    || cbo1.getValue() == null || cbo2.getValue() == null
                    || cbo3.getValue() == null || cbo4.getValue() == null || radioGroup1.getSelectedToggle() == null) {
                validacijaNeusepela();
            } else {
                validacijaUspela();
            }
        });

        GridPane.setHalignment(btnPotvrdi, HPos.CENTER);

        //kreiram scenu
        Scene scena = new Scene(pane, 380, 450);
        stage.setTitle("Zadatak 1");
        stage.setScene(scena);
        stage.show();
    }

    // validacija
    public void validacijaNeusepela() {
        Alert greska = new Alert(Alert.AlertType.WARNING);
        greska.setHeaderText("Greska!!!");
        greska.setContentText("Niste popunili sva polja!");
        greska.showAndWait();
        greska.getOnCloseRequest();
    }

    public void validacijaUspela() {
        Alert greska = new Alert(Alert.AlertType.INFORMATION);
        greska.setHeaderText("Bravo!!!");
        greska.setContentText("Popunili ste sva polja!");
        greska.showAndWait();
        greska.getOnCloseRequest();
        System.exit(0);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
