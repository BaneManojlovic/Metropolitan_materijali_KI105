/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak5 extends Application {
    
    private Label pitanje1 = new Label("1) U situaciji na prikazanoj slici propisno se krece: ");
    private Label pitanje2 = new Label("2) Putnicki automobil u situaciji prikazanoj na slici 2: ");
    private Label pitanje3 = new Label("3) Putnicki automobil ukljucuje se u saobracaj propisno\n "
                                        + "putanjom koja je oznacena na slici: ");
    private Label pitanje4 = new Label("4) Vozac teretnog automobila, zbog gustine saobracaja na\n raskrsnici u"
                                        + " situaciji prikazanoj na slici: ");
    private Button btnPredaj = new Button("Predaj");
    private Label prazna = new Label("");
  
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setBorder(Border.EMPTY);
        final ImageView selectedImage = new ImageView();   
        final ImageView selectedImage2 = new ImageView();
        final ImageView selectedImage3 = new ImageView();
        final ImageView selectedImage4 = new ImageView();
        Image image1 = new Image(Zadatak5.class.getResourceAsStream("slika1.jpg"));
        Image image2 = new Image(Zadatak5.class.getResourceAsStream("slika2.jpg"));
        Image image3 = new Image(Zadatak5.class.getResourceAsStream("slika3.jpg"));
        Image image4 = new Image(Zadatak5.class.getResourceAsStream("slika4.jpg"));
        selectedImage.setImage(image1);
        selectedImage.setFitHeight(100);
        selectedImage.setFitWidth(200);
        selectedImage2.setImage(image2);
        selectedImage2.setFitHeight(100);
        selectedImage2.setFitWidth(200);
        selectedImage3.setImage(image3);
        selectedImage3.setFitHeight(100);
        selectedImage3.setFitWidth(200);
        selectedImage4.setImage(image4);
        selectedImage4.setFitHeight(100);
        selectedImage4.setFitWidth(200);
        
        GridPane pane = new GridPane();
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setStyle("-fx-background-color: AQUAMARINE");
        pane.setAlignment(Pos.CENTER);
        root.getChildren().addAll(selectedImage);
        
        RadioButton rb1 = new RadioButton(" Teretni automobil");
        rb1.setTextFill(Color.BLACK);
        rb1.setContentDisplay(ContentDisplay.LEFT);
        RadioButton rb2 = new RadioButton(" Motocikl");
        rb2.setTextFill(Color.BLACK);
        rb2.setContentDisplay(ContentDisplay.LEFT);
        RadioButton rb3 = new RadioButton(" I jedno i drugo");
        rb3.setTextFill(Color.BLACK);
        rb3.setContentDisplay(ContentDisplay.LEFT);
        //************************************************
        ToggleGroup radioGroup1 = new ToggleGroup();
        rb1.setToggleGroup(radioGroup1);
        rb2.setToggleGroup(radioGroup1);
        rb3.setToggleGroup(radioGroup1);
        RadioButton selectedRadioButton = (RadioButton) radioGroup1.getSelectedToggle();
        //************************************************
         RadioButton rb4 = new RadioButton(" Ima pravo prvenstva");
        rb4.setTextFill(Color.BLACK);
        rb4.setContentDisplay(ContentDisplay.LEFT);
        RadioButton rb5 = new RadioButton(" Obavezan je da propusti samo pesake");
        rb5.setTextFill(Color.BLACK);
        rb5.setContentDisplay(ContentDisplay.LEFT);
        RadioButton rb6 = new RadioButton(" Duzan je da propusti i biciklistu");
        rb6.setTextFill(Color.BLACK);
        rb6.setContentDisplay(ContentDisplay.LEFT);
        //*************************************************
        ToggleGroup radioGroup2 = new ToggleGroup();
        rb4.setToggleGroup(radioGroup2);
        rb5.setToggleGroup(radioGroup2);
        rb6.setToggleGroup(radioGroup2);
        RadioButton selectedRadioButton2 = (RadioButton) radioGroup2.getSelectedToggle();
        //**************************************************
        RadioButton rb7 = new RadioButton(" Brojem 1");
        rb7.setTextFill(Color.BLACK);
        rb7.setContentDisplay(ContentDisplay.LEFT);
        RadioButton rb8 = new RadioButton(" Brojem 2");
        rb8.setTextFill(Color.BLACK);
        rb8.setContentDisplay(ContentDisplay.LEFT);
        RadioButton rb9 = new RadioButton(" Bilo brojem 1 ili 2");
        rb9.setTextFill(Color.BLACK);
        rb9.setContentDisplay(ContentDisplay.LEFT);
        //*************************************************
        ToggleGroup radioGroup3 = new ToggleGroup();
        rb7.setToggleGroup(radioGroup3);
        rb8.setToggleGroup(radioGroup3);
        rb9.setToggleGroup(radioGroup3);
        RadioButton selectedRadioButton3 = (RadioButton) radioGroup3.getSelectedToggle();
        //**************************************************
        RadioButton rb10 = new RadioButton(" Obavezan je da skrene ulevo ili udesno");
        rb10.setTextFill(Color.BLACK);
        rb10.setContentDisplay(ContentDisplay.LEFT);
        RadioButton rb11 = new RadioButton(" Duzan je da se zaustavi ispred raskrsnice");
        rb11.setTextFill(Color.BLACK);
        rb11.setContentDisplay(ContentDisplay.LEFT);
        RadioButton rb12 = new RadioButton(" Moze da udje na raskrsnicu na zeleno svetlo");
        rb12.setTextFill(Color.BLACK);
        rb12.setContentDisplay(ContentDisplay.LEFT);
         //*************************************************
        ToggleGroup radioGroup4 = new ToggleGroup();
        rb10.setToggleGroup(radioGroup4);
        rb11.setToggleGroup(radioGroup4);
        rb12.setToggleGroup(radioGroup4);
        RadioButton selectedRadioButton4 = (RadioButton) radioGroup4.getSelectedToggle();
        //**************************************************
        
        //Postavljam elemente
        pane.add(selectedImage, 0, 0);
        pane.add(pitanje1, 0, 1);
        pane.add(rb1, 0, 2);
        pane.add(rb2, 0, 3);
        pane.add(rb3, 0, 4);
        
        pane.add(selectedImage2, 0, 5);
        pane.add(pitanje2, 0, 6);
        pane.add(rb4, 0, 7);
        pane.add(rb5, 0, 8);
        pane.add(rb6, 0, 9);
       
       
        pane.add(selectedImage3, 1, 0);
        pane.add(pitanje3, 1, 1);
        pane.add(rb7, 1, 2);
        pane.add(rb8, 1, 3);
        pane.add(rb9, 1, 4);
        
        pane.add(selectedImage4, 1, 5);
        pane.add(pitanje4, 1, 6);
        pane.add(rb10, 1, 7);
        pane.add(rb11, 1, 8);
        pane.add(rb12, 1, 9);
       
        pane.add(prazna, 0, 10);
        pane.add(btnPredaj, 0, 11);
        
        // event za klik na dugme
        btnPredaj.setOnAction( e -> {poruka();});
        
        // eventi za radio button-e
        rb1.setOnAction(e -> {});
        rb2.setOnAction(e -> {poruka2();});
        rb3.setOnAction(e -> {});
        
        rb4.setOnAction(e -> {});
        rb5.setOnAction(e -> {});
        rb6.setOnAction(e -> {poruka2();});
        
        rb7.setOnAction(e -> {poruka2();});
        rb8.setOnAction(e -> {});
        rb9.setOnAction(e -> {});
        
        rb10.setOnAction(e -> {});
        rb11.setOnAction(e -> {poruka2();});
        rb12.setOnAction(e -> {});
        
        
        Scene scena = new Scene(pane, 800, 650);
        stage.setTitle("Zadatak 5");
        stage.setScene(scena);
        stage.show();

    }
    
      // validacija
    public void poruka(){
        Alert greska = new Alert(Alert.AlertType.INFORMATION);
        greska.setHeaderText("Cestitamo!!!");
        greska.setContentText("Vasi odgovori su uspesno predati!");
        greska.showAndWait();
        greska.getOnCloseRequest();
        System.exit(0);
    }
    
    public int poruka2(){
        int poen =1 ;
        System.out.println("Tacan odgovor: " + poen);
        return poen;
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
