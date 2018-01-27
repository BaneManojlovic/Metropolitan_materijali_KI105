/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer18KlasaRectangle extends Application {

    @Override
    public void start(Stage primaryStage) {
        //pravim plocu na koju cu da stavim pravougaonike
        Pane pane = new Pane();
        
        //pravim prvi pravougaonik
        Rectangle pravougaonik1 = new Rectangle(10, 10, 150, 50);
        pravougaonik1.setFill(null);  //da dobijem beli pravougaonik (bez ovog je crni)
        pravougaonik1.setStroke(Color.BLACK);
        //pravim drugi pravougaonik
        Rectangle pravougaonik2 = new Rectangle(10, 80, 150, 50);
        pravougaonik2.setFill(null);  //da dobijem beli pravougaonik (bez ovog je crni)
        pravougaonik2.setStroke(Color.RED);
        //pravim treci pravougaonik (sa zaobljenim ivicama)
        Rectangle pravougaonik3 = new Rectangle(10, 150, 150, 50);
        pravougaonik3.setFill(null);  //da dobijem beli pravougaonik (bez ovog je crni)
        pravougaonik3.setStroke(Color.BLUE);
        pravougaonik3.setArcHeight(15);  //zaobljava mi ivice
        pravougaonik3.setArcWidth(15);
         //pravim cetvri pravougaonik (zarotirani)
        Rectangle pravougaonik4 = new Rectangle(300, 150, 200, 50);
        pravougaonik4.setFill(Color.AQUAMARINE);  //da dobijem beli pravougaonik (bez ovog je crni)
        pravougaonik4.setStroke(Color.YELLOWGREEN);
        pravougaonik4.setArcHeight(15);  //zaobljava mi ivice
        pravougaonik4.setArcWidth(15);
        pravougaonik4.setRotate(35); //rotira pravougaonik za +35 stepeni
        
        
        pane.getChildren().addAll(pravougaonik1, pravougaonik2, pravougaonik3, pravougaonik4);
        
        Scene scena = new Scene(pane, 600, 500);
        primaryStage.setTitle("Rectangle");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
