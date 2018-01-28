/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animacija;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Branislav
 */
public class Primer02DizanjeZastave extends Application {
    
    static Image slika = new Image("file:C:\\Users\\Branislav\\Documents\\NetBeansProjects\\KI105\\KI105-Vezbanje-JavaFX-Radionice\\src\\Animacija\\zastava PLZ.jpg");
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
        
        ImageView prikazSlike = new ImageView(slika);
        //dodavanje slike
        pane.getChildren().add(prikazSlike);

        //setovanje tranzicije. Tranzicija se ponavlja 3 puta i mogu je opet pokrenuti klikom na misa.
        PathTransition pt = new PathTransition(Duration.millis(10000), new Line(180, 500, 180, 5), prikazSlike);
        pt.setCycleCount(3);
        pt.play();
        
        //setovanje klika misem. Pomocu klika mogu da zaustavim animaciju i da je ponovo pokrenema ako hocu
        prikazSlike.setOnMousePressed(e -> pt.pause());
        prikazSlike.setOnMouseReleased(e -> pt.play());
        
        
        Scene scena = new Scene(pane, 600, 600);
        primaryStage.setTitle("Dizanje zastave");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
