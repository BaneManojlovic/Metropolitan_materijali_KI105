/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer07;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer20LukPakman1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        //pravim plocu na koju cu dodavati elemente
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: blue");
        
        
        //napravim krug od koga cu iseci luk
        Circle krug = new Circle(60, 60, 35);
        
        //pravim luk koji ce biti usta Pakmanu
        Arc luk = new Arc(60, 60, 35, 35, -45, 90);
        luk.setFill(Color.BLUE);
        luk.setStroke(Color.BLUE);
        luk.setType(ArcType.ROUND);  //ovaj tip mora da bi luk imao oblik pica parčeta!!!  :)
        
        //dodajem elemente na plocu
        pane.getChildren().addAll(krug, luk);
        
        Scene scena = new Scene(pane, 600, 300);
        primaryStage.setTitle("Pakman 1");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
