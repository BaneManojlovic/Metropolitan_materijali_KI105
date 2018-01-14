/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak10;

import java.util.Scanner;

/**
 *
 * @author Branislav
 */
public class JednacinaDomaci1 {
    
    static Scanner sc = new Scanner(System.in);
    //metoda koja izracunava jednacinu x=2n+3-n
    public static int jednacina(int n){
        int res=0;
        res = 2*n+3-n;
        return res;
    }
    
    public static void main(String[] args) {
        int ulaz;
        System.out.println("Unesite broj n: ");
        ulaz = sc.nextInt();
        System.out.println("Resenje je: " + jednacina(ulaz));
    }
}
