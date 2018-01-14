/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak03;

/**
 *
 * @author Branislav
 */
public class KonkatekcijaStringova {
    
    public static String spajanje(String prvi, String drugi){
        String rez=" ";
        rez = prvi + drugi;
        return rez;
    }
    
    public static void main(String[] args) {
        String prvi="srednja", drugi=" skola";
      //  spajanje(prvi, drugi);
        System.out.println(spajanje(prvi, drugi));
    }
}
