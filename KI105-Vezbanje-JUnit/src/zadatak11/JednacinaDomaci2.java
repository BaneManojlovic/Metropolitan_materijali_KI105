/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak11;

import java.util.Scanner;

/**
 *
 * @author Branislav
 */
public class JednacinaDomaci2 {
    
    static Scanner sc = new Scanner(System.in);
    //metoda koja resava jednacinu x=(2x+2)/x i vraca resenje
    public static double jednacina(double x){
        double rez=0;
        if(x ==0 ){
            throw new NullPointerException("Deljenje sa nulom nije dozvoljeno!");
        }else{
            rez = (2*x+2)/x;
        }
        return rez;
    }
    
    public static void main(String[] args) {
        double ulaz;
        System.out.println("Unesite neki broj x: ");
        ulaz = sc.nextDouble();
        System.out.println("Rezultat je: " + jednacina(ulaz));
        
    }
}
