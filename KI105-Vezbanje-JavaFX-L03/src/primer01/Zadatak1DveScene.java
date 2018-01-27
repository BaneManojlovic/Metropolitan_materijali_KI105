/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer01;

import javafx.application.Application;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak1DveScene extends Application {

    Button btn1 = new Button("OK");
    Label labela1 = new Label("Klik na dugme OK", btn1);
    Button btn2 = new Button("NO");
    Label labela2 = new Label("Klik na dugme NO", btn2);
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //kreiram prvu scenu
        Scene scena1 = new Scene(labela1, 250, 150);
            
        //postavljam elemente na prvu pozornicu
        primaryStage.setTitle("Prva Pozornica");
        primaryStage.setScene(scena1);
        primaryStage.show();
        
        //kreriam drugu pozornicu
        Stage secondaryStage = new Stage(); 
        //kreiram drugu scenu
        Scene scena2 = new Scene(labela2, 250, 100);
       
        //postavljam elemente na drugu pozornicu
        secondaryStage.setTitle("Druga Pozornica");
        secondaryStage.setScene(scena2);
        secondaryStage.show();
    }
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
