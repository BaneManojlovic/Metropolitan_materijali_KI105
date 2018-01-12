/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak2;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author Branislav
 */
public class Zadatak2 {
    
    // metoda koja vrsi proveru
    public static boolean metoda(List a, int m){
        boolean x=false;
        if(a.contains(m)){
            x=true;
        }else{
            x=false;    
        }
        return x;
    }
    
    public static void main(String[] args) {
        int m = 5;
        int myInt = 1;
        List<Integer> lista = new ArrayList<>();
        lista.add(myInt);
        lista.add(5);
        lista.add(4);
        lista.add(43);
        for(int i=0; i<lista.size(); i++)
            System.out.println(lista.get(i));

        System.out.println("Resenje je: " + metoda(lista, m));
    }
}
