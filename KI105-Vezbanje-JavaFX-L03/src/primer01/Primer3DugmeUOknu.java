/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer3DugmeUOknu extends Application {
    
    Button btn1 = new Button("OK");

    @Override
    public void start(Stage primaryStage) {
        
        //kreiranje okna
        StackPane pane = new StackPane();
        pane.getChildren().add(btn1);
        
        //kreiranje scene
        Scene scena = new Scene(pane, 300, 200);
        
        //postavljanje elemenata na pozornicu
        primaryStage.setTitle("Dugme u oknu");
        primaryStage.setScene(scena);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}