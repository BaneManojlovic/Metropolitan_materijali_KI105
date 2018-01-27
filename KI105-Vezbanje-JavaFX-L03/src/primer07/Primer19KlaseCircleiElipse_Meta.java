/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer07;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer19KlaseCircleiElipse_Meta extends Application {

    @Override
    public void start(Stage primaryStage) {
        //pravim osnovnu plocu
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: aquamarine");
  
        
        //kreiram koncentricne krugove
        Circle krug1beli = new Circle(300, 300, 290);
        krug1beli.setFill(Color.WHITE);
        krug1beli.setStroke(Color.BLACK);
        Circle krug2beli = new Circle(300, 300, 260);
        krug2beli.setFill(Color.WHITE);
        krug2beli.setStroke(Color.BLACK);
        Circle krug1crni = new Circle(300, 300, 230);
        krug1crni.setFill(Color.BLACK);
        krug1crni.setStroke(Color.WHITE);
        Circle krug2crni = new Circle(300, 300, 200);
        krug2crni.setFill(Color.BLACK);
        krug2crni.setStroke(Color.WHITE);
        Circle krug1plavi = new Circle(300, 300, 170);
        krug1plavi.setFill(Color.BLUE);
        krug1plavi.setStroke(Color.BLACK);
        Circle krug2plavi = new Circle(300, 300, 140);
        krug2plavi.setFill(Color.BLUE);
        krug2plavi.setStroke(Color.BLACK);
        Circle krug1crveni = new Circle(300, 300, 110);
        krug1crveni.setFill(Color.RED);
        krug1crveni.setStroke(Color.BLACK);
        Circle krug2crveni = new Circle(300, 300, 80);
        krug2crveni.setFill(Color.RED);
        krug2crveni.setStroke(Color.BLACK);
        Circle krug1zuti = new Circle(300, 300, 50);
        krug1zuti.setFill(Color.YELLOW);
        krug1zuti.setStroke(Color.BLACK);
        Circle krug2zuti = new Circle(300, 300, 25);
        krug2zuti.setFill(Color.YELLOW);
        krug2zuti.setStroke(Color.BLACK);
        Circle centar = new Circle(300, 300, 5);
        centar.setFill(Color.BLACK);
        centar.setStroke(Color.BLACK);
        
        pane.getChildren().addAll(krug1beli, krug2beli, krug1crni, krug2crni, krug1plavi, krug2plavi, krug1crveni,
                                  krug2crveni, krug1zuti, krug2zuti, centar);
        
        Scene scena = new Scene(pane, 600, 600);
        primaryStage.setTitle("Meta - Target");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
