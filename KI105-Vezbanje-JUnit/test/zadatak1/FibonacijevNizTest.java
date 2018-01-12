/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manojlovic
 */
public class FibonacijevNizTest {
    
    public FibonacijevNizTest() {
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
     * Test of clanFibonacijevogNiza method, of class FibonacijevNiz.
     * Proverava da li je sesti element fibonacijevog niza broj 8
     */
    @Test
    public void testClanFibonacijevogNiza1() {
        System.out.print("Test 1: ");
        int n = 6;
        int expResult = 8;
        int result = FibonacijevNiz.clanFibonacijevogNiza(n);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of clanFibonacijevogNiza method, of class FibonacijevNiz.
     * Proverava da li je osmi element fibonacijevog niza broj 21
     */
    @Test
    public void testClanFibonacijevogNiza2() {
        System.out.print("Test 2: ");
        int n = 8;
        int expResult = 21;
        int result = FibonacijevNiz.clanFibonacijevogNiza(n);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of clanFibonacijevogNiza method, of class FibonacijevNiz.
     * Proverava da li je treci elemnt fibonacijevog niza 2.
     */
    @Test
    public void testClanFibonacijevogNiza3() {
        System.out.print("Test 3: ");
        int n = 3;
        int expResult = 2;
        int result = FibonacijevNiz.clanFibonacijevogNiza(n);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
   
    
}
