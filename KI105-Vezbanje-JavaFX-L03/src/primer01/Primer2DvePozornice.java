/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Branislav
 */
public class Primer2DvePozornice extends Application {
//ovde je prikazano kako se mogu napraviti i otvoriti dve posebne pozornice
    @Override          //ovo je prva pozornica koja mora postojati uvek
    public void start(Stage primariyStage) {
        
        //kreiranje scene
        Scene scena = new Scene(new Button("Ok"), 200, 150);
        primariyStage.setTitle("Prva scena");
        primariyStage.setScene(scena);
        primariyStage.show();
        
        //kreiranje nove (druge) pozornice
        Stage seckondStage = new Stage();
        
        //postavljanje druge scene (scena2) na drugoj pozornici (seckondStage)
        Scene scena2 = new Scene(new Button("No"), 100, 100);
        seckondStage.setTitle("Druga pozornica");
        seckondStage.setScene(scena2);
        seckondStage.show();
        
    }
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
