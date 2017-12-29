package Zadatak2;

import java.util.Scanner;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Zadatak2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Scanner ulaz = new Scanner(System.in);
        System.out.print("Unesite broj : ");
        int n = ulaz.nextInt();

        switch (n) {
            case 1:
                StackPane stak = new StackPane();

                Circle circle1 = new Circle();
                circle1.setCenterX(100);
                circle1.setCenterY(100);
                circle1.setRadius(50);
                circle1.setStroke(Color.BLACK);
                circle1.setFill(Color.GRAY);
                circle1.radiusProperty().bind(stak.widthProperty().divide(8));
                circle1.radiusProperty().bind(stak.heightProperty().divide(8));
                stak.getChildren().add(circle1);

                Scene scene = new Scene(stak, 200, 200);
                primaryStage.setTitle("Kec");
                primaryStage.setScene(scene);
                primaryStage.show();

                break;

            case 2:

                GridPane grid = new GridPane();
                grid.setPadding(new Insets(10, 10, 10, 10));

                Circle circle2 = new Circle();
                circle2.setCenterX(100);
                circle2.setCenterY(100);
                circle2.setRadius(50);
                circle2.setStroke(Color.BLACK);
                circle2.setFill(Color.GRAY);

                circle2.radiusProperty().bind(grid.widthProperty().divide(8));
                circle2.radiusProperty().bind(grid.heightProperty().divide(8));

                Circle circle3 = new Circle();
                circle3.setCenterX(100);
                circle3.setCenterY(100);
                circle3.setRadius(50);
                circle3.setStroke(Color.BLACK);
                circle3.setFill(Color.GRAY);
                //circle3.centerXProperty().bind(grid.widthProperty());
                //circle3.centerYProperty().bind(grid.heightProperty());

                circle3.radiusProperty().bind(grid.widthProperty().divide(8));
                circle3.radiusProperty().bind(grid.heightProperty().divide(8));

                grid.add(circle2, 0, 0);
                grid.add(circle3, 1, 1);

                Scene scene1 = new Scene(grid, 200, 200);
                primaryStage.setTitle("Dvojka");
                primaryStage.setScene(scene1);
                primaryStage.show();
                break;

            case 3:

                GridPane grid1 = new GridPane();
                grid1.setPadding(new Insets(10, 10, 10, 10));

                Circle circle4 = new Circle();
                circle4.setCenterX(100);
                circle4.setCenterY(100);
                circle4.setRadius(50);
                circle4.setStroke(Color.BLACK);
                circle4.setFill(Color.GRAY);
                circle4.radiusProperty().bind(grid1.widthProperty().divide(8));
                circle4.radiusProperty().bind(grid1.heightProperty().divide(8));

                Circle circle5 = new Circle();
                circle5.setCenterX(100);
                circle5.setCenterY(100);
                circle5.setRadius(50);
                circle5.setStroke(Color.BLACK);
                circle5.setFill(Color.GRAY);
                circle5.radiusProperty().bind(grid1.widthProperty().divide(8));
                circle5.radiusProperty().bind(grid1.heightProperty().divide(8));

                Circle circle6 = new Circle();
                circle6.setCenterX(100);
                circle6.setCenterY(100);
                circle6.setRadius(50);
                circle6.setStroke(Color.BLACK);
                circle6.setFill(Color.GRAY);
                circle6.radiusProperty().bind(grid1.widthProperty().divide(8));
                circle6.radiusProperty().bind(grid1.heightProperty().divide(8));

                grid1.add(circle4, 0, 0);
                grid1.add(circle5, 1, 1);
                grid1.add(circle6, 2, 2);

                Scene scene2 = new Scene(grid1, 200, 200);
                primaryStage.setTitle("Trojka");
                primaryStage.setScene(scene2);
                primaryStage.show();
                break;

            case 4:

                GridPane grid2 = new GridPane();

                grid2.setPadding(new Insets(10, 10, 10, 10));
                grid2.setHgap(25);
                grid2.setVgap(25);

                Circle circle7 = new Circle();
                circle7.setCenterX(100);
                circle7.setCenterY(100);
                circle7.setRadius(50);
                circle7.setStroke(Color.BLACK);
                circle7.setFill(Color.GRAY);
                circle7.radiusProperty().bind(grid2.widthProperty().divide(8));
                circle7.radiusProperty().bind(grid2.heightProperty().divide(8));

                Circle circle8 = new Circle();
                circle8.setCenterX(100);
                circle8.setCenterY(100);
                circle8.setRadius(50);
                circle8.setStroke(Color.BLACK);
                circle8.setFill(Color.GRAY);
                circle8.radiusProperty().bind(grid2.widthProperty().divide(8));
                circle8.radiusProperty().bind(grid2.heightProperty().divide(8));

                Circle circle9 = new Circle();
                circle9.setCenterX(100);
                circle9.setCenterY(100);
                circle9.setRadius(50);
                circle9.setStroke(Color.BLACK);
                circle9.setFill(Color.GRAY);
                circle9.radiusProperty().bind(grid2.widthProperty().divide(8));
                circle9.radiusProperty().bind(grid2.heightProperty().divide(8));

                Circle circle10 = new Circle();
                circle10.setCenterX(100);
                circle10.setCenterY(100);
                circle10.setRadius(50);
                circle10.setStroke(Color.BLACK);
                circle10.setFill(Color.GRAY);
                circle10.radiusProperty().bind(grid2.widthProperty().divide(8));
                circle10.radiusProperty().bind(grid2.heightProperty().divide(8));

                grid2.add(circle7, 0, 0);
                grid2.add(circle8, 1, 0);
                grid2.add(circle9, 0, 1);
                grid2.add(circle10, 1, 1);

                Scene scene3 = new Scene(grid2, 200, 200);
                primaryStage.setTitle("Cetvorka");
                primaryStage.setScene(scene3);
                primaryStage.show();
                break;

            case 5:

                GridPane grid3 = new GridPane();

                grid3.setPadding(new Insets(10, 10, 10, 10));
                //grid3.setHgap(25);
                //grid3.setVgap(25);

                Circle circle11 = new Circle();
                circle11.setCenterX(100);
                circle11.setCenterY(100);
                circle11.setRadius(50);
                circle11.setStroke(Color.BLACK);
                circle11.setFill(Color.GRAY);
                circle11.radiusProperty().bind(grid3.widthProperty().divide(8));
                circle11.radiusProperty().bind(grid3.heightProperty().divide(8));

                Circle circle12 = new Circle();
                circle12.setCenterX(100);
                circle12.setCenterY(100);
                circle12.setRadius(50);
                circle12.setStroke(Color.BLACK);
                circle12.setFill(Color.GRAY);
                circle12.radiusProperty().bind(grid3.widthProperty().divide(8));
                circle12.radiusProperty().bind(grid3.heightProperty().divide(8));

                Circle circle13 = new Circle();
                circle13.setCenterX(100);
                circle13.setCenterY(100);
                circle13.setRadius(50);
                circle13.setStroke(Color.BLACK);
                circle13.setFill(Color.GRAY);
                circle13.radiusProperty().bind(grid3.widthProperty().divide(8));
                circle13.radiusProperty().bind(grid3.heightProperty().divide(8));

                Circle circle14 = new Circle();
                circle14.setCenterX(100);
                circle14.setCenterY(100);
                circle14.setRadius(50);
                circle14.setStroke(Color.BLACK);
                circle14.setFill(Color.GRAY);
                circle14.radiusProperty().bind(grid3.widthProperty().divide(8));
                circle14.radiusProperty().bind(grid3.heightProperty().divide(8));

                Circle circle15 = new Circle();
                circle15.setCenterX(100);
                circle15.setCenterY(100);
                circle15.setRadius(50);
                circle15.setStroke(Color.BLACK);
                circle15.setFill(Color.GRAY);
                circle15.radiusProperty().bind(grid3.widthProperty().divide(8));
                circle15.radiusProperty().bind(grid3.heightProperty().divide(8));

                grid3.add(circle11, 0, 0);
                grid3.add(circle12, 2, 0);
                grid3.add(circle13, 1, 1);
                grid3.add(circle14, 0, 2);
                grid3.add(circle15, 2, 2);

                Scene scene4 = new Scene(grid3, 200, 200);
                primaryStage.setTitle("Petica");
                primaryStage.setScene(scene4);
                primaryStage.show();
                break;

            case 6:

                GridPane grid4 = new GridPane();

                grid4.setPadding(new Insets(10, 10, 10, 10));
                grid4.setHgap(25);
                grid4.setVgap(15);

                Circle circle16 = new Circle();
                circle16.setCenterX(100);
                circle16.setCenterY(100);
                circle16.setRadius(50);
                circle16.setStroke(Color.BLACK);
                circle16.setFill(Color.GRAY);
                circle16.radiusProperty().bind(grid4.widthProperty().divide(8));
                circle16.radiusProperty().bind(grid4.heightProperty().divide(8));

                Circle circle17 = new Circle();
                circle17.setCenterX(100);
                circle17.setCenterY(100);
                circle17.setRadius(50);
                circle17.setStroke(Color.BLACK);
                circle17.setFill(Color.GRAY);
                circle17.radiusProperty().bind(grid4.widthProperty().divide(8));
                circle17.radiusProperty().bind(grid4.heightProperty().divide(8));

                Circle circle18 = new Circle();
                circle18.setCenterX(100);
                circle18.setCenterY(100);
                circle18.setRadius(50);
                circle18.setStroke(Color.BLACK);
                circle18.setFill(Color.GRAY);
                circle18.radiusProperty().bind(grid4.widthProperty().divide(8));
                circle18.radiusProperty().bind(grid4.heightProperty().divide(8));

                Circle circle19 = new Circle();
                circle19.setCenterX(100);
                circle19.setCenterY(100);
                circle19.setRadius(50);
                circle19.setStroke(Color.BLACK);
                circle19.setFill(Color.GRAY);
                circle19.radiusProperty().bind(grid4.widthProperty().divide(8));
                circle19.radiusProperty().bind(grid4.heightProperty().divide(8));

                Circle circle20 = new Circle();
                circle20.setCenterX(100);
                circle20.setCenterY(100);
                circle20.setRadius(50);
                circle20.setStroke(Color.BLACK);
                circle20.setFill(Color.GRAY);
                circle20.radiusProperty().bind(grid4.widthProperty().divide(8));
                circle20.radiusProperty().bind(grid4.heightProperty().divide(8));

                Circle circle21 = new Circle();
                circle21.setCenterX(100);
                circle21.setCenterY(100);
                circle21.setRadius(50);
                circle21.setStroke(Color.BLACK);
                circle21.setFill(Color.GRAY);
                circle21.radiusProperty().bind(grid4.widthProperty().divide(8));
                circle21.radiusProperty().bind(grid4.heightProperty().divide(8));

                grid4.add(circle16, 0, 0);
                grid4.add(circle17, 1, 0);
                grid4.add(circle18, 0, 1);
                grid4.add(circle19, 1, 1);
                grid4.add(circle20, 0, 2);
                grid4.add(circle21, 1, 2);

                Scene scene5 = new Scene(grid4, 200, 200);
                primaryStage.setTitle("Sestica");
                primaryStage.setScene(scene5);
                primaryStage.show();
                break;

        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}
