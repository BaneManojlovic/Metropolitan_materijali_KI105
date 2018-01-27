/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer09Digitron extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        //postaljam VBox layout
        VBox root = new VBox();
        root.setSpacing(20);
        
        //pravim niz simbola koje cu prilepiti na dugmice
        String[] brojevi = new String[]{"7", "8", "9", 
                                        "4", "5", "6", 
                                        "3", "2", "1", 
                                        ".", "0", "="};
        String[] opertori = new String[]{"+", "-", "*", "/"};
        
       
        //kreiram displej
        TextField displej = new TextField();
        displej.setMinHeight(40);
        displej.setMinWidth(40);
        displej.setAlignment(Pos.CENTER);
        
        //pravim GridPane layout
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(8);
        pane.setVgap(8);
        
        //dodajem elemente na pane
        //mora dupla for petlja zabog toga sto je GridPane prakticno matrica
        int index=0;
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                Dugmici btn = new Dugmici(brojevi[index]);
                pane.add(btn, j, i);
                index++;
            }
        }
        
        for(int i=0; i<opertori.length; i++){
            Button btn = new Button(opertori[i]);
            btn.setMaxSize(65, 25);
            btn.setMinSize(65, 25);
            pane.add(btn, 4, i);
        }
        
        
        //stavljanje Text Fielda u root
        root.getChildren().add(displej);
        //stavljanje pane-a u root
        root.getChildren().add(pane);
        
        //stavljam moju labelu
        Label labela = new Label("Bakijev digitron");
        labela.setPadding(new Insets(0, 0, 0, 140));
        root.getChildren().add(labela);
        
        Scene scena = new Scene(root, 350, 250);
        primaryStage.setTitle("Digitron");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
