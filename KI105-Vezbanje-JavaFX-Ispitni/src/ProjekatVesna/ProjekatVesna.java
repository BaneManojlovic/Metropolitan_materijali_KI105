/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjekatVesna;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Branislav
 */
public class ProjekatVesna extends Application {
    
    //Definisanje animacija
    RotateTransition rotateTransition;
    TranslateTransition translateTransition;
    ScaleTransition scaleTransition;

    //ispitivanje da li je animacija startovana
    boolean started = false;

    //bryina animacije (konstanta)
    final int SECOND_MILLIS = 10000;

    Rectangle rect;

    BorderPane root = new BorderPane();

    @Override
    public void start(Stage primaryStage) {

        FlowPane northPane = new FlowPane(Orientation.HORIZONTAL);
        Label lblStranica = new Label("Stranica kvadrata");
        TextField txtStranica = new TextField();
        Label lblAnimacija = new Label("Brzina animacije");
        TextField txtAnimacija = new TextField();

        ObservableList<String> options = FXCollections.observableArrayList("Rotacija", "Translacija", "Skaliranje");
        ComboBox<String> comboAnimation = new ComboBox<>(options);
        comboAnimation.setPromptText("Izaberi animaciju");

        Button btnStart = new Button("Start/Pause");
        northPane.getChildren().addAll(lblStranica, txtStranica, lblAnimacija, txtAnimacija, comboAnimation, btnStart);

        rect = new Rectangle(200, 200);
        rect.setFill(Color.CORAL);
        RotateTransition rotate = new RotateTransition(Duration.millis(5000), rect);
        rotate.setAutoReverse(false);
        //rotate.setByAngle(360);
        rotate.setCycleCount(Timeline.INDEFINITE);

        BorderPane south = new BorderPane();
        GridPane southPane = new GridPane();
        Label lblRed = new Label("Red");
        TextField txtRed = new TextField();
        Label lblGreen = new Label("Green");
        TextField txtGreen = new TextField();
        Label lblBlue = new Label("Blue");
        TextField txtBlue = new TextField();
        southPane.add(lblRed, 0, 0);
        southPane.add(txtRed, 1, 0);
        southPane.add(lblGreen, 0, 1);
        southPane.add(txtGreen, 1, 1);
        southPane.add(lblBlue, 0, 2);
        southPane.add(txtBlue, 1, 2);
        south.setCenter(southPane);

        root.setTop(northPane);
        root.setCenter(rect);
        root.setBottom(south);

        Scene scene = new Scene(root, 600, 600);

        primaryStage.setTitle("Projektni zadatak 1");
        primaryStage.setScene(scene);
        primaryStage.show();

        //event
        btnStart.setOnAction(e -> {
            if (!started) {
                String selection = comboAnimation.getSelectionModel().getSelectedItem();
                int stranicaKvadrata = Integer.parseInt(txtStranica.getText());
                rect.setHeight(stranicaKvadrata);
                rect.setWidth(stranicaKvadrata);
                int red = Integer.parseInt(txtRed.getText());
                int green = Integer.parseInt(txtGreen.getText());
                int blue = Integer.parseInt(txtBlue.getText());
                rect.setFill(Color.rgb(red, green, blue));
                int brzinaAnimacije = Integer.parseInt(txtAnimacija.getText());
                switch (selection) {
                    case "Rotacija":
                        rotateAnimation(rect, brzinaAnimacije);
                        break;

                    case "Translacija":
                        translateAnimation(rect, brzinaAnimacije);
                        break;

                    case "Skaliranje":
                        scaleAnimation(rect, brzinaAnimacije);
                        break;

                }
            } else {
                String selection = comboAnimation.getSelectionModel().getSelectedItem();
                switch (selection) {
                    case "Rotacija":
                        rotateTransition.stop();
                        break;
                    case "Translacija":
                        translateTransition.stop();
                        break;
                    case "Skaliranje":
                        scaleTransition.stop();
                        break;

                }
            }
            started = !started;
        });
    }

    public void rotateAnimation(Rectangle rect, int speed) {
        rotateTransition = new RotateTransition(Duration.millis(SECOND_MILLIS / speed), rect);
        rotateTransition.setCycleCount(Timeline.INDEFINITE);
        rotateTransition.setByAngle(360);
        rotateTransition.play();
    }

    public void translateAnimation(Rectangle rect, int speed) {
        translateTransition = new TranslateTransition(Duration.millis(SECOND_MILLIS / speed), rect);
        translateTransition.setCycleCount(Timeline.INDEFINITE);
        translateTransition.setFromX(root.getLayoutX());
        translateTransition.setToX(root.getWidth());
        translateTransition.play();
    }

    public void scaleAnimation(Rectangle rect, int speed) {
        scaleTransition = new ScaleTransition(Duration.millis(SECOND_MILLIS / speed), rect);
        scaleTransition.setByX(1);
        scaleTransition.setByY(1);
        scaleTransition.play();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
