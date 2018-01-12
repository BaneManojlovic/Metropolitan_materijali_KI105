/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak3;

import java.util.Arrays;

/**
 *
 * @author manojlovic
 */
public class RezultatIspita {

    static int[] ocene = new int[]{5, 21, 8, 10, 15, 12};

    //metoda koja vraca zbir 5 najboljih rezultata.
    public static int brojIspistnihPoena(int [] ocene) {
        int rez = 0;
        int sum=0;
        //sumiram sve elemente u nizu
        for(int i=0; i<ocene.length; i++){
            sum += ocene[i]; 
        }
        Arrays.sort(ocene);
        //pronalazim najmanji element u nizu
        int min = ocene[0];
        for(int i=0; i<ocene.length; i++){
            if(ocene[i] < min){
                min = ocene[i];
            }
        }
        //oduzimam vrednost najmanjeg elementa od vrednosti 
        //ukupne sume svih elemenata niza
        rez = sum - min; 
    /*    System.out.println(Arrays.toString(ocene));
        System.out.println("Suma je " + sum );
        System.out.println("najmanji je: " + min);
        System.out.println("Rezultat je: " + rez);*/
        return rez;
    }

    public static void main(String[] args) {
        for (int i = 0; i < ocene.length; i++) {
            System.out.print(ocene[i] + ", ");
        }

        System.out.println();
        System.out.println(brojIspistnihPoena(ocene));
    }
}
