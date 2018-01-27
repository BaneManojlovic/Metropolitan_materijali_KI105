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
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer15KlasaText extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
    
        
        //pravim objekte tipa tekst
        Text tekst1 = new Text(15, 15, "Ovo je prvi precrtani crveni tekst ");
        Text tekst2 = new Text(200, 15, "Ovo je drugi boldovan iskosen zuti tekst");
        Text tekst3 = new Text(15, 35, "Ovo je treci podvucen zeleni tekst");
        
        //setujem osobine objekata tipa tekst
        tekst1.setFill(Color.RED);
        tekst1.setStrikethrough(true);
        tekst2.setFill(Color.ORANGE);
        tekst2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        tekst3.setFill(Color.GREEN);
        tekst3.setUnderline(true);
        
        
        //dodajem objekte tipa tekst na povrsinu
        pane.getChildren().addAll(tekst1, tekst2, tekst3);
        
        Scene scena = new Scene(pane, 600, 300);
        primaryStage.setTitle("Klasa Text");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
