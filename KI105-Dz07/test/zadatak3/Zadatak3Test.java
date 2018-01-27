/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Branislav
 */
public class Zadatak3Test {
    
    public Zadatak3Test() {
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
     * Test of jednacina method, of class Zadatak3.
     */
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Test(expected = ArithmeticException.class)
    public void testJednacina1() {
        System.out.println("Testiranje jednacine, slucaj 1: ");
        int x = 0;
        int result = Zadatak3.jednacina(x);
    }
    
    @Test
    public void testJednacina2() {
        System.out.print("Testiranje jednacine, slucaj 2: ");
        int x = 1;
        int expResult = 4;
        int result = Zadatak3.jednacina(x);
        if(result == expResult){
            System.out.println("Test Failed!");
        }else{
            System.out.println("Test Passed!");
        }
        
    }
    
    @Test
    public void testJednacina3() {
        System.out.print("Testiranje jednacine, slucaj 3: ");
        int x = 2;
        int expResult = 2;
        int result = Zadatak3.jednacina(x);
        assertEquals(expResult, result);
        if(result == expResult){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failed!");
        }
    }

   
}
