/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer06ColorFont extends Application {

    static Label labela1 = new Label("JavaFX");
    static Circle krug = new Circle(50);
    
    @Override
    public void start(Stage primaryStage) {
        //kreiram okno
        StackPane pane = new StackPane();

        //setujem svojstva elemenata
        labela1.setFont(Font.font("Ariel", FontPosture.ITALIC, 20));
        krug.setFill(Color.TRANSPARENT);
        krug.setStroke(Color.BLACK);
        //dodajem elemente na okno
        pane.getChildren().addAll(labela1, krug);

        Scene scena = new Scene(pane, 250, 200);
        primaryStage.setTitle("Color i Font");
        primaryStage.setScene(scena);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
        
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
