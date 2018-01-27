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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak1 extends Application {

    //definisem sve elemente koje cu imati na ekranu
    private TextField tfStranicaKvardata = new TextField();
    private TextField tfStranicaTrougla = new TextField();
    private TextField tfDuzinaPravougaonika = new TextField();
    private TextField tfSirinaPravougaonika = new TextField();
    private Button btnIzracunaj = new Button("Izracunaj");
    private Label tfPovrsinaKvadrata = new Label(" ");
    private Label tfPovrsinaTrougla = new Label(" ");
    private Label tfPovrsinaPravougaonika = new Label(" ");

    @Override
    public void start(Stage stage) {
        //kreriram GridPAne GUI-interfejs
        GridPane interfejs = new GridPane();
        interfejs.setHgap(5);
        interfejs.setVgap(5);
        interfejs.setAlignment(Pos.CENTER);
        interfejs.setStyle("-fx-background-color: #ADD8E6");
        // dodajem elemente na GridPanl, tj. GUI interfejs
        interfejs.add(new Label("Stranica kvadrata: "), 0, 0);
        interfejs.add(tfStranicaKvardata, 1, 0);
        interfejs.add(new Label("Stranica trougla: "), 0, 1);
        interfejs.add(tfStranicaTrougla, 1, 1);
        interfejs.add(new Label("Duzina pravougaonika: "), 0, 2);
        interfejs.add(tfDuzinaPravougaonika, 1, 2);
        interfejs.add(new Label("Sirina pravougaonika: "), 0, 3);
        interfejs.add(tfSirinaPravougaonika, 1, 3);
        interfejs.add(btnIzracunaj, 1, 4);
        interfejs.add(new Label("Povrsina kvadrata: "), 0, 5);
        interfejs.add(tfPovrsinaKvadrata, 1, 5);
        interfejs.add(new Label("Povrsina trougla: "), 0, 6);
        interfejs.add(tfPovrsinaTrougla, 1, 6);
        interfejs.add(new Label("Povrsina Pravougaonika: "), 0, 7);
        interfejs.add(tfPovrsinaPravougaonika, 1, 7);

        //setujem posebna svojstva elemenata GUI-a
        tfStranicaKvardata.setAlignment(Pos.BOTTOM_RIGHT);

        tfStranicaTrougla.setAlignment(Pos.BOTTOM_RIGHT);
        tfDuzinaPravougaonika.setAlignment(Pos.BOTTOM_RIGHT);
        tfSirinaPravougaonika.setAlignment(Pos.BOTTOM_RIGHT);
        GridPane.setHalignment(btnIzracunaj, HPos.CENTER); // ovo postvi dugme na sredinu
        GridPane.setHalignment(tfPovrsinaKvadrata, HPos.RIGHT);
        GridPane.setHalignment(tfPovrsinaTrougla, HPos.RIGHT);
        GridPane.setHalignment(tfPovrsinaPravougaonika, HPos.RIGHT);

        // vrsim validaciju i kreiram action event za dugme Izracunaj   
        btnIzracunaj.setOnAction(e -> {
            if (tfStranicaKvardata.getText().isEmpty() || tfStranicaTrougla.getText().isEmpty()
                    || tfDuzinaPravougaonika.getText().isEmpty() || tfSirinaPravougaonika.getText().isEmpty()) {
                validacija();
            } else {
                izracunajPovrsinu();
            }
        });

        // kreiram scenu i postavljam GUI
        Scene scena = new Scene(interfejs, 400, 400);
        stage.setTitle("Zadatak 1");
        stage.setScene(scena);
        stage.show();
    }

    // validacija
    public void validacija() {
        Alert fail = new Alert(Alert.AlertType.WARNING);
        fail.setHeaderText("Greska!");
        fail.setContentText("Neophodno je popuniti sva polja.");
        fail.showAndWait();
    }

    // metoda za izracunavanje povrsine figura.
    private void izracunajPovrsinu() {
        // primam vrednosti iz text polja 
        double strKvad = Double.parseDouble(tfStranicaKvardata.getText());
        double strTro = Double.parseDouble(tfStranicaTrougla.getText());
        double duzPrav = Double.parseDouble(tfDuzinaPravougaonika.getText());
        double sirPrav = Double.parseDouble(tfSirinaPravougaonika.getText());

        // kreiram objekat tipa Povrsina u koji smestam izracunate povrsine
        Povrsina figura = new Povrsina(strKvad, strTro, duzPrav, sirPrav);

        //setujem ispis rezultata
        tfPovrsinaKvadrata.setText(String.format("%.2f", figura.povrsinaKvadrata()));
        tfPovrsinaTrougla.setText(String.format("%.2f", figura.povrsinaTrougla()));
        tfPovrsinaPravougaonika.setText(String.format("%.2f", figura.povrsinaPravougaonika()));
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
