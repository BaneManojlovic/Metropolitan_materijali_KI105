/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak2;

/**
 *
 * @author Branislav
 */
public class Zadatak2 {
    
    public static int jednacina(int x){
        int rez = 0;
        rez = (2*x+2)/x;
        return rez;
    }
    
    public static void main(String[] args) {
        System.out.println("Rez = " + jednacina(1));
    }
}
