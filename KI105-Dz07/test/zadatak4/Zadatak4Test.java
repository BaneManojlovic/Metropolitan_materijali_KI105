/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak4;

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
public class Zadatak4Test {
    
    public Zadatak4Test() {
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
     * Test of metoda method, of class Zadatak4.
     */
    @Test
    public void testMetoda1() {
        System.out.print("Testiranje metode metoda(), slucaj 1: ");
        String str = "pera";
        int expResult = 0;
        int result = Zadatak4.metoda(str);
        if(result == expResult){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failed!");
        }
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMetoda2() {
        System.out.print("Testiranje metode metoda(), slucaj 2: ");
        String str = "kompjuter";
        int expResult = 0;
        int result = Zadatak4.metoda(str);
        if(result == expResult){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failed!");
        }
        assertEquals(expResult, result);
    }
    
     @Test
    public void testMetoda3() {
        System.out.print("Testiranje metode metoda(), slucaj 3: ");
        String str = "smer";
        int expResult = 0;
        int result = Zadatak4.metoda(str);
        if(result != 1){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failed!");
        }
        assertEquals(expResult, result);
    }
    
     @Test
    public void testMetoda4() {
        System.out.print("Testiranje metode metoda(), slucaj 4: ");
        String str = "automobil";
        int expResult = 1;
        int result = Zadatak4.metoda(str);
        if(result == expResult){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failed!");
        }
        assertEquals(expResult, result);
    }

  
}
