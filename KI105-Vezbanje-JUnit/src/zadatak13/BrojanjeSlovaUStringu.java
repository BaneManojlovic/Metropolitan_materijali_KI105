/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak13;

/**
 *
 * @author Branislav
 */
public class BrojanjeSlovaUStringu {
    
    //metoda koja prebrojava broj pojavljivanja slova b u stringu
    public static int prebrojavanje(String ulaz){
        int rez = 0;
        for(int i=0; i<ulaz.length(); i++){
           if(ulaz.charAt(i) == 'b'){
               rez = rez +1;
           }
        }
        return rez;
    }
    
    public static void main(String[] args) {
        String ulaz="automobil";
        
        System.out.println("Rezultat je: " + prebrojavanje(ulaz));
    }
}
