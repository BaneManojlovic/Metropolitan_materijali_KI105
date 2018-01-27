/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer06;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;

import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer14FileChooser extends Application {
    
    private FileReader citaj;
    private FileWriter pisi;
    private File fajl;
    
    static Button btnUcitaj = new Button("Ucitaj fajl");
    
    
    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        
        btnUcitaj.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                
                FileChooser biracFajla = new FileChooser();
                FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("TXT files(*.txt)","*.txt");
                biracFajla.getExtensionFilters().add(filter);
                
                fajl = biracFajla.showOpenDialog(primaryStage);
                
            }
        //NE ZNAM OVO!!!!
        
        });
        
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
