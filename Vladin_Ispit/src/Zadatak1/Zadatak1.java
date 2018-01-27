package Zadatak1;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Zadatak1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();

        GridPane GP = new GridPane();

        Circle c1 = new Circle(20);
        c1.setFill(Color.RED);
        Circle c2 = new Circle(20);
        c2.setFill(Color.GREEN);
        Circle c3 = new Circle(20);
        c3.setFill(Color.BLUE);

        GP.setPadding(new Insets(6, 6, 6, 6));
        GP.setHgap(5);
        GP.setVgap(5);
        GP.setAlignment(Pos.TOP_CENTER);

        GP.add(c1, 0, 0);
        GP.add(c2, 1, 0);
        GP.add(c3, 2, 0);

        GridPane grid3 = new GridPane();
        grid3.setPadding(new Insets(6, 6, 6, 6));
        grid3.setHgap(5);
        grid3.setVgap(5);
        grid3.setAlignment(Pos.CENTER_LEFT);

        ToggleGroup firstGroup = new ToggleGroup();
        RadioButton color = new RadioButton("Color");
        RadioButton black = new RadioButton("Black");
        color.setToggleGroup(firstGroup);
        black.setToggleGroup(firstGroup);
        color.setSelected(true);

        grid3.add(color, 0, 0);
        grid3.add(black, 0, 1);

        GridPane grid2 = new GridPane();
        grid2.setPadding(new Insets(6, 6, 6, 6));
        grid2.setHgap(5);
        grid2.setVgap(5);
        grid2.setAlignment(Pos.TOP_CENTER);
        CheckBox prva = new CheckBox("Prva");
        CheckBox druga = new CheckBox("Druga");
        CheckBox treca = new CheckBox("Treca");
        prva.setSelected(true);
        druga.setSelected(true);
        treca.setSelected(true);
        grid2.add(prva, 0, 0);
        grid2.add(druga, 1, 0);
        grid2.add(treca, 2, 0);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(6, 6, 6, 6));
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setAlignment(Pos.CENTER);

        Button btn = new Button();
        btn.setText("Play");

        Button btn1 = new Button();
        btn1.setText("Stop");

        grid.add(btn, 0, 0);
        grid.add(btn1, 1, 0);

        GridPane grid1 = new GridPane();
        grid1.setPadding(new Insets(6, 6, 6, 6));
        grid1.setHgap(5);
        grid1.setVgap(5);
        grid1.setAlignment(Pos.CENTER_RIGHT);

        Label y = new Label("y");
        TextField tekst = new TextField();
        tekst.setPrefColumnCount(3);
        tekst.setPromptText("80");

        grid1.add(y, 0, 0);
        grid1.add(tekst, 1, 0);

        root.setTop(grid2);
        root.setLeft(grid3);
        root.setCenter(GP);
        root.setBottom(grid);
        root.setRight(grid1);

        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("Animacije krugova");
        primaryStage.setScene(scene);
        primaryStage.show();

        TranslateTransition tt1 = new TranslateTransition(Duration.millis(1000), c1);
        TranslateTransition tt2 = new TranslateTransition(Duration.millis(1000), c2);
        TranslateTransition tt3 = new TranslateTransition(Duration.millis(1000), c3);
        tt1.setByY(200);
        tt1.setAutoReverse(true);
        tt1.setCycleCount(Timeline.INDEFINITE);
        tt2.setByY(200);
        tt2.setAutoReverse(true);
        tt2.setCycleCount(Timeline.INDEFINITE);
        tt3.setByY(200);
        tt3.setAutoReverse(true);
        tt3.setCycleCount(Timeline.INDEFINITE);

        btn.setOnAction(e -> {
            try {
                double ipsilon = Double.parseDouble(tekst.getText());

                if (ipsilon > scene.getHeight()) {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Dialog");
                    alert.setHeaderText("");
                    alert.setContentText("y je vece od visine ekrana!!");
                    alert.showAndWait();

                } else {
                    if (prva.isSelected()) {

                        tt1.setByY(ipsilon);
                        tt1.play();

                    }

                    if (druga.isSelected()) {

                        tt2.setByY(ipsilon);
                        tt2.play();
                    }

                    if (treca.isSelected()) {

                        tt3.setByY(ipsilon);
                        tt3.play();

                    }
                }

            } catch (NumberFormatException x) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("");
                alert.setContentText("Unesite y!!!");
                alert.showAndWait();
            }
        });

        btn1.setOnAction(e -> {

            if (prva.isSelected()) {

                tt1.stop();

            }

            if (druga.isSelected()) {

                tt2.stop();
            }

            if (treca.isSelected()) {

                tt3.stop();

            }

        });

        black.setOnAction(e -> {

            if (black.isSelected()) {

                c1.setFill(Color.BLACK);
                c2.setFill(Color.BLACK);
                c3.setFill(Color.BLACK);

            }

        });

        color.setOnAction(e -> {

            if (color.isSelected()) {

                c1.setFill(Color.RED);
                c2.setFill(Color.GREEN);
                c3.setFill(Color.BLUE);

            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
