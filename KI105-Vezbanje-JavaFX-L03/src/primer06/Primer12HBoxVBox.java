/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer06;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer12HBoxVBox extends Application {

    static Button btn1 = new Button("Computer Science");
    static Button btn2 = new Button("Chemistry");
    static Image slika = new Image("file:C:\\Users\\Branislav\\Documents\\NetBeansProjects\\KI105\\KI105-Vezbanje-JavaFX\\src\\primer06\\slika1.jpg");
    static Label labela1 = new Label("Courses:");
    static Label labela2 = new Label("CSCI 1301");
    static Label labela3 = new Label("CSCI 1302");
    static Label labela4 = new Label("CSCI 2410");
    static Label labela5 = new Label("CSCI 3720");
    
    @Override
    public void start(Stage primaryStage) {
        
        ImageView prikazSlike = new ImageView(slika);
        prikazSlike.setFitHeight(100);
        prikazSlike.setFitWidth(100);
        
        //kreiram osnovni pane na koji cu da stavim HBox i VBox
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        
        //kreiram HBox polje za postavlajnje dugmica i slike
        HBox gornjiDeo = new HBox(15);  //<- Ova 15 mi pravi razmak izmedju elemenata u HBox-u
        gornjiDeo.setAlignment(Pos.CENTER);
        gornjiDeo.setPadding(new Insets(10, 10, 10, 10));
        gornjiDeo.setStyle("-fx-background-color: gold");
        gornjiDeo.getChildren().addAll(btn1, btn2, prikazSlike);
        
        //kreiram VBox deo za postavljanje vertikalne liste
        VBox donjiDeo = new VBox(15);
        //pomocu ove komande uvucem 4 labele za 10 piksela udesno
        VBox.setMargin(labela2, new Insets(0, 0, 0, 10));
        VBox.setMargin(labela3, new Insets(0, 0, 0, 10));
        VBox.setMargin(labela4, new Insets(0, 0, 0, 10));
        VBox.setMargin(labela5, new Insets(0, 0, 0, 10));
        donjiDeo.getChildren().addAll(labela1, labela2, labela3, labela4, labela5);
        
        //dodajem HBox i VBox delove na ukupni pane
        pane.setTop(gornjiDeo);
        pane.setBottom(donjiDeo);
        
        Scene scena = new Scene(pane, 400, 300);
        primaryStage.setTitle("HBox i VBox");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
