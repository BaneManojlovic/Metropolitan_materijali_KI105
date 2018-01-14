/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak12;

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
public class JednacinaDomaci3Test {
    
    public JednacinaDomaci3Test() {
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
     * Test of jednacina method, of class JednacinaDomaci3.
     * Proverava da li za x=0 metoda izbacuje Exception
     */
    @Test(expected = NullPointerException.class)
    public void testJednacina1() {
        System.out.println("Test 1: NullPointerException");
        double x = 0.0;
        double expResult = 0.0;
        double result = JednacinaDomaci3.jednacina(x);
        assertNotEquals(expResult, result, 0.0);
        
    }
    /**
     * Test of jednacina method, of class JednacinaDomaci3.
     * Proverava da li za x=1 metoda NE vraca 2
     */
    @Test
    public void testJednacina2() {
        System.out.print("Test 2: ");
        double x = 1.0;
        double expResult = 4.0;
        double result = JednacinaDomaci3.jednacina(x);
        assertNotEquals(expResult, result, 0.0);
        if(expResult != result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of jednacina method, of class JednacinaDomaci3.
     * Proverava da li za x=2 metoda vraca 2
     */
    @Test
    public void testJednacina3() {
        System.out.print("Test 3: ");
        double x = 2.0;
        double expResult = 2.0;
        double result = JednacinaDomaci3.jednacina(x);
        assertEquals(expResult, result, 0.0);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }

}
