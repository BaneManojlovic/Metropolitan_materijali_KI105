package Zadatak3;

import java.util.Random;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Zadatak3 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Rectangle rectangle = new Rectangle(0, 0, 25, 50);
        rectangle.setFill(Color.ORANGE);

        Polyline linija = new Polyline();

        Random random = new Random();
        
        
        double x = (double) random.nextInt(200);
        double y = (double) random.nextInt(200);
        double x1 = (double) random.nextInt(200);
        double y1 = (double) random.nextInt(200);
        double x2 = (double) random.nextInt(200);
        double y2 = (double) random.nextInt(200);
        double x3 = (double) random.nextInt(200);
        double y3 = (double) random.nextInt(200);
        double x4 = (double) random.nextInt(200);
        double y4 = (double) random.nextInt(200);
        double x5 = (double) random.nextInt(200);
        double y5 = (double) random.nextInt(200);
        double x6 = (double) random.nextInt(200);
        double y6 = (double) random.nextInt(200);
        double x7 = (double) random.nextInt(200);
        double y7 = (double) random.nextInt(200); 

        linija.getPoints().addAll(x, y, x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7);

        pane.getChildren().add(rectangle);
        pane.getChildren().add(linija);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(linija);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play(); 

        //linija.setOnMousePressed(e -> pt.pause());
        //linija.setOnMouseReleased(e -> pt.play());
        
        Scene scene = new Scene(pane, 250, 200);
        primaryStage.setTitle("PathTransitionDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
