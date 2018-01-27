/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak2;

import java.util.Random;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Branislav
 */
public class Zadatak2 extends Application {

    @Override
    public void start(Stage stage) {
        // kreiram povrsinu
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: #ADD8E6");
        
        // kreiram kvadrat koji ce da se krece
        Rectangle kvadrat = new Rectangle(0, 0, 30, 30);
        kvadrat.setFill(Color.RED);
        kvadrat.setStroke(Color.BLACK);
        
        //kreiram poliliniju po kojoj ce se kretati kvadrat
        Polyline putanja = new Polyline();
        Random rnd = new Random();
        double a = 0;
        while (a < 9) {
            a = a + 1;
            double i = (double) rnd.nextInt(300);
            double j = (double) rnd.nextInt(300);
            System.out.println("Tacke" + i + ", " + j);
            putanja.getPoints().addAll(i, j);
        }
        
        //dodajem elemente na povrsinu
        pane.getChildren().add(kvadrat);
        pane.getChildren().add(putanja);
        
        //pravim transformaciju
        PathTransition animacija = new PathTransition();
        animacija.setPath(putanja);
        animacija.setNode(kvadrat);
        animacija.setDuration(Duration.millis(10000));
        animacija.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        animacija.setCycleCount(Timeline.INDEFINITE);
        animacija.setAutoReverse(true);
        animacija.play();
        
        //kreiram scenu 
        Scene scena = new Scene(pane, 450, 450);
        stage.setTitle("Zadatak 2");
        stage.setScene(scena);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}