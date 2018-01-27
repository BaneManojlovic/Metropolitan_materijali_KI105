/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomaciZadatakL03;

import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Domaci02Kockica extends Application {

    static Scanner sc = new Scanner(System.in);
    
    @Override
    public void start(Stage primaryStage) {
        int n;
        System.out.println("Unesite neki broj od 1 do 6:");
        n = sc.nextInt();
        
        switch(n){
            case 1:
                kockica(1, 1, primaryStage);
                break;
            case 2:
                kockica(2, 1, primaryStage);
                break;
            case 3:
                kockica(3, 1, primaryStage);
                break;
            case 4:
                kockica(2, 2, primaryStage);
                break;
            case 5:
                kockica(3, 2, primaryStage);
                break;
            case 6:
                kockica(3, 3, primaryStage);
                break;
            default:
                    System.out.println("Uneli ste pogresan broj, pokusajte ponovo!");
        }
    }
        public void kockica(int vrste, int kolone, Stage primaryStage){
        int rez=0;
        //prva ploca na koju redjam ploce sa razlicitim rasporedom tacaka
        Pane root = new Pane();
        root.setLayoutX(40);
        root.setLayoutY(30);
        root.setMaxSize(100, 100);
        root.setMinSize(100, 100);
        root.setPadding(new Insets(10, 10, 10, 10));
        //ovo je ploca po kojoj redam tacke
        GridPane pane = new GridPane();
        pane.setStyle("-fx-border: 2px; -fx-border-color: black");
        pane.setHgap(8);
        pane.setVgap(8);
      
        
        for (int i = 0; i < vrste; i++) {
            for (int j = 0; j < kolone; j++) {
                Circle krug = new Circle(50, 50, 5);
                if(vrste==1 && kolone==1){
                    pane.setAlignment(Pos.CENTER);
                    pane.add(krug, 1, 1);
                    pane.add(new Circle(50, 50, 0), 2, 2);
                }else if(vrste==2 && kolone==1){
                    pane.setAlignment(Pos.CENTER);
                    pane.add(krug, 0, 0);
                    pane.add(new Circle(50, 50, 5), 2, 2);
                }else if(vrste==3 && kolone==1){
                    pane.setAlignment(Pos.CENTER);
                    pane.add(krug, 0, 0);
                    pane.add(new Circle(50, 50, 5), 1, 1);
                    pane.add(new Circle(50, 50, 5), 2, 2);
                }else if(vrste==2 && kolone==2){
                    pane.setAlignment(Pos.CENTER);
                    pane.add(krug, 0, 0);
                    pane.add(new Circle(50, 50, 5), 0, 2);
                    pane.add(new Circle(50, 50, 5), 2, 0);
                    pane.add(new Circle(50, 50, 5), 2, 2);
                }else if(vrste==3 && kolone==2){
                    pane.setAlignment(Pos.CENTER);
                    pane.add(krug, 0, 0);
                    pane.add(new Circle(50, 50, 5), 0, 2);
                    pane.add(new Circle(50, 50, 5), 1, 1);
                    pane.add(new Circle(50, 50, 5), 2, 0);
                    pane.add(new Circle(50, 50, 5), 2, 2);
                }else if(vrste==3 && kolone==3){
                    pane.setAlignment(Pos.CENTER);
                    pane.add(krug, 0, 0);
                    pane.add(new Circle(50, 50, 5), 0, 1);
                    pane.add(new Circle(50, 50, 5), 0, 2);
                    pane.add(new Circle(50, 50, 5), 2, 0);
                    pane.add(new Circle(50, 50, 5), 2, 1);
                    pane.add(new Circle(50, 50, 5), 2, 2);
                }
            }
        }
        
        root.getChildren().add(pane);
        
        Scene scena = new Scene(root, 100, 100);
        primaryStage.setTitle("Kockica");
        primaryStage.setResizable(true);
        primaryStage.setScene(scena);
        primaryStage.show();
       
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
