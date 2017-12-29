package Zadatak1ver2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Zadatak1ver2 extends Application {

    private TextField tfStrKvadrat = new TextField();
    private TextField tfAStrPrav = new TextField();
    private TextField tfBStrPrav = new TextField();
    private TextField tfStrTroug = new TextField();
    private TextField tfVisinaTroug = new TextField();
    private TextField povKvadrat = new TextField();
    private TextField povPrav = new TextField();
    private TextField povTroug = new TextField();
    private Button btCalculate = new Button("Izračunaj!");
    private Button buttonClear = new Button("Očisti!");

    @Override
    public void start(Stage primaryStage) {

        // Kreiranje korisničkog interfejsa (GUI) 
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Stranica kvadrata:"), 0, 0);
        gridPane.add(tfStrKvadrat, 1, 0);
        gridPane.add(new Label("Stranica a pravougaonika:"), 0, 1);
        gridPane.add(tfAStrPrav, 1, 1);
        gridPane.add(new Label("Stranica b pravougaonika:"), 0, 2);
        gridPane.add(tfBStrPrav, 1, 2);
        gridPane.add(new Label("Stranica trougla:"), 0, 3);
        gridPane.add(tfStrTroug, 1, 3);
        gridPane.add(new Label("Visina trougla:"), 0, 4);
        gridPane.add(tfVisinaTroug, 1, 4);
        gridPane.add(new Label(""), 0, 5);
        gridPane.add(new Label("Povrsina kvadrata:"), 0, 6);
        gridPane.add(povKvadrat, 1, 6);
        gridPane.add(new Label("Povrsina pravougaonika:"), 0, 7);
        gridPane.add(povPrav, 1, 7);
        gridPane.add(new Label("Povrsina trougla:"), 0, 8);
        gridPane.add(povTroug, 1, 8);
        gridPane.add(btCalculate, 1, 9);
        gridPane.add(buttonClear, 1, 10);

        // Unos svojstava za GUI 
        gridPane.setAlignment(Pos.CENTER);
        tfStrKvadrat.setAlignment(Pos.BOTTOM_RIGHT);
        tfAStrPrav.setAlignment(Pos.BOTTOM_RIGHT);
        tfBStrPrav.setAlignment(Pos.BOTTOM_RIGHT);
        tfStrTroug.setAlignment(Pos.BOTTOM_RIGHT);
        tfVisinaTroug.setAlignment(Pos.BOTTOM_RIGHT);
        povTroug.setAlignment(Pos.BOTTOM_RIGHT);
        povKvadrat.setAlignment(Pos.BOTTOM_RIGHT);
        povPrav.setAlignment(Pos.BOTTOM_RIGHT);
        povTroug.setEditable(false);
        povKvadrat.setEditable(false);
        povPrav.setEditable(false);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);
        GridPane.setHalignment(buttonClear, HPos.RIGHT);

        // Događaji procesa  
        btCalculate.setOnAction(e -> RacunanjePovrsine());

        buttonClear.setOnAction(e -> {
            tfStrKvadrat.clear();
            tfAStrPrav.clear();
            tfBStrPrav.clear();
            tfStrTroug.clear();
            tfVisinaTroug.clear();
            povTroug.clear();
            povKvadrat.clear();
            povPrav.clear();

        });

        // Kreiranje scene i njeno postavljanje na pozornicu  
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("Racunalje povrsine");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void RacunanjePovrsine() {

        try {
            double strKv = Double.parseDouble(tfStrKvadrat.getText());
            double strAPrav = Double.parseDouble(tfAStrPrav.getText());
            double strBPrav = Double.parseDouble(tfBStrPrav.getText());
            double baza = Double.parseDouble(tfStrTroug.getText());
            double visina = Double.parseDouble(tfVisinaTroug.getText());

            povKvadrat.setText(String.format("%.2f", strKv * strKv));
            povPrav.setText(String.format("%.2f", strAPrav * strBPrav));
            povTroug.setText(String.format("%.2f", baza * visina));

        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("");
            alert.setContentText("Popunite sva prazna polja!");
            alert.showAndWait();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
