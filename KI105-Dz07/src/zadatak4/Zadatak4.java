/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Branislav
 */
public class Zadatak4 {

    public static int metoda(String str) {
        int brojac = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'b') {
                brojac++;
            }
        }
        return brojac;
    }

    public static void main(String[] args) {

        System.out.println("Broj slova b je: " + metoda("pera"));
    }

}
