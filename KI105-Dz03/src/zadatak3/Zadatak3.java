/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak3 extends Application {

    @Override
    public void start(Stage stage) {
        ObservableList<PieChart.Data> podaci = FXCollections.observableArrayList(
            new PieChart.Data("55% Android", 45),
            new PieChart.Data("35% iOS", 35),
            new PieChart.Data("8% Blackberry", 8),
            new PieChart.Data("7% Windows", 7),
            new PieChart.Data("5% Ostali", 5));
        
        // kreiram objekat tipa PieChart i dodeljujem mu podatke
        PieChart grafik = new PieChart(podaci);
        
        // kreiram grupu i scenu
        Group root = new Group(grafik);
        Scene scena = new Scene(root, 500, 400);
        stage.setTitle("Procenat razlicitih OS na smartfonima na trzistu");
        stage.setScene(scena);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}