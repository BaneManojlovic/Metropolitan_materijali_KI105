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
public class Primer18RectangleForRotiranje extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        //for petlja koja zarotira pravougaonik 5 puta
        for(int i=0; i<5; i++){
            Rectangle pravougaonik =new Rectangle(100, 100, 150, 70);
            pravougaonik.setFill(null);
            pravougaonik.setStroke(Color.BLUE);
            pravougaonik.setRotate(i*360/9);  //ovo je neki proizvoljni ugao za koji ce pravougaonik biti zarotiran i++ puta
            pane.getChildren().add(pravougaonik);
        }
        
        Scene scena = new Scene(pane, 600, 300);
        primaryStage.setTitle("For petlja rotiranje pravougaonika");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
