/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer08;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer21KlasaPoligon extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        
        //kreiram objekat klase Poligon
        Polygon heksagon = new Polygon();
        heksagon.setFill(Color.BLUE);
        heksagon.setStroke(Color.BLANCHEDALMOND);
        
        //dodajem tacke u listu po kojoj ce se poligon i nacrtati
        ObservableList<Double> lista = heksagon.getPoints();
        
        //definisem visinu i sirinu poligona
        final double sirina = 200, visina = 200;
        double centerX = sirina/2, centerY = visina/2;
        double radijus = Math.min(visina, sirina)*0.4;
        
        //for petlja za iscrtavanje heksahona, tj. Poligona
        for(int i=0; i<6; i++){
            lista.add(centerX+radijus*Math.cos(2*i*Math.PI/6));
            lista.add(centerY-radijus*Math.sin(2*i*Math.PI/6));
        }
        
        //dodavanje elemenata na povrsinu
        pane.getChildren().add(heksagon);
        
        Scene scena = new Scene(pane, 400, 400);
        primaryStage.setTitle("Polgon Heksagon");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
