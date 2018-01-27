/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer01;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer4KrugUOknu extends Application {

    Circle krug = new Circle(30);
    
    @Override
    public void start(Stage primaryStage) {
        //kreiran okno u koje cu staciti krug
        Pane pane = new Pane();
        pane.getChildren().add(krug);
        
        //dodajem karakteristike kruga koje zelim mada kad koristim StackPane i ne moram 
        //stavljati X i Y osu, jer StackPane stavlja sve elemente po difoltu na sredinu.
        //Medjutim posto koristim samo Pane onda moram da stavim X i Y kooordinate. 
        krug.setCenterX(100);
        krug.setCenterY(100);   
        krug.setFill(Color.BLUE);
        krug.setStroke(Color.RED);
        
        //kreiram scenu
        Scene scena = new Scene(pane, 500, 400);
        
        //dodajem elemente na pozornicu
        primaryStage.setTitle("Krug u oknu");
        primaryStage.setScene(scena);
        primaryStage.setResizable(false);
        primaryStage.show();
    }   
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
