/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak08;

import java.util.Scanner;

/**
 *
 * @author Branislav
 */
public class Kalkulator {
    
    static Scanner sc = new Scanner(System.in);
    
    //metoda za sabiranje dva broja
    public static double sabiranje(int a, int b){
        int rez=0;
        rez = a + b;
        return rez;
    }
    
    //metoda za oduzimanje dva broja
    public static double oduzimanje(int a, int b){
        int rez=0;
        rez = a - b;
        return rez;
    }
    
    //metoda za mnozenje dva broja
    public static double mnozenje(int a, int b){
        int rez=0;
        rez = a * b;
        return rez;
    }
    
    //metoda za deljenje dva broja
    public static double deljenje(int a, int b){
        int rez=0;
        if(a==0 || b==0){
            throw new NullPointerException("Deljenje sa nulom nije moguce!!!");
        }else{
            rez = a / b;
        }
        return rez;
    }
    
    //metoda za pokretanje i ispis menija
    public static void meni(){
        int a, b, opcija;
        System.out.println("Unesite prvi broj: ");
        a = sc.nextInt();
        System.out.println("Unesite drugi broj: ");
        b = sc.nextInt();
        System.out.println("------MENI------");
        System.out.println("1. Sabiranje");
        System.out.println("2. Oduzimanje");
        System.out.println("3. Mnozenje");
        System.out.println("4. Deljenje");
        System.out.println("Izaberite zeljenu operaciju: ");
        opcija = sc.nextInt();
        switch(opcija){
            case 1:
                System.out.println("Zbir iznosi: " +  sabiranje(a, b));
                break;
            case 2:
                System.out.println("Razlika iznosi: " +  oduzimanje(a, b));
                break;
            case 3:
                System.out.println("Proizvod iznosi: " +  mnozenje(a, b));
                break;
            case 4:
                System.out.println("Kolicnik iznosi: " +  deljenje(a, b));
                break;
                default:
                    System.out.println("Izabrali ste napostojecu opciju");
        }
        
    }
    
    //main metoda za pokretanje programa
    public static void main(String[] args) {
        meni();      
    }
}
