/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Prime8FlowPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        //kreiram Flow Pane okno
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        //dodajem prvu labelu, prvo tekst polje, drugu labelu
        pane.getChildren().addAll(new Label("First Name: "), new TextField(), new Label(" MI: "));
        //kreiram malo tekst polje za brojanje
        TextField tf1 = new TextField();
        tf1.setPrefColumnCount(1);
        ///dodajem trecu labelu i trece tekst polje
        pane.getChildren().addAll(tf1, new Label("Last Name: "), new TextField());
        
        Scene scena = new Scene(pane, 300, 100);
        primaryStage.setTitle("Flow Pane");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
