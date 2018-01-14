/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak08;

import zadatak08.Kalkulator;
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
public class KalkulatorTest {
    
    public KalkulatorTest() {
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
     * Test of sabiranje method, of class Kalkulator.
     * Proverava da li metoda pravilno sabira dva broja
     */
    @Test
    public void testSabiranje() {
        System.out.print("Test 1: sabiranje - ");
        int a = 7;
        int b = 9;
        double expResult = 16.0;
        double result = Kalkulator.sabiranje(a, b);
        assertEquals(expResult, result, 0.0);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of oduzimanje method, of class Kalkulator.
     * Proverava da li metoda pravilno oduzima dva broja
     */
    @Test
    public void testOduzimanje() {
        System.out.print("Test 2: oduzimanje - ");
        int a = 8;
        int b = 6;
        double expResult = 2.0;
        double result = Kalkulator.oduzimanje(a, b);
        assertEquals(expResult, result, 0.0);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of mnozenje method, of class Kalkulator.
     * Proverava daa li metoda pravilno mnozi dva broja
     */
    @Test
    public void testMnozenje() {
        System.out.print("Test 3: mnozenje - ");
        int a = 8;
        int b = 5;
        double expResult = 40.0;
        double result = Kalkulator.mnozenje(a, b);
        assertEquals(expResult, result, 0.0);
       if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of deljenje method, of class Kalkulator.
     */
    @Test
    public void testDeljenje() {
        System.out.print("Test 4: deljenje - ");
        int a = 9;
        int b = 3;
        double expResult = 3.0;
        double result = Kalkulator.deljenje(a, b);
        assertEquals(expResult, result, 0.0);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
     /**
     * Test of jednacina method, of class Zadatak3.
     * Proverava da li postoji NullPointerException
     */
    @Test(expected = NullPointerException.class)
    public void testDeljenje1() {
        System.out.println("Test 5: Testiranje Exceptiona, deljenje sa nulom ");
        int a = 9;
        int b = 0;
        double result = Kalkulator.deljenje(a, b);
       
    }
}
