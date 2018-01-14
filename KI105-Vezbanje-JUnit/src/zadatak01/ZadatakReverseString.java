/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak01;

/**
 *
 * @author Branislav
 */
public class ZadatakReverseString {
    // metoda koja ispisuje rec naopako
    public static String ispisNaopacke(String ulaz){
        String rec=" ";
        rec = ulaz;
        String reverse = new StringBuffer(rec).reverse().toString();
        return reverse;
    }
    
    public static void main(String[] args) {
        String ulaznaRec = "nesto";
        System.out.println(ispisNaopacke(ulaznaRec));
    }
    
}
