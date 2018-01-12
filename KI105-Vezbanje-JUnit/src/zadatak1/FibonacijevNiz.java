/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak1;

/**
 *
 * @author manojlovic
 */
public class FibonacijevNiz {
    //metoda za kreiranje Fibonacijevog niza
    public static int clanFibonacijevogNiza(int n){
        int rez=0, n1=1;
        for(int i=0; i<n; i++){
            int x = rez;
            rez = n1;
            n1 = x + n1;
        }
        return rez;
    }
    
    public static void main(String[] args) {
        int element = 3;
      //  clanFibonacijevogNiza(element);
        System.out.println(clanFibonacijevogNiza(element));
    }
}
