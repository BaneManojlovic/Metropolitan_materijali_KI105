/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak00;

/**
 *
 * @author Branislav
 */
public class ZadatakKalkuator {
    
   public int evaluate(String izraz){
        int sum = 0;
        for(String summand: izraz.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
}
