/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak1;

/**
 *
 * @author Branislav
 */
public class Povrsina {
    
    private double strKvad;
    private double strTro;
    private double duzPrav;
    private double sirPrav;

    public Povrsina() {
    }      
    
    public Povrsina(double strKvad) {
    }

    public Povrsina(double duzPrav, double sirPrav) {
        this.duzPrav = duzPrav;
        this.sirPrav = sirPrav;
    }

    public Povrsina(double strKvad, double strTro, double duzPrav, double sirPrav) {
        this.strKvad = strKvad;
        this.strTro = strTro;
        this.duzPrav = duzPrav;
        this.sirPrav = sirPrav;
    }

    public double getStrKvad() {
        return strKvad;
    }

    public void setStrKvad(double strKvad) {
        this.strKvad = strKvad;
    }

    public double getStrTro() {
        return strTro;
    }

    public void setStrTro(double strTro) {
        this.strTro = strTro;
    }

    public double getDuzPrav() {
        return duzPrav;
    }

    public void setDuzPrav(double duzPrav) {
        this.duzPrav = duzPrav;
    }

    public double getSirPrav() {
        return sirPrav;
    }

    public void setSirPrav(double sirPrav) {
        this.sirPrav = sirPrav;
    }
    
    //metoda za izracunavanje povrsine kvadrata
    public double povrsinaKvadrata(){
        double povrsina = strKvad * strKvad;
        return povrsina;
    }
    
     //metoda za izracunavanje povrsine trougla
    public double povrsinaTrougla(){
        double povrsina = ((strTro * strTro)*Math.sqrt(3))/4.0;
        return povrsina;
    }
    
     //metoda za izracunavanje povrsine pravougaonika
    public double povrsinaPravougaonika(){
        double povrsina = duzPrav * sirPrav;
        return povrsina;
    }
}