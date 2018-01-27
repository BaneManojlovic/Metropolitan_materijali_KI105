/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer16KlasaLineUkrsteneLinije extends Application {

    @Override
    public void start(Stage primaryStage) {
        //pravim pocetnu plocu
        Pane pane = new Pane();
        
        //kreiram linije, tj. objekte tipa Line i zadajem im pocetak i kraj
        Line linija1 = new Line(0, 0, 100, 60);
        Line linija2 = new Line(0, 60, 100, 0);
        //dodajem linije na plocu
        pane.getChildren().addAll(linija1, linija2);
        
        //postavljam plocu na scenu
        Scene scena = new Scene(pane, 200, 100);
        primaryStage.setTitle("Ukrstene Linije");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
