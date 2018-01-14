/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak06;

/**
 *
 * @author Branislav
 */
public class KvadratnaJednacina {

    //metoda za izracunavanje kvadratne jednacine
    public static double[] jednacina(double a, double b, double c) {
        double rez1 = 0, rez2 = 0, D = 0;
        D = b * b - 4 * a * c;
        if (D == 0) {
            System.out.println("D=0");
            rez1 = rez2;
        } else if (D < 0) {
            System.out.print("Rezultat nije realan broj!");
        } else if (D > 0) {
            rez1 = (-b + Math.sqrt(D)) / 2 * a;
            rez2 = (-b - Math.sqrt(D)) / 2 * a;
        }
        return new double[]{rez1, rez2};
    }

    public static void main(String[] args) {
        // double a=1, b=-5, c=6;
        // double a=3, b=5, c=5;
        double a = 1, b = 0, c = -36;
        double[] rezultati = jednacina(a, b, c);
        System.out.println("X1 = " + rezultati[0] + " X2 = " + rezultati[1]);
    }
}
