/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer1MyJavaFX extends Application {
    
    

    @Override
    public void start(Stage primaryStage) {
        //kreiranje dugmeta
        Button btn = new Button("OK");
        
        //kreiranje scene
        Scene scena = new Scene(btn, 200, 100);
        primaryStage.setTitle("MyJavaFX");   //naslov scene
        primaryStage.setScene(scena);        //postavljanje scene na pozonicu
        primaryStage.setResizable(false);    //setuje da se pozornica ne moze povecavati/smanjivati
        primaryStage.show();                 //prikaz pozornice
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);  //.launch() aktivira izvrsenje programa
    }
}
