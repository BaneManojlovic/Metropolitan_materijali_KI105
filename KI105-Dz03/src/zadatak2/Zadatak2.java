/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Branislav
 */
public class Zadatak2 extends Application {

    @Override
    public void start(Stage stage) {
        String unos = JOptionPane.showInputDialog("Unesite broj od 1 do 6:");
        int broj = Integer.parseInt(unos);
        
        switch(broj){
            case 1:
                kockica(1, 1, stage);
                break;
            case 2:
                kockica(2, 1, stage);
                break;
            case 3:
                kockica(3, 1, stage);
                break;
            case 4:
                kockica(2, 2, stage);
                break;
            case 5:
                kockica(5, 1, stage);
                break;
            case 6:
                kockica(2, 3, stage);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Uneli ste nedozvoljeni broj!");
                System.exit(0);
                
        }
    }
    
    public void kockica(int vrste, int kolone, Stage stage){
        
        // pravim layout za krugove
        VBox root = new VBox();
        root.setSpacing(20);
         
        // kreiramo grid pane kontejner
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(40, 40, 40, 40));
        grid.setHgap(8);
        grid.setVgap(8);
        int signInd = 0;
        for (int i = 0; i < vrste; i++) {
            for (int j = 0; j < kolone; j++) {
                // kreiram krug
                Circle krug = new Circle();
                krug.setCenterX(100);
                krug.setCenterY(100);
                krug.setRadius(5);
                krug.setStroke(Color.BLACK);
                krug.setFill(Color.BLACK);
               // grid.add(krug, i, j);
                if(vrste==1 && kolone==1){
                    grid.add(krug, 1, 1);
                }else if(vrste==2 && kolone==1){
                    grid.add(krug, 0, 0);
                    Circle krug2 = new Circle();
                    krug2.setCenterX(100);
                    krug2.setCenterY(100);
                    krug2.setRadius(5);
                    krug2.setStroke(Color.BLACK);
                    krug2.setFill(Color.BLACK);
                    grid.add(krug2, 1, 1);
                }else if(vrste==3 && kolone==1){
                    grid.add(krug, 0, 0);
                    Circle krug2 = new Circle();
                    krug2.setCenterX(100);
                    krug2.setCenterY(100);
                    krug2.setRadius(5);
                    krug2.setStroke(Color.BLACK);
                    krug2.setFill(Color.BLACK);
                    grid.add(krug2, 1, 1);
                    Circle krug3 = new Circle();
                    krug3.setCenterX(100);
                    krug3.setCenterY(100);
                    krug3.setRadius(5);
                    krug3.setStroke(Color.BLACK);
                    krug.setFill(Color.BLACK);
                    grid.add(krug3, 2, 2);
                }else if(vrste==2 && kolone==2){
                    grid.add(krug, 0, 0);
                    Circle krug2 = new Circle();
                    krug2.setCenterX(100);
                    krug2.setCenterY(100);
                    krug2.setRadius(5);
                    krug2.setStroke(Color.BLACK);
                    krug2.setFill(Color.BLACK);
                    grid.add(krug2, 1, 0);
                    Circle krug3 = new Circle();
                    krug3.setCenterX(100);
                    krug3.setCenterY(100);
                    krug3.setRadius(5);
                    krug3.setStroke(Color.BLACK);
                    krug.setFill(Color.BLACK);
                    grid.add(krug3, 0, 1);
                    Circle krug4 = new Circle();
                    krug4.setCenterX(100);
                    krug4.setCenterY(100);
                    krug4.setRadius(5);
                    krug4.setStroke(Color.BLACK);
                    krug4.setFill(Color.BLACK);
                    grid.add(krug4, 1, 1);
                }else if(vrste==5 && kolone==1){
                    grid.add(krug, 0, 0);
                    Circle krug2 = new Circle();
                    krug2.setCenterX(100);
                    krug2.setCenterY(100);
                    krug2.setRadius(5);
                    krug2.setStroke(Color.BLACK);
                    krug2.setFill(Color.BLACK);
                    grid.add(krug2, 2, 0);
                    Circle krug3 = new Circle();
                    krug3.setCenterX(100);
                    krug3.setCenterY(100);
                    krug3.setRadius(5);
                    krug3.setStroke(Color.BLACK);
                    krug.setFill(Color.BLACK);
                    grid.add(krug3, 1, 1);
                    Circle krug4 = new Circle();
                    krug4.setCenterX(100);
                    krug4.setCenterY(100);
                    krug4.setRadius(5);
                    krug4.setStroke(Color.BLACK);
                    krug4.setFill(Color.BLACK);
                    grid.add(krug4, 0, 2);
                    Circle krug5 = new Circle();
                    krug5.setCenterX(100);
                    krug5.setCenterY(100);
                    krug5.setRadius(5);
                    krug5.setStroke(Color.BLACK);
                    krug5.setFill(Color.BLACK);
                    grid.add(krug5, 2, 2);
                }else if(vrste==2 && kolone==3){
                    grid.add(krug, i, j);
                }
            }
        }

        // stavljamo grid kontejner unutar root-a
        root.getChildren().add(grid);
        
        // podesavamo scenu
        Scene scene = new Scene(root, 200, 160);

        // kreiranje scene i njeno postavljanje na pozornicu
        stage.setTitle("Kockica");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }  
}