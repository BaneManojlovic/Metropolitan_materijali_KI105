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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer18RectangleURectangle extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        //petlja koja upisuje jedan pravougaonik u drugi 3 puta
        for(int i=0; i<3; i++){
            Rectangle pravougaonik = new Rectangle(100, 100, 200, 150);
            pravougaonik.setFill(null);
            pravougaonik.setStroke(Color.RED);
            pravougaonik.setLayoutX(pravougaonik.getLayoutX()+i*8);
            pravougaonik.setLayoutY(pravougaonik.getLayoutY()+i*8);
            pravougaonik.setHeight((pravougaonik.getHeight()-i*15));
            pravougaonik.setWidth((pravougaonik.getHeight()-i*15));
            pane.getChildren().add(pravougaonik);
            
        }
        
        
        Scene scena = new Scene(pane, 400, 300);
        primaryStage.setTitle("Pravougaonik u Pravougaoniku");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
