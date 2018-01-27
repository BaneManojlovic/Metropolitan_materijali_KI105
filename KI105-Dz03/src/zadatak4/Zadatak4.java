/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import static javafx.scene.paint.Color.WHITE;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak4 extends Application {

    @Override
    public void start(Stage stage) {
        
        GridPane grid1 = new GridPane();
        grid1.add(dugmadiA(), 0, 0);
        grid1.add(dugmadiB(), 1, 0);
        
        StackPane pane = new StackPane();
        Button plavoDugme = new Button("?");
        plavoDugme.setPrefWidth(250);
        plavoDugme.setTextFill(WHITE);
        plavoDugme.setStyle("-fx-background-color: #6666C1");
        pane.getChildren().add(plavoDugme);
        
        GridPane grid2 = new GridPane();
        grid2.add(dugmadiC(), 0, 0);
        grid2.add(dugmadiD(), 1, 0);
           
        GridPane grid = new GridPane();
        grid.add(grid1, 0, 0);
        grid.add(pane, 0, 1);
        grid.add(grid2, 0, 2);
        grid.setStyle("-fx-background-color: #00007A");
      
        Scene scene = new Scene(grid);
        stage.setTitle("Zadatak 4");
        stage.setScene(scene);
        stage.show();
    }
    
    public VBox dugmadiA(){
        VBox vBox = new VBox();
        Button dugmeA1 = new Button("A1");
        Button dugmeA2 = new Button("A2");
        Button dugmeA3 = new Button("A3");
        Button dugmeA4 = new Button("A4");
        Button dugmeA = new Button("A");
        dugmeA1.setPrefWidth(120);
        dugmeA2.setPrefWidth(120);
        dugmeA3.setPrefWidth(120);
        dugmeA4.setPrefWidth(120);
        dugmeA.setPrefWidth(150);
        VBox.setMargin(dugmeA1, new Insets(0, 0, 0, 0));
        VBox.setMargin(dugmeA2, new Insets(0, 0, 0, 20));
        VBox.setMargin(dugmeA3, new Insets(0, 0, 0, 40));
        VBox.setMargin(dugmeA4, new Insets(0, 0, 0, 50));
        VBox.setMargin(dugmeA, new Insets(0, 0, 0, 30));
        vBox.setPadding(new Insets(5, 5, 5, 5));
        vBox.getChildren().addAll(dugmeA1, dugmeA2, dugmeA3, dugmeA4, dugmeA);
        return vBox;
    }
    
    public VBox dugmadiB(){
        VBox vBox = new VBox();
        Button dugmeB1 = new Button("B1");
        Button dugmeB2 = new Button("B2");
        Button dugmeB3 = new Button("B3");
        Button dugmeB4 = new Button("B4");
        Button dugmeB = new Button("B");
        dugmeB1.setPrefWidth(120);
        dugmeB2.setPrefWidth(120);
        dugmeB3.setPrefWidth(120);
        dugmeB4.setPrefWidth(120);
        dugmeB.setPrefWidth(150);
        VBox.setMargin(dugmeB1, new Insets(0, 0, 0, 70));
        VBox.setMargin(dugmeB2, new Insets(0, 0, 0, 50));
        VBox.setMargin(dugmeB3, new Insets(0, 0, 0, 30));
        VBox.setMargin(dugmeB4, new Insets(0, 0, 0, 10));
        VBox.setMargin(dugmeB, new Insets(0, 0, 0, 0));
        vBox.setPadding(new Insets(5, 5, 5, 5));
        vBox.getChildren().addAll(dugmeB1, dugmeB2, dugmeB3, dugmeB4, dugmeB);
        return vBox;
    }
    
     public VBox dugmadiC(){
        VBox vBox = new VBox();
        Button dugmeC1 = new Button("C1");
        Button dugmeC2 = new Button("C2");
        Button dugmeC3 = new Button("C3");
        Button dugmeC4 = new Button("C4");
        Button dugmeC = new Button("C");
        dugmeC1.setPrefWidth(120);
        dugmeC2.setPrefWidth(120);
        dugmeC3.setPrefWidth(120);
        dugmeC4.setPrefWidth(120);
        dugmeC.setPrefWidth(150);
        VBox.setMargin(dugmeC1, new Insets(0, 0, 0, 50));
        VBox.setMargin(dugmeC2, new Insets(0, 0, 0, 40));
        VBox.setMargin(dugmeC3, new Insets(0, 0, 0, 20));
        VBox.setMargin(dugmeC4, new Insets(0, 0, 0, 0));
        VBox.setMargin(dugmeC, new Insets(0, 0, 0, 30));
        vBox.setPadding(new Insets(5, 5, 5, 5));
        vBox.getChildren().addAll(dugmeC, dugmeC1, dugmeC2, dugmeC3, dugmeC4);
        return vBox;
    }
    
    public VBox dugmadiD(){
        VBox vBox = new VBox();
        Button dugmeD1 = new Button("D1");
        Button dugmeD2 = new Button("D2");
        Button dugmeD3 = new Button("D3");
        Button dugmeD4 = new Button("D4");
        Button dugmeD = new Button("D");
        dugmeD1.setPrefWidth(120);
        dugmeD2.setPrefWidth(120);
        dugmeD3.setPrefWidth(120);
        dugmeD4.setPrefWidth(120);
        dugmeD.setPrefWidth(150);
        VBox.setMargin(dugmeD1, new Insets(0, 0, 0, 10));
        VBox.setMargin(dugmeD2, new Insets(0, 0, 0, 30));
        VBox.setMargin(dugmeD3, new Insets(0, 0, 0, 50));
        VBox.setMargin(dugmeD4, new Insets(0, 0, 0, 70));
        VBox.setMargin(dugmeD, new Insets(0, 0, 0, 0));
        vBox.setPadding(new Insets(5, 5, 5, 5));
        vBox.getChildren().addAll(dugmeD, dugmeD1, dugmeD2, dugmeD3, dugmeD4);
        return vBox;
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}