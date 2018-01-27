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
import javafx.scene.shape.Arc;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer20Luk extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        
        Arc luk1 = new Arc(200, 200, 150, 150, 0, 90);
        luk1.setFill(null);
        luk1.setStroke(Color.BLUE);
        pane.getChildren().add(luk1);
        
        Scene scena = new Scene(pane, 400, 300);
        primaryStage.setTitle("Likovi");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
