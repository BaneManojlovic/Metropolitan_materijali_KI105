/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak5;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Branislav
 */
public class Zadatak5 extends Application {
 
    private static final int KEYBOARD_MOVEMENT_DELTA = 5;
    private static final Duration TRANSLATE_DURATION = Duration.seconds(0.25);

    @Override
    public void start(Stage stage) throws Exception {

        final Circle circle = createCircle();
        final Group group = new Group(circle);
        final TranslateTransition transition = createTranslateTransition(circle);
        final Scene scene = new Scene(group, 400, 400, Color.AQUA);

        moveCircleOnKeyPress(scene, circle);
        moveCircleOnMousePress(scene, circle, transition);

        stage.setScene(scene);
        stage.show();
    }

    private Circle createCircle() {
        final Circle circle = new Circle(200, 200, 5, Color.RED);
        return circle;
    }

    private TranslateTransition createTranslateTransition(final Circle circle) {
        final TranslateTransition transition = new TranslateTransition(TRANSLATE_DURATION, circle);
        transition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                circle.setCenterX(circle.getTranslateX() + circle.getCenterX());
                circle.setCenterY(circle.getTranslateY() + circle.getCenterY());
                circle.setTranslateX(0);
                circle.setTranslateY(0);
            }
        });
        return transition;
    }

    private void moveCircleOnKeyPress(Scene scene, final Circle circle) {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:
                        circle.setCenterY(circle.getCenterY() - KEYBOARD_MOVEMENT_DELTA);
                        break;
                    case RIGHT:
                        circle.setCenterX(circle.getCenterX() + KEYBOARD_MOVEMENT_DELTA);
                        break;
                    case DOWN:
                        circle.setCenterY(circle.getCenterY() + KEYBOARD_MOVEMENT_DELTA);
                        break;
                    case LEFT:
                        circle.setCenterX(circle.getCenterX() - KEYBOARD_MOVEMENT_DELTA);
                        break;
                }
            }
        });
    }

    private void moveCircleOnMousePress(Scene scene, final Circle circle, final TranslateTransition transition) {
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (!event.isControlDown()) {
                    circle.setCenterX(event.getSceneX());
                    circle.setCenterY(event.getSceneY());
                } else {
                    transition.setToX(event.getSceneX() - circle.getCenterX());
                    transition.setToY(event.getSceneY() - circle.getCenterY());
                    transition.playFromStart();
                }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}