/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IspitniBane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class IspitniBane extends Application {
    
    //elementi za gornju plocu
    static CheckBox cbPrva = new CheckBox("Prva");
    static CheckBox cbDruga = new CheckBox("Druga");
    static CheckBox cbTreca = new CheckBox("Treca");
    
    //elementi za srednju levu plocu
    static RadioButton color = new RadioButton("Color");
    static RadioButton black = new RadioButton("Black");
    
    //elementi za srednju centralnu plocu
    static Circle krugCrveni = new Circle(20);
    static Circle krugZeleni = new Circle(20);
    static Circle krugPlavi = new Circle(20);
    
    //elementi za srednju desnu plocu
    static Label y = new Label("y:");
    static TextField tfY = new TextField("80");
    
    //elementi za donju plocu
    static Button btnPlay = new Button("Play");
    static Button btnStop = new Button("Stop");
    
    //glavna ploca
     private BorderPane root = new BorderPane();
    
    @Override
    public void start(Stage primaryStage) {

        //Gornja ploca
        GridPane pane1 = new GridPane();
        pane1.setPadding(new Insets(10, 10, 10, 10));
        pane1.setAlignment(Pos.CENTER);
        pane1.setHgap(10);
        pane1.setVgap(10);
        pane1.add(cbPrva, 0, 0);
        cbPrva.setSelected(true);
        pane1.add(cbDruga, 1, 0);
        cbDruga.setSelected(true);
        pane1.add(cbTreca, 2, 0);
        cbTreca.setSelected(true);
                
        //Donja leva ploca
        GridPane pane2 = new GridPane();
        pane2.setPadding(new Insets(10, 10, 10, 10));
        pane2.setAlignment(Pos.CENTER_LEFT);
        pane2.setHgap(10);
        pane2.setVgap(10);
        ToggleGroup grupa = new ToggleGroup();
        color.setToggleGroup(grupa);
        black.setToggleGroup(grupa);
        color.setSelected(true);
        pane2.add(color, 0, 0);
        pane2.add(black, 0, 1);
        
        //Donja srednja ploca
        GridPane pane3 = new GridPane();
        pane3.setPadding(new Insets(5, 5, 5, 5));
        pane3.setAlignment(Pos.TOP_CENTER);
        pane3.setHgap(5);
        pane3.setVgap(5);
        krugCrveni.setFill(Color.RED);
        krugZeleni.setFill(Color.GREEN);
        krugPlavi.setFill(Color.BLUE);
        pane3.add(krugCrveni, 0, 0);
        pane3.add(krugZeleni, 1, 0);
        pane3.add(krugPlavi, 2, 0);
        
         //Donja desna ploca
        GridPane pane4 = new GridPane();
        pane4.setPadding(new Insets(10, 10, 10, 10));
        pane4.setAlignment(Pos.CENTER_LEFT);
        pane4.setHgap(10);
        pane4.setVgap(10);
        pane4.add(y, 0, 0);
        tfY.setMaxWidth(40);
        pane4.add(tfY, 1, 0);
        
         //Donja ploca
        GridPane pane5 = new GridPane();
        pane5.setPadding(new Insets(10, 10, 10, 10));
        pane5.setAlignment(Pos.CENTER);
        pane5.setHgap(10);
        pane5.setVgap(10);
        pane5.add(btnPlay, 0, 0);
        pane5.add(btnStop, 1, 0);

        
        
        //postavljam sve ploce na glavnu plocu
        root.setTop(pane1);
        root.setLeft(pane2);
        root.setCenter(pane3);
        root.setRight(pane4);
        root.setBottom(pane5);
        
        
        Scene scena = new Scene(root, 450, 450);
        primaryStage.setTitle("KI105");
        primaryStage.setResizable(false);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
