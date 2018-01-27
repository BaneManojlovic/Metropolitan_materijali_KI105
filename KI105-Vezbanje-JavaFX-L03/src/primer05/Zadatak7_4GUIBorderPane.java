/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer05;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak7_4GUIBorderPane extends Application {

    static Label labela1 = new Label("Top deo GUI-a");
    static Button btn1 = new Button("Levo Dugme");
    static Image slika = new Image("file:C:\\Users\\Branislav\\Documents\\NetBeansProjects\\KI105\\KI105-Vezbanje-JavaFX\\src\\primer05\\slika1.jpg");
    static Label labela2 = new Label("Bottom deo GUI-a");
    static Button btn2 = new Button("Desno Dugme");
    
    @Override
    public void start(Stage primaryStage) {
        
        ImageView pozicijaSlike = new ImageView(slika);
        
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setTop(labela1);
        pane.setLeft(btn1);
        pane.setCenter(pozicijaSlike);
        pane.setRight(btn2);
        pane.setBottom(labela2);
        
        //postavljam sve cvorove da budu u sredini 
        BorderPane.setAlignment(labela1, Pos.CENTER);
        BorderPane.setAlignment(btn1, Pos.CENTER);
        BorderPane.setAlignment(pozicijaSlike, Pos.CENTER);
        BorderPane.setAlignment(btn2, Pos.CENTER);
        BorderPane.setAlignment(labela2, Pos.CENTER);
        
        
        
        
        Scene scena = new Scene(pane, 450, 350);
        primaryStage.setTitle("Zadatak 7");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
