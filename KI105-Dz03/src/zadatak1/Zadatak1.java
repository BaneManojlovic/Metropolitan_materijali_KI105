/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Branislav
 */
public class Zadatak1 extends Application {

    @Override
    public void start(Stage stage) {
        // unosim broj vrsta i kolona
        String brojVrsta = JOptionPane.showInputDialog("Unesite broj vrsta:");
        String brojKolona = JOptionPane.showInputDialog("Unesite broj kolona:");
        int vrste = Integer.parseInt(brojVrsta);
        int kolone = Integer.parseInt(brojKolona);

        GridPane oknoMatrica = new GridPane();
        for (int i = 0; i < vrste; i++) {
            for (int j = 0; j < kolone; j++) {
                // kreiram krug
                Circle krug = new Circle();
                krug.setCenterX(100);
                krug.setCenterY(100);
                krug.setRadius(50);
                krug.setStroke(Color.BLACK);
                krug.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                oknoMatrica.add(krug, i, j);
            }
        }

        // kreiranje scene i njeno postavljanje na pozornicu
        Scene scena = new Scene(oknoMatrica, 800, 500);
        stage.setTitle("Kruzic");
        stage.setScene(scena);
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
