/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak09;

import java.util.Scanner;

/**
 *
 * @author Branislav
 */
public class Jednacina {
    
    static Scanner sc = new Scanner(System.in);
    // metoda koja izracunava zadatu jednacinu x=2n+2 za prosledjeno n
    public static int jednacina(int n){
        int rez = 0;
        rez = 2*n+2;
        return rez;
    }
    
    public static void main(String[] args) {
        int ulaz;
        System.out.println("Unesite n:");
        ulaz = sc.nextInt();
        System.out.println("Rezultat je: " + jednacina(ulaz));
    }
}
