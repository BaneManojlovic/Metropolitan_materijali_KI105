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
public class Zadatak7_1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        FlowPane pane= new FlowPane();
        pane.setPadding(new Insets(15, 15, 15, 15));
        
        Button btn1 = new Button("Button");
        Button btn2 = new Button("Button");
        Button btn3 = new Button("Button");
        Button btn4 = new Button("Button");
        Button btn5 = new Button("Button");
        Button btn6 = new Button("Button");
        Button btn7 = new Button("Button");
        Button btn8 = new Button("Button");
 
        HBox.setMargin(btn1,new Insets(5, 5, 5, 5));
        HBox.setMargin(btn2,new Insets(5, 5, 5, 5));
        HBox.setMargin(btn3,new Insets(5, 5, 5, 5));
        HBox.setMargin(btn4,new Insets(5, 5, 5, 5));
        HBox.setMargin(btn5,new Insets(5, 5, 5, 5));
        HBox.setMargin(btn6,new Insets(5, 5, 5, 5));
        HBox.setMargin(btn7,new Insets(5, 5, 5, 5));
        HBox.setMargin(btn8,new Insets(5, 5, 5, 5));
        
        pane.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8);
        
        Scene scena = new Scene(pane, 140, 150);
        primaryStage.setTitle("Zadatak7_1");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
