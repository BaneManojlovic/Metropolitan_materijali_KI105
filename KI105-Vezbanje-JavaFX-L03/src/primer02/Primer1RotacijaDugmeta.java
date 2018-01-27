/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer1RotacijaDugmeta extends Application {

    static Button btn = new Button("OK");
    
    @Override
    public void start(Stage primaryStage) {
        
        //dajem rotaciju dugmetu
        btn.setRotate(45);
        btn.setStyle("-fx-border-color: blue");
      
        StackPane pane = new StackPane();
        pane.setStyle("-fx-background-color: red; -fx-border-color: black");
        pane.setRotate(50);
        
        pane.getChildren().add(btn);
        
        Scene scena = new Scene(pane, 150, 150);
        primaryStage.setTitle("Rotacija dugmeta");
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
