/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak3;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Zadatak3 extends Application {
    //kreiram potreben elemente GridPane GUI-a
    private TextField tfUnosKaraktera = new TextField();
    private Button btnKonvertuj = new Button("Konvertuj");
    private TextField tfUTF8sifra = new TextField();
    private Button btnSumiraj = new Button("Sumiraj");
    private Label tfRezultat = new Label(" ");
    
    @Override
    public void start(Stage stage) {
        //kreiram GridPane GUI-interfejs
        GridPane interfejs = new GridPane();
        interfejs.setHgap(5);
        interfejs.setVgap(5);
        interfejs.setAlignment(Pos.CENTER);
        interfejs.setStyle("-fx-background-color: #ADD8E6");
        //redjam elemente na GUI
        interfejs.add(new Label("Unesite zeljeni karakter:"), 0, 0);
        interfejs.add(tfUnosKaraktera, 1, 0);
        interfejs.add(btnKonvertuj, 0, 1);
        interfejs.add(new Label("UTF-8 sifra karaktera: "), 0, 2);
        interfejs.add(tfUTF8sifra, 1, 2);
        interfejs.add(btnSumiraj, 0, 3);
        interfejs.add(new Label("Rezultat: "), 0, 4);
        interfejs.add(tfRezultat, 1, 4);
        
        //setujem posebne osobine elemenata
        tfUnosKaraktera.setAlignment(Pos.BOTTOM_RIGHT);
        GridPane.setHalignment(btnKonvertuj, HPos.CENTER);
        tfUTF8sifra.setAlignment(Pos.BOTTOM_RIGHT);
        GridPane.setHalignment(btnSumiraj, HPos.CENTER);
        GridPane.setHalignment(tfRezultat, HPos.RIGHT);
       
        //vrsim validaciju i zadajem klik evenet na dugme konvertuj
        btnKonvertuj.setOnAction( e -> {
            if(tfUnosKaraktera.getText().isEmpty()){
                validacija();
            }else{
                try {
                    tfUTF8sifra.setText(String.format( konverzija(tfUnosKaraktera)));  
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(Zadatak3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        //vrsim validaciju i zadajem klik event na dugme konvertuj
        btnSumiraj.setOnAction( e -> {
            if(tfUTF8sifra.getText().isEmpty()){
                validacija();
            }else{
                try {
                //    sumiranje(tfUTF8sifra);
                //    System.out.println(sumiranje(tfUTF8sifra));
                    tfRezultat.setText("" + sumiranje(tfUTF8sifra));
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(Zadatak3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        //kreiram scenu
        Scene scena = new Scene(interfejs, 400, 350);
        stage.setTitle("Zadatak 3");
        stage.setScene(scena);
        stage.show();
    }
    
    // validacija
    public void validacija(){
        Alert greska = new Alert(Alert.AlertType.WARNING);
        greska.setHeaderText("Greska!!!");
        greska.setContentText("Potrebno je popuniti polje!");
        greska.showAndWait();
    }
    
    //konverzija
    public String konverzija(TextField ulaz) throws UnsupportedEncodingException{
        String s = ulaz.getText();
        byte[] b = s.getBytes("UTF-8");
        for(int i=0; i<b.length; i++){
            System.out.print(Arrays.toString(b));
        }
        String m =Arrays.toString(b);
        return m;
    }
    
    //sumiranje
    public int sumiranje(TextField m) throws UnsupportedEncodingException{
        String string = m.getText();
        char[] charArray = string.toCharArray();
        int rez=2;
        for(int i=0; i<charArray.length; i++){
            System.out.print(charArray[i]);
            rez += Character.getNumericValue(charArray[i]);  
        }
    //    System.out.println("\nSum = " + rez);
        return rez;
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }  
}