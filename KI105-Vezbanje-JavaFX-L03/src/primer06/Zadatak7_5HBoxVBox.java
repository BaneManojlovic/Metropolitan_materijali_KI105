/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer06;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak7_5HBoxVBox extends Application {
    
    static Button btn1 = new Button("Current");
    static Button btn2 = new Button("Projected");
    static Button btn3 = new Button("?");
    static Label labela1 = new Label("Data");
    static Label labela2 = new Label("Sales");
    static Label labela3 = new Label("Marketing");
    static Label labela4 = new Label("Distribution");
    static Label labela5 = new Label("Costs");

    @Override
    public void start(Stage primaryStage) {
        //dajem osobine dumicima
        btn1.setMinSize(100, 20);
        btn2.setMinSize(100, 20);
        btn3.setMinSize(40, 35);
        btn3.setStyle("-fx-background-color: linear-gradient(from 10% 10% to 100% 100%, #005aa7, #fffde4); "
                    + "-fx-font-size: 18px; -fx-font-weight: bold");
        btn3.setTextFill(Color.web("#ffffff"));
        
        //setujem velicinu slova i boldovan stil slova u labeli1
        labela1.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        
        //glavna ploca
        BorderPane pane = new BorderPane();
        pane.setMinWidth(550);
        pane.setMinHeight(300);
       
        //gornji deo - horizontalni
        HBox gornjiDeo = new HBox(10);
        //pomocu ove linije sam pomerio trece dugme skroz udesno - margina je bitna za to!!!
        HBox.setMargin(btn3, new Insets(0, 0, 0, 260));
        gornjiDeo.setMinWidth(550);
        gornjiDeo.setMinHeight(60);
        gornjiDeo.setAlignment(Pos.TOP_LEFT);
        gornjiDeo.setPadding(new Insets(15, 15, 15, 15));
        gornjiDeo.setStyle("-fx-background-color: #302b63");
        gornjiDeo.getChildren().addAll(btn1, btn2, btn3);
        
        
        
        //donji deo - vertikalni
        VBox donjiDeo = new VBox(10);
        //pomocu ove komande uvucem 4 labele za 10 piksela udesno
        VBox.setMargin(labela1, new Insets(0, 0, 0, 10));
        VBox.setMargin(labela2, new Insets(0, 0, 0, 20));
        VBox.setMargin(labela3, new Insets(0, 0, 0, 20));
        VBox.setMargin(labela4, new Insets(0, 0, 0, 20));
        VBox.setMargin(labela5, new Insets(0, 0, 85, 20));
        donjiDeo.getChildren().addAll(labela1, labela2, labela3, labela4, labela5);
        
        donjiDeo.setAlignment(Pos.TOP_LEFT);
        
        //dodavanje elemenata na glavnu plocu. 
        //Moram posebno da dodam ono sto ide gore i ono sto ide dole
        pane.setTop(gornjiDeo);
        pane.setBottom(donjiDeo);
        
        //cela scena
        Scene scena = new Scene(pane, 550, 300);
        primaryStage.setTitle("Zadatak 7.5");
        primaryStage.setResizable(false);
        primaryStage.setScene(scena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
