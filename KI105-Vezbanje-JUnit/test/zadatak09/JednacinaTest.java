/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak09;

import zadatak09.Jednacina;
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
public class JednacinaTest {
    
    public JednacinaTest() {
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
     * Test of jednacina method, of class Jednacina.
     * Proverava da li je za uneto n=2 rezultat metode 6
     */
    @Test
    public void testJednacina1() {
        System.out.print("Test 1: ");
        int n = 2;
        int expResult = 6;
        int result = Jednacina.jednacina(n);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of jednacina method, of class Jednacina.
     * Proverava da li je za uneto n=-1 rezultat metode 0
     */
    @Test
    public void testJednacina2() {
        System.out.print("Test 2: ");
        int n = -1;
        int expResult = 0;
        int result = Jednacina.jednacina(n);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of jednacina method, of class Jednacina.
     * Proverava da li je za uneto n=5 rezultat metode NIJE jednak 10
     */
    @Test
    public void testJednacina3() {
        System.out.print("Test 3: ");
        int n = 5;
        int expResult = 10;
        int result = Jednacina.jednacina(n);
        assertNotEquals(expResult, result);
        if(expResult != result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
}
