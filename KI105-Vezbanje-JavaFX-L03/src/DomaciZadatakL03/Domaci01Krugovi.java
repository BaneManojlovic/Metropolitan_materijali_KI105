/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomaciZadatakL03;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Domaci01Krugovi extends Application {
    
    static Scanner sc = new Scanner(System.in);
    
    @Override
    public void start(Stage primaryStage) {
        //unos podataka od strane korisnika
        int vrste, kolone;
        System.out.println("Unesite broj vrsta: ");
        vrste = sc.nextInt();
        System.out.println("Unesite broj kolona: ");
        kolone = sc.nextInt();
        
        //mora GridPane da bih posle mogao iscrtavati krugove u matrici.
        GridPane pane = new GridPane();
        //for petlja koja iscrtava krugove u matrici
        for(int i=0; i<vrste; i++){
            for(int j=0; j<kolone; j++){
                Circle krug = new Circle(50, 50, 40);
                krug.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                krug.setStroke(Color.BLACK);
                pane.add(krug, i, j);
            }
        }
        
        
        Scene scena = new Scene(pane, 400, 400);
        primaryStage.setTitle("Krugovi Matirce");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
   
    public static void main(String[] args) {
        Application.launch(args);
    }
}
