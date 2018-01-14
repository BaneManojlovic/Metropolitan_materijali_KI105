/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak01;

import zadatak01.ZadatakReverseString;
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
public class ZadatakReverseStringTest {
    
    public ZadatakReverseStringTest() {
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
     * Test of ispisNaopacke method, of class ZadatakReverseString.
     * Metoda koja proverava da li se prosledjena vrednost metodi
     * razlikuje od rezultata.
     */
    @Test
    public void testIspisNaopacke1() {
        System.out.print("Test 1: ");
        String ulaz = "rezultat";
        String expResult = "rezutat";
        String result = ZadatakReverseString.ispisNaopacke(ulaz);
        //assertNotEquals(expResult, result);
        assertNotSame(expResult, result);
        if(expResult!=result){
            System.out.println(" Passed!");
        }else {
            System.out.println(" Failed!");
        }
    }
    /**
    * Metoda koja proverava da li se rec okrenula
    * sa realnom vrednoscu
    */
    
     @Test
    public void testIspisNaopacke2() {
        System.out.print("Test 2: ");
        String ulaz = "programiranje";
        String expResult = "ejnarimargorp";
        String result = ZadatakReverseString.ispisNaopacke(ulaz);
        assertEquals(expResult, result);
        if(expResult.equals(result)){
            System.out.println(" Passed!");
        }else {
            System.out.println(" Failed!");
        }
    }
    /**
    * Metoda koja proverava da li se rec okrenula
    * sa realnom vrednoscu
    */
     @Test
    public void testIspisNaopacke3() {
        System.out.print("Test 3: ");
        String ulaz = "nesto";
        String expResult = "otsen";
        String result = ZadatakReverseString.ispisNaopacke(ulaz);
        assertEquals(expResult, result);
        if(expResult.equals(result)){
            System.out.println(" Passed!");
        }else {
            System.out.println(" Failed!");
        }
    }
  
}
