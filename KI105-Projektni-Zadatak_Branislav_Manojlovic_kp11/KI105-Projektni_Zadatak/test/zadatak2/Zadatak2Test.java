/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak2;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Branislav
 */
public class Zadatak2Test {
    
    public Zadatak2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of metoda method, of class Zadatak2.
     */
    @Test
    public void testMetoda1() {
        System.out.print("Test slucaj 1: ");
        List a = new ArrayList<>();
        a.add(11);
        a.add(12);
        a.add(7);
        int m = 7;
        boolean expResult = true;
        boolean result = Zadatak2.metoda(a, m);
        assertEquals(expResult, result);
        if(expResult==result){
            System.out.println("Test passed!");
        }else{
            System.out.println("Test Failed!");
        }
    }
    
      @Test
    public void testMetoda2() {
        System.out.print("Test slucaj 2: ");
        List a = new ArrayList<>();
        a.add(7);
        int m = 7;
        boolean expResult = true;
        boolean result = Zadatak2.metoda(a, m);
        assertEquals(expResult, result);
        if(expResult==result){
            System.out.println("Test passed!");
        }else{
            System.out.println("Test Failed!");
        }
    }

      @Test
    public void testMetoda3() {
        System.out.print("Test slucaj 3: ");
        List a = new ArrayList<>();
        int m = 7;
        boolean expResult = false;
        boolean result = Zadatak2.metoda(a, m);
        assertEquals(expResult, result);
        if(expResult==result){
            System.out.println("Test passed!");
        }else{
            System.out.println("Test Failed!");
        }
    }
 
    
}
