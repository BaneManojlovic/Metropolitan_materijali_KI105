/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer04;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak7_3LogInForma extends Application {

    static Label labela1 = new Label("Welcome");
    static Label labela2 = new Label("User Name:");
    static Label labela3 = new Label("Password:");
    static TextField tf1 = new TextField();
    static TextField tf2 = new TextField();
    static Button btn = new Button("Sign in");
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(10);
        pane.setVgap(5);
        
        //setujem velicinu slova i boldovan stil slova
        labela1.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        
        //unutar GpridPane-a setujem poziciju dugmeta
        GridPane.setHalignment(btn, HPos.RIGHT);
        
        pane.add(labela1, 0, 0);
        pane.add(labela2, 0, 1);
        pane.add(tf1, 1, 1);
        pane.add(labela3, 0, 2);
        pane.add(tf2, 1, 2);
        pane.add(btn, 1, 3);
        
        
        
        Scene scena = new Scene(pane, 280, 200);
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
