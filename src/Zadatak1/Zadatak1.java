package Zadatak1;

import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Zadatak1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Scanner ulaz = new Scanner(System.in);
        System.out.print("Broj redova : ");
        int n = ulaz.nextInt();
        System.out.print("Broj kolona : ");
        int m = ulaz.nextInt();
        
        GridPane grid = new GridPane();
         grid.setPadding(new Insets(6, 6, 6, 6));
         grid.setHgap(10);
         grid.setVgap(10);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Circle circle = new Circle();
                circle.setCenterX(100);
                circle.setCenterY(100);
                circle.setRadius(50);
                circle.setFill(Color.color(Math.random(), Math.random(),Math.random()));
                grid.add(circle, i, j);
            }
        }
        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setTitle("Krugovi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}