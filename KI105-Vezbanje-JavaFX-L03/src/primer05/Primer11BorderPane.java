/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer05;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer11BorderPane extends Application {

    static Button btn1 = new Button("ButtonTop");
    static Button btn2 = new Button("ButtonBottom");
    static Button btn3 = new Button("ButtonLeft");
    static Button btn4 = new Button("ButtonRight");
    static Button btn5 = new Button("ButtonCenter");
    
    @Override
    public void start(Stage primaryStage) {
        
       
        
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        //postavljanje dugmica na posicije Top, Left, Right, Center i Bottom
        pane.setTop(btn1);
        pane.setBottom(btn2);
        pane.setLeft(btn3);
        pane.setRight(btn4);
        pane.setCenter(btn5);
        //setovanje da postavljeni dugmici budu u sredini na datim poljima
        BorderPane.setAlignment(btn1, Pos.CENTER);
        BorderPane.setAlignment(btn2, Pos.CENTER);
        BorderPane.setAlignment(btn3, Pos.CENTER);
        BorderPane.setAlignment(btn4, Pos.CENTER);
        BorderPane.setAlignment(btn5, Pos.CENTER);
        
        
        
        
        Scene scena = new Scene(pane, 250, 200);
        primaryStage.setTitle("Primer 11");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
