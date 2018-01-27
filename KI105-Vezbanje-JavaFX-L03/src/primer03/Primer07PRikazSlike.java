/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer03;

import java.awt.Color;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import static javafx.scene.paint.Color.BLACK;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer07PRikazSlike extends Application {

    @Override
    public void start(Stage primaryStage) {
        //kreiram okno
        Pane pane = new HBox();
        pane.setPadding(new Insets(0, 0, 0, 0));
        pane.setStyle("-fx-background-color: black");

        //kreiram slika objekat
        Image slika1 = new Image("file:\\C:\\Users\\Branislav\\Documents\\NetBeansProjects\\KI105\\KI105-Vezbanje-JavaFX\\src\\primer03\\mala_zmija.jpg");
        ImageView prikazSlike = new ImageView(slika1);
        prikazSlike.setFitHeight(220);
        prikazSlike.setFitWidth(200);
        
        ImageView prikazSlike2 = new ImageView(slika1);
        prikazSlike2.setFitHeight(100);
        prikazSlike2.setFitWidth(80);
        
        ImageView prikazSlike3 = new ImageView(slika1);
        //setujem marginu na trecem elementu da bih ga dobro upasovao
        HBox.setMargin(prikazSlike3,new Insets(-10,0,0,10));
        prikazSlike3.setFitHeight(170);
        prikazSlike3.setFitWidth(150);
        prikazSlike3.setRotate(90);
        
        //dodajem sliku na okno
        pane.getChildren().addAll(prikazSlike, prikazSlike2, prikazSlike3);
        
        Scene scena = new Scene(pane, 450, 200);
      //  scena.setFill();
        primaryStage.setTitle("Show image");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
