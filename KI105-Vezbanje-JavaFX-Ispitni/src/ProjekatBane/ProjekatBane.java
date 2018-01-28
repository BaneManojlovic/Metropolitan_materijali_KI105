/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjekatBane;

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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Branislav
 */
public class ProjekatBane extends Application {
    
    //elementi za gornju plocu
    static TextField stranicaKvadrata = new TextField("Stranica kvadrata");
    static TextField brzinaAnimacije = new TextField("Brzina Animacije");
    static ObservableList<String> animacije = FXCollections.observableArrayList("Rotacija", "Translacija", "Skaliranje");
    final  ComboBox<String> cbo1 = new ComboBox(animacije);
    static Button startDugme = new Button("Start/Pause");
    
    //elementi za srednju plocu
    static Rectangle kvadrat = new Rectangle(100, 100);
     
    //elementi za donju plocu
    static Label red = new Label("Red:");
    static TextField tfRed = new TextField();
    static Label green =new Label("Green:");
    static TextField tfGreen = new TextField();
    static Label blue = new Label("Blue:");
    static TextField tfBlue = new TextField();
    
    // vrste animacija koje ce se upotrebiti
    RotateTransition rotatTrans;
    TranslateTransition transTrans;
    ScaleTransition scaleTrans;
    
    //parametri animacije
    final int konstBrzinaAnimacije = 10000;
    boolean isStarted = false;
    
    //glavna ploca
    private BorderPane root = new BorderPane();

    @Override
    public void start(Stage primaryStage) {
        
        //gornja ploca
        GridPane pane1 = new GridPane();
        pane1.setPadding(new Insets(10, 10, 10, 10));  //pading za okolo celog pane1
        pane1.setHgap(10);  //razmak levo/desno izmedju elemenata
        pane1.setVgap(10);  //razmak gore/dole izmedju elemenata
        pane1.add(stranicaKvadrata, 0, 0);
        pane1.add(brzinaAnimacije, 1, 0);
        pane1.add(cbo1, 2, 0);
        pane1.add(startDugme, 0, 1);
                
        //srednja ploca
        kvadrat.setFill(Color.AQUA);
        RotateTransition rotacija = new RotateTransition(Duration.millis(10000), kvadrat);
        rotacija.setAutoReverse(false);
        rotacija.setCycleCount(Timeline.INDEFINITE);
        
        //donja ploca
        GridPane pane3 = new GridPane();
        pane3.setAlignment(Pos.CENTER);
        pane3.setPadding(new Insets(5, 5, 5, 5));
        pane3.setHgap(10);
        pane3.setVgap(10);
        pane3.add(red, 1, 0);
        pane3.add(tfRed, 2, 0);
        tfRed.setMaxWidth(60);
        pane3.add(green, 1, 1);
        pane3.add(tfGreen, 2, 1);
        tfGreen.setMaxWidth(60);
        pane3.add(blue, 1, 2);
        pane3.add(tfBlue, 2, 2);
        tfBlue.setMaxWidth(60);
        
         //setujem klik na dugme
        startDugme.setOnAction(e -> {vrti();});
               
        
        //dodajem sve ploce na scenu
        root.setTop(pane1);
        root.setCenter(kvadrat);
        root.setBottom(pane3);
        
        Scene scena = new Scene(root, 460, 460);
        primaryStage.setTitle("Animacija");
        primaryStage.setResizable(false);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
    //metoda u kojoj pozivam animacije koje se desavaju
    public void vrti(){
                if (!isStarted) {
            String izbor = cbo1.getSelectionModel().getSelectedItem();
            int velicinaStraniceKvadrata = Integer.parseInt(stranicaKvadrata.getText());
            kvadrat.setHeight(velicinaStraniceKvadrata);
            kvadrat.setWidth(velicinaStraniceKvadrata);
            int crvena = Integer.parseInt(tfRed.getText());
            int zelena = Integer.parseInt(tfGreen.getText());
            int plava = Integer.parseInt(tfBlue.getText());
            kvadrat.setFill(Color.rgb(crvena, zelena, plava));
            int speedAnimat = Integer.parseInt(brzinaAnimacije.getText());
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
        isStarted = !isStarted;
    }
    
    //metoda za rotaciju
    public void metodRotacije(Rectangle kvadrat, int brzina){
        rotatTrans = new RotateTransition(
                Duration.millis(konstBrzinaAnimacije/brzina), kvadrat);
        rotatTrans.setCycleCount(Timeline.INDEFINITE);
        rotatTrans.setByAngle(360);
        rotatTrans.play();
    }
    
    //metoda za translaciju
     public void metodTranslacije(Rectangle kvadrat, int brzina){
        transTrans = new TranslateTransition(
                Duration.millis(konstBrzinaAnimacije/brzina), kvadrat);
        transTrans.setCycleCount(Timeline.INDEFINITE);
        transTrans.setFromX(root.getLayoutX());
        transTrans.setToX(root.getWidth());
        transTrans.play();
    }
    
    //metoda za sklairanje
     public void metodSkaliranja(Rectangle kvadrat, int brzina){
        scaleTrans = new ScaleTransition(
                Duration.millis(konstBrzinaAnimacije/brzina), kvadrat);
        scaleTrans.setByX(0.5);
        scaleTrans.setByY(0.5);
        scaleTrans.play();
    }
     
    //metoda za promenu pane-a
    public BorderPane getPane(){
        this.root = root;
        return root;
    }
    
    

    public static void main(String[] args) {
        Application.launch(args);
    }
}
