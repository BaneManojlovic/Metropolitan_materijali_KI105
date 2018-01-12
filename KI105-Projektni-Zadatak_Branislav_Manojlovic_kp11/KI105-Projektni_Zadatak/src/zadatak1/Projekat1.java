/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak1;

import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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
import javax.swing.text.Position;

/**
 *
 * @author Branislav
 */
public class Projekat1 extends Application {
    // vrste animacija koje ce se upotrebiti
    RotateTransition rotatTrans;
    TranslateTransition transTrans;
    ScaleTransition scaleTrans;

    boolean isStrated = false;
    final int konstBrzinaAnimacije = 10000;
    //kreiram glavni GridPane na koji cu redjati ostale
    private BorderPane pane = new BorderPane();
    private Rectangle kvadrat;
   // private RotateTransition rotacija = new RotateTransition(Duration.millis(10000), kvadrat);
    private TextField tfStranicaKvadrata = new TextField("Stranica kvadrata");
    private TextField tfBrzinaAnimacije = new TextField("Brzina animacije");
    private ObservableList<String> animacije = FXCollections.observableArrayList("Rotacija", "Translacija", "Skaliranje");
    private ComboBox<String> cbo1 = new ComboBox<>(animacije);
    private Button btnStart = new Button("Start/Pause");
    
    private TextField tfRed = new TextField();
    private TextField tfGreen = new TextField();
    private TextField tfBlue = new TextField();

    @Override
    public void start(Stage stage) {
        // kreiram GridPane
        GridPane pane1 = new GridPane();
        GridPane.setMargin(tfStranicaKvadrata, new Insets(5, 5, 5, 5));
        GridPane.setMargin(tfBrzinaAnimacije, new Insets(5, 5, 5, 5));
        GridPane.setMargin(cbo1, new Insets(5, 5, 5, 5));
        GridPane.setMargin(btnStart, new Insets(5, 5, 5, 5));
        pane1.setPadding(new Insets(5, 5, 5, 5));
        pane1.add(tfStranicaKvadrata, 0, 0);
        pane1.add(tfBrzinaAnimacije, 1, 0);
        pane1.add(cbo1, 2, 0);
        pane1.add(btnStart, 0, 1);
        
        kvadrat = new Rectangle(100, 100);
        kvadrat.setFill(Color.AQUA);
        RotateTransition rotacija = new RotateTransition(Duration.millis(10000), kvadrat);
        rotacija.setAutoReverse(false);
        rotacija.setCycleCount(Timeline.INDEFINITE);
        // kreiram novi GridPane
        GridPane pane3 = new GridPane(); 
        Label pomocna1 = new Label(" ");
        pomocna1.setMaxWidth(200);
        pomocna1.setPadding(new Insets(5, 100, 5, 5));
        Label pomocna1a = new Label(" ");
        pomocna1a.setMaxWidth(200);
        pomocna1a.setPadding(new Insets(5, 140, 5, 5));
        pane3.add(pomocna1, 0, 0);
        pane3.add(new Label("Red: "), 1, 0);
        pane3.add(tfRed, 2, 0);
        pane3.add(pomocna1a, 3, 0);
        tfRed.setMaxWidth(50);
        Label pomocna2 = new Label(" ");
        pomocna2.setMaxWidth(200);
        pomocna2.setPadding(new Insets(5, 100, 5, 5));
        pane3.add(pomocna2, 0, 1);
        pane3.add(new Label("Green: "), 1, 1);
        pane3.add(tfGreen, 2, 1);
        tfGreen.setMaxWidth(50);
        Label pomocna3 = new Label(" ");
        pomocna3.setMaxWidth(200);
        pomocna3.setPadding(new Insets(5, 100, 5, 5));
        pane3.add(pomocna3, 0, 2);
        pane3.add(new Label("Blue: "), 1, 2);
        pane3.add(tfBlue, 2, 2);
        tfBlue.setMaxWidth(50);
        pane3.setAlignment(Pos.BOTTOM_CENTER);
        
        //setujem klik na dugme
        btnStart.setOnAction(e -> {vrti();});
        //redjam pane1, pane3 i kvadrat na glavni pane
        pane.setTop(pane1);
        pane.setCenter(kvadrat);
        pane.setBottom(pane3);
        // kreiram scenu
        Scene scena = new Scene(pane, 450, 450);
        stage.setTitle("Projekat");
        stage.setResizable(false);
        stage.setScene(scena);
        stage.show();
    }
    
    public void vrti() {
        if (!isStrated) {
            String izbor = cbo1.getSelectionModel().getSelectedItem();
            int stranicaKvadrata = Integer.parseInt(tfStranicaKvadrata.getText());
            kvadrat.setHeight(stranicaKvadrata);
            kvadrat.setWidth(stranicaKvadrata);
            int crvena = Integer.parseInt(tfRed.getText());
            int zelena = Integer.parseInt(tfGreen.getText());
            int plava = Integer.parseInt(tfBlue.getText());
            kvadrat.setFill(Color.rgb(crvena, zelena, plava));
            int speedAnimat = Integer.parseInt(tfBrzinaAnimacije.getText());
            if (izbor == "Rotacija") {
                
                metodRotacije(kvadrat, speedAnimat);
                
            } else if (izbor == "Translacija") {
                metodTranslacije(kvadrat, speedAnimat);
            } else if (izbor == "Skaliranje") {
                metodSkaliranja(kvadrat, speedAnimat);
            }
        } else {
            String izbor = cbo1.getSelectionModel().getSelectedItem();
            if (izbor == "Rotacija") {
                rotatTrans.stop();
            } else if (izbor == "Translacija") {
                transTrans.stop();
            } else if (izbor == "Skaliranje") {
                scaleTrans.stop();
            }
        }
        isStrated = !isStrated;
    }

    public void metodRotacije(Rectangle kvadrat, int brzina){
        rotatTrans = new RotateTransition(
                Duration.millis(konstBrzinaAnimacije/brzina), kvadrat);
        rotatTrans.setCycleCount(Timeline.INDEFINITE);
        rotatTrans.setByAngle(360);
        rotatTrans.play();
    }
    
    public void metodTranslacije(Rectangle kvadrat, int brzina){
        transTrans = new TranslateTransition(
                Duration.millis(konstBrzinaAnimacije/brzina), kvadrat);
        transTrans.setCycleCount(Timeline.INDEFINITE);
        transTrans.setFromX(pane.getLayoutX());
        transTrans.setToX(pane.getWidth());
        transTrans.play();
    }
    
    public void metodSkaliranja(Rectangle kvadrat, int brzina){
        scaleTrans = new ScaleTransition(
                Duration.millis(konstBrzinaAnimacije/brzina), kvadrat);
        scaleTrans.setByX(0.5);
        scaleTrans.setByY(0.5);
        scaleTrans.play();
    }  
    
    public BorderPane getPane(){
        this.pane = pane;
        return pane;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
