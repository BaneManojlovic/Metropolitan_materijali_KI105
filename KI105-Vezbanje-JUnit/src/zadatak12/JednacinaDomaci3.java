/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak12;

import java.util.Scanner;

/**
 *
 * @author Branislav
 */
public class JednacinaDomaci3 {
    
    static Scanner sc = new Scanner(System.in);
    ///metoda koja resava zadatu jednacinu x=(3x-2)/x
    public static double jednacina(double x){
        double rez=0;
        if(x==0) {
            throw new NullPointerException("X ne moze imati vrednost 0!!!");
        }else{
            rez = (3*x-2)/x ;
        }
        return rez;
    }
    
    public static void main(String[] args) {
        double ulaz;
        System.out.println("Unesite broj x: ");
        ulaz = sc.nextDouble();
        System.out.println("Rezultat je: " + jednacina(ulaz));
        
    }
}
