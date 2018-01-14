/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Branislav
 */
public class ListaBrojeva {
    
    static Scanner sc = new Scanner(System.in);
    //metoda koja proverava da li se uneti broj od strane korisnika nalazi u listi
    public static boolean brojUListi(List lista, int broj){
        boolean rez=false;
        for(int i=0; i<lista.size(); i++){
            if(lista.contains(broj)){
                rez=true;
            }
        }
        return rez;
    }
    
    public static void main(String[] args) {
        List ulaz = new ArrayList();
        ulaz.add(1);
        ulaz.add(2);
        ulaz.add(3);
        ulaz.add(4);
        ulaz.add(5);
        ulaz.add(6);
        int broj;
        System.out.println("Unesite broj za proveru: ");
        broj = sc.nextInt();
        
        System.out.println("Rezultat je: " + brojUListi(ulaz, broj));
    }
}
