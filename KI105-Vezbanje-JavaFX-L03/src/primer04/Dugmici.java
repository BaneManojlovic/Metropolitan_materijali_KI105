/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer04;

import javafx.scene.control.Button;

/**
 *
 * @author Branislav
 */
public class Dugmici extends Button {
    
    private String znakNaDugmetu;

    public Dugmici() {
    }
    //konstruktor za velicinu dugmica
    public Dugmici(String znakNaDugmetu) {
        super();
        setText(znakNaDugmetu);
        setMinSize(70, 30);
        setMaxSize(70, 30);
    }
    
    public String getZnakNaDugmetu() {
        return znakNaDugmetu;
    }

    public void setZnakNaDugmetu(String znakNaDugmetu) {
        this.znakNaDugmetu = znakNaDugmetu;
    }
    
    
}
