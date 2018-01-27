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
 * @author Branislav
 */
public class Zadatak1Test {
    
    public Zadatak1Test() {
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
     * Test of jednacina1 method, of class Zadatak1.
     */
    @Test
    public void testJednacina1() {
        System.out.print("Testiranje jednacine, slucaj 1: ");
        int n = 2;
        Zadatak1 instance = new Zadatak1();
        int expResult = 5;
        int result = instance.jednacina1(n);
        assertEquals(expResult, result);
        if(result == expResult){
            System.out.println("Test Passed");
        }else{
            fail("Test Failed!");
        }
    }
    
     @Test
    public void testJednacina2() {
        System.out.print("Testiranje jednacine, slucaj 2: ");
        int n = 10;
        Zadatak1 instance = new Zadatak1();
        int expResult = 18;
        int result = instance.jednacina1(n);
        if(result == expResult){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testJednacina3() {
        System.out.print("Testiranje jednacine, slucaj 3: ");
        int n = 4;
        Zadatak1 instance = new Zadatak1();
        int result = instance.jednacina1(n);
        int expResult= result;
        assertEquals(expResult, result);
        if(expResult != 8){
            System.out.println("Test Passed");
        }else{
            fail("Test Failed!");
        }
        
    }
    
}
