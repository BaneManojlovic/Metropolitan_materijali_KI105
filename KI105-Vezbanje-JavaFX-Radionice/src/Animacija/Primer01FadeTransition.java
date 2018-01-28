/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animacija;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Branislav
 */
public class Primer01FadeTransition extends Application {

    @Override
    public void start(Stage primaryStage) {
        //kreiram osnovnu plocu
        Pane pane = new Pane();
        //kreiram objekat krug
        Circle krug = new Circle(200, 150, 80);
        krug.setFill(Color.BLUE);
        //dodajem krug na plocu
        pane.getChildren().add(krug);
        
        //setujem fade tranziciju
        FadeTransition ft = new FadeTransition(Duration.millis(5000), krug);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setAutoReverse(true);
        ft.play();
        
        //setujem kada da pocne animacija
        krug.setOnMousePressed(e -> ft.pause());
        krug.setOnMouseReleased(e -> ft.play());
        
        Scene scena = new Scene(pane, 400, 300);
        primaryStage.setTitle("Tranzicija");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
