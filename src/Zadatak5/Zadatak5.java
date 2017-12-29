package Zadatak5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;


public class Zadatak5 extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox boks = new VBox(4);
        boks.setPadding(new Insets(6, 6, 6, 6));
        
        Button a1 = new Button("A1");
        Button a2 = new Button("A2");
        Button a3 = new Button("A3");
        Button a4 = new Button("A4");
        Button a = new Button("A");

        a1.setPrefWidth(100);
        a2.setPrefWidth(100);
        a3.setPrefWidth(100);
        a4.setPrefWidth(100);
        a.setPrefWidth(150);

        VBox.setMargin(a1, new Insets(0, 0, 0, 0));
        VBox.setMargin(a2, new Insets(0, 0, 0, 30));
        VBox.setMargin(a3, new Insets(0, 0, 0, 60));
        VBox.setMargin(a4, new Insets(0, 0, 0, 90));
        VBox.setMargin(a, new Insets(0, 0, 0, 40));

        boks.getChildren().addAll(a1, a2, a3, a4, a);

        
        
        VBox boks1 = new VBox(4);
        boks1.setPadding(new Insets(6, 6, 6, 6));

        Button b1 = new Button("B1");
        Button b2 = new Button("B2");
        Button b3 = new Button("B3");
        Button b4 = new Button("B4");
        Button b = new Button("B");

        b1.setPrefWidth(100);
        b2.setPrefWidth(100);
        b3.setPrefWidth(100);
        b4.setPrefWidth(100);
        b.setPrefWidth(150);

        VBox.setMargin(b1, new Insets(0, 0, 0, 90));
        VBox.setMargin(b2, new Insets(0, 0, 0, 60));
        VBox.setMargin(b3, new Insets(0, 0, 0, 30));
        VBox.setMargin(b4, new Insets(0, 0, 0, 0));
        VBox.setMargin(b, new Insets(0, 0, 0, 0));

        boks1.getChildren().addAll(b1, b2, b3, b4, b);

        
        
        VBox boks3 = new VBox(4);
        boks3.setPadding(new Insets(6, 6, 6, 6));

        Button c = new Button("C");
        Button c1 = new Button("C1");
        Button c2 = new Button("C2");
        Button c3 = new Button("C3");
        Button c4 = new Button("C4");

        c1.setPrefWidth(100);
        c2.setPrefWidth(100);
        c3.setPrefWidth(100);
        c4.setPrefWidth(100);
        c.setPrefWidth(150);

        VBox.setMargin(c1, new Insets(0, 0, 0, 90));
        VBox.setMargin(c2, new Insets(0, 0, 0, 60));
        VBox.setMargin(c3, new Insets(0, 0, 0, 30));
        VBox.setMargin(c4, new Insets(0, 0, 0, 0));
        VBox.setMargin(c, new Insets(0, 0, 0, 40));

        boks3.getChildren().addAll(c, c1, c2, c3, c4);

        
        
        VBox boks4 = new VBox(4);
        boks4.setPadding(new Insets(6, 6, 6, 6));
        
        Button d1 = new Button("D1");
        Button d2 = new Button("D2");
        Button d3 = new Button("D3");
        Button d4 = new Button("D4");
        Button d = new Button("D");

        d1.setPrefWidth(100);
        d2.setPrefWidth(100);
        d3.setPrefWidth(100);
        d4.setPrefWidth(100);
        d.setPrefWidth(150);

        VBox.setMargin(d1, new Insets(0, 0, 0, 0));
        VBox.setMargin(d2, new Insets(0, 0, 0, 30));
        VBox.setMargin(d3, new Insets(0, 0, 0, 60));
        VBox.setMargin(d4, new Insets(0, 0, 0, 90));
        VBox.setMargin(d, new Insets(0, 0, 0, 0));

        boks4.getChildren().addAll(d, d1, d2, d3, d4);

        GridPane gridNorth = new GridPane();
        gridNorth.add(boks, 0, 0);
        gridNorth.add(boks1, 1, 0);

        GridPane gridSouth = new GridPane();
        gridSouth.add(boks3, 0, 0);
        gridSouth.add(boks4, 1, 0);

        
        StackPane pane = new StackPane();
        Button questionMark = new Button("?");
        questionMark.setPrefWidth(300);
        pane.getChildren().add(questionMark);

        
        GridPane grid1 = new GridPane();
        
        grid1.add(gridNorth, 0, 0);
        grid1.add(pane, 0, 1);
        grid1.add(gridSouth, 0, 2);
        grid1.setStyle("-fx-background-color: black;");
        
        
        // Kreira scenu i stavlja je na pozornicu
        Scene scene = new Scene(grid1);
        primaryStage.setTitle("Slagalica"); // Unos naziva pozornice
        primaryStage.setScene(scene); // Postavlja scenu
        primaryStage.show(); // Prikazuje pozornicu

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
