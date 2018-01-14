/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak04;

import zadatak04.Faktorijel;
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
public class FaktorijelTest {
    
    public FaktorijelTest() {
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
     * Test of faktorijelBroja method, of class Faktorijel.
     * Proverava da li metoda vraca broj 120 za prosledjeni 
     * broj 5
     */
    @Test
    public void testFaktorijelBroja1() {
        System.out.print("Test 1: ");
        int a = 5;
        int expResult = 120;
        int result = Faktorijel.faktorijelBroja(a);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
     /**
     * Test of faktorijelBroja method, of class Faktorijel.
     * Proverava da li metoda vraca broj 5040 za prosledjeni 
     * broj 7
     */
    @Test
    public void testFaktorijelBroja2() {
        System.out.print("Test 2: ");
        int a = 7;
        int expResult = 5040;
        int result = Faktorijel.faktorijelBroja(a);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
     /**
     * Test of faktorijelBroja method, of class Faktorijel.
     * Proverava da li metoda NE vraca broj -120 za 
     * prosledjeni broj 5
     */
    @Test
    public void testFaktorijelBroja3() {
        System.out.print("Test 3: ");
        int a = 5;
        int expResult = -120;
        int result = Faktorijel.faktorijelBroja(a);
        assertNotEquals(expResult, result);
        if(expResult != result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
   
}
