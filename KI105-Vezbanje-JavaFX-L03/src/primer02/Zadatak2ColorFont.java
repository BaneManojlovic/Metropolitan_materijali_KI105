/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak2ColorFont extends Application {
    
    static Label labela1 = new Label("Prvi tekst");
    static Label labela2 = new Label("Drugi tekst");
    static Label labela3 = new Label("Treci tekst");

    @Override
    public void start(Stage primaryStage) {
       
        Pane pane = new Pane();
        
        labela1.setTextFill(Color.RED);
        labela1.setStyle("-fx-padding: 10 20 10 30");
        labela2.setTextFill(Color.GREEN);
        labela2.setStyle("-fx-padding: 50 20 10 30");
        labela3.setTextFill(Color.ORANGE);
        labela3.setStyle("-fx-padding: 90 20 10 30");
        
        pane.getChildren().addAll(labela1, labela2, labela3);
        
        
        Scene scena = new Scene(pane, 400, 400);
        primaryStage.setTitle("Zadatak 2");
        primaryStage.setScene(scena);
        primaryStage.setResizable(false);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
