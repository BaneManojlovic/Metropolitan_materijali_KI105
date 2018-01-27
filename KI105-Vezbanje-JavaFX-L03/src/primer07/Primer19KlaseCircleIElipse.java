/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer19KlaseCircleIElipse extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        //kreiram figuru Krug
        Circle krug1 = new Circle(100, 100, 50);
        krug1.setFill(null);
        krug1.setStroke(Color.BLUE);
        //kreiram figuru Elipsa
        Ellipse elipsa1 = new Ellipse(400, 100, 60, 40);
        elipsa1.setFill(Color.YELLOW);
        elipsa1.setStroke(Color.RED);
        
        //kreiram for petlju koja ce da iscrtava 7 elipsi ukrug oko istog centra
        for(int i=0; i<7; i++){
            Ellipse elipsa2 = new Ellipse(400, 400, 70, 30);
            elipsa2.setFill(null);
            elipsa2.setStroke(Color.GREEN);
            //elipsa2.setRadiusX(elipsa2.getRadiusX()-i*10);
            elipsa2.setRotate(i*360/9);
            pane.getChildren().add(elipsa2);   
        }
        
        //kreiram for petlju koja ucrtava 5 elipsi jednu unutar druge
        for(int i=0; i<5; i++){
            Ellipse elipsa3 = new Ellipse(600, 250, 100, 50);
            elipsa3.setFill(null);
            elipsa3.setStroke(Color.PURPLE);
            elipsa3.setRadiusX(elipsa3.getRadiusX()-i*10);
            elipsa3.setRadiusY(elipsa3.getRadiusY()-i*10);
            pane.getChildren().add(elipsa3);
        }
        
        pane.getChildren().add(krug1);
        pane.getChildren().add(elipsa1);
        
        Scene scena = new Scene(pane, 800, 600);
        primaryStage.setTitle("Circle i Elipse");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
