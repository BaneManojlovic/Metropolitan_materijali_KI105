/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak4;

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
public class Zadatak4 extends Application {
    //kreiram elemente GUI-a
    private TextField tfVisinaOsnovice = new TextField();
    private TextField tfGodisnjaKamatnaStopa = new TextField();
    private Button btnIzracunaj = new Button("Izracunaj");
    private Label tfEfektivnaKamatnaStopa = new Label("");
    
    @Override
    public void start(Stage stage) {
        //kreiram GUI interfejs 
        GridPane interfejs = new GridPane();
        interfejs.setHgap(5);
        interfejs.setVgap(5);
        interfejs.setAlignment(Pos.CENTER);
        interfejs.setStyle("-fx-background-color: #ADD8E6");
        //redjam elemente na GUI
        interfejs.add(new Label("Visina osnovice: "), 0, 0);
        interfejs.add(tfVisinaOsnovice, 1, 0);
        interfejs.add(new Label("Godisnja kamatna stopa:"), 0, 1);
        interfejs.add(tfGodisnjaKamatnaStopa, 1, 1);
        interfejs.add(btnIzracunaj, 1, 2);
        interfejs.add(new Label("Efektivna kamatna stopa:"), 0, 3);
        interfejs.add(tfEfektivnaKamatnaStopa, 1, 3);
        
        //definisem posebna svojstva pojedinih elemenata
        tfVisinaOsnovice.setAlignment(Pos.BOTTOM_RIGHT);
        tfGodisnjaKamatnaStopa.setAlignment(Pos.BASELINE_RIGHT);
        GridPane.setHalignment(btnIzracunaj, HPos.CENTER);
        GridPane.setHalignment(tfEfektivnaKamatnaStopa, HPos.RIGHT);
        
        //vrsim validaciju i dodeljujem klik event za dugme
        btnIzracunaj.setOnAction(e -> {
            if(tfVisinaOsnovice.getText().isEmpty() || tfGodisnjaKamatnaStopa.getText().isEmpty()){
                validacija();
            }else{
                 //smesta rezultat u labelu
                    tfEfektivnaKamatnaStopa.setText(String.format("%.4f",  proracun(tfVisinaOsnovice, 
                                                                                    tfGodisnjaKamatnaStopa)));
            }
        });
        
        //kreiram scenu
        Scene scena = new Scene(interfejs, 300, 200);
        stage.setTitle("Zadatak 4");
        stage.setScene(scena);
        stage.show();
    }
    
    //metoda za validaciju
    public void validacija(){
        Alert greska = new Alert(Alert.AlertType.WARNING);
        greska.setHeaderText("Greska!!!");
        greska.setContentText("Morate popuniti sva polja...");
        greska.showAndWait();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    public double proracun(TextField OS, TextField GKS) {
        double os = Double.parseDouble(OS.getText());
        double gks = Double.parseDouble(GKS.getText());
        double rez = gks / (os - gks);
        return rez;
    }
}