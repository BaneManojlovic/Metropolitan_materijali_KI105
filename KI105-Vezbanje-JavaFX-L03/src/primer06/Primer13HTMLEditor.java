/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer13HTMLEditor extends Application {

    private final String tekst_za_prikaz = "Lorem ipsum dolor sit "
            + "amet, consectetur adipiscing elit. Nam tortor felis, pulvinar "
            + "in scelerisque cursus, pulvinar at ante. Nulla consequat "
            + "congue lectus in sodales. Nullam eu est a felis ornare "
            + "bibendum et nec tellus. Vivamus non metus tempus augue auctor "
            + "ornare. Duis pulvinar justo ac purus adipiscing pulvinar. "
            + "Integer congue faucibus dapibus. Integer id nisl ut elit "
            + "aliquam sagittis gravida eu dolor. Etiam sit amet ipsum "
            + "sem.";

    @Override
    public void start(Stage primaryStage) {
        //kreiram VBox deo
        VBox root = new VBox();
        
        //kreiram HTMLEditor objekat
        final HTMLEditor editor = new HTMLEditor();
        editor.setPrefHeight(300);
        editor.setHtmlText(tekst_za_prikaz);
        //dodaje HTMLEditor objekat na VBox deo
        root.getChildren().addAll(editor);
        
        
        Scene scena = new Scene(root, 600, 300);
        primaryStage.setTitle("HTML Editor");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
