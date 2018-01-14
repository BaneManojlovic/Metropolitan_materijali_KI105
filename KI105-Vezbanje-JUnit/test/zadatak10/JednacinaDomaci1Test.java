/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak10;

import zadatak10.JednacinaDomaci1;
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
public class JednacinaDomaci1Test {
    
    public JednacinaDomaci1Test() {
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
     * Test of jednacina method, of class JednacinaDomaci1.
     * Proverava da li je za n=2, rezultat jednak 5.
     */
    @Test
    public void testJednacina1() {
        System.out.print("Test 1: jednacina - ");
        int n = 2;
        int expResult = 5;
        int result = JednacinaDomaci1.jednacina(n);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
     /**
     * Test of jednacina method, of class JednacinaDomaci1.
     * Proverava da li za n=10 rezultat nije jednak 18.
     */
    @Test
    public void testJednacina2() {
        System.out.print("Test 2: jednacina - ");
        int n = 10;
        int expResult = 18;
        int result = JednacinaDomaci1.jednacina(n);
        assertNotEquals(expResult, result);
        if(expResult != result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
     /**
     * Test of jednacina method, of class JednacinaDomaci1.
     */
    @Test
    public void testJednacina3() {
        System.out.print("Test 3: jednacina - ");
        int n = 4;
        int expResult = 8;
        int result = JednacinaDomaci1.jednacina(n);
        assertNotEquals(expResult, result);
        if(expResult != result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
}
