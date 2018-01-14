/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak04;

/**
 *
 * @author Branislav
 */
public class Faktorijel {
    //metoda koja izracunava faktorijel broja
    public static int faktorijelBroja(int a){
        int rez=1;
        for(int i=1; i<=a; i++){
            rez = rez * i;
        }
        return rez;
    }
    
    public static void main(String[] args) {
        int a = 7;
        System.out.println(faktorijelBroja(a));
    }
}
