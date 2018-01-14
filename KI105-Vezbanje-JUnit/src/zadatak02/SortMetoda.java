/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak02;

import java.util.Arrays;

/**
 *
 * @author Branislav
 */
public class SortMetoda {

    // metoda koja vrsi pretvaranje i sortiranje
    public static String pretvaranjeSortiranje(String ulaz) {
        char[] rez;
        String rez2 = " ";
        //pretvaram string u niz karaktera
        rez = ulaz.toCharArray();
        for (int i = 0; i < rez.length; i++) {
           // System.out.print(rez[i] + " ");  //<-- ovo sam zakomentarisao da bi mi test lepse izgledao
        }
        //sortiram niz karaktera da se ispisuje unazad
        Arrays.sort(rez);
        //pretvaram sortirani niz karaktera natrag u string
        rez2 = new String(rez);
     //   System.out.println();  //<-- ovo sam zakomentarisao da bi mi test lepse izgledao
        //ako zelim da sortiram string mogu to i ovako da uradim
        // String sortiranRez2 = new StringBuffer(rez2).reverse().toString();
        return rez2;
    }

    public static void main(String[] args) {
        String ulazniString = "54321";
        System.out.println(pretvaranjeSortiranje(ulazniString));
    }
}
