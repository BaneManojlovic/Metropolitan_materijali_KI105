/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak3;

/**
 *
 * @author Branislav
 */
public class Zadatak3 {
    
    public static int jednacina(int x){
        int rez=0;
        rez = (3*x-2)/x;
        return rez;
    }
    
    public static void main(String[] args) {
        System.out.println("Rez = " + jednacina(1));
    }
}
