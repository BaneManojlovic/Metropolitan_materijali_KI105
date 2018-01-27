/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak7_2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        //for petlja za dodavanje vise dugmica odjednom
        for(int i=1 ; i<=10; i++){
            Button btn = new Button("asdf");
            pane.getChildren().addAll(btn);
        }
        
        
        
        Scene scena = new Scene(pane, 420, 50);
        primaryStage.setTitle("Zadatak7_2");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
