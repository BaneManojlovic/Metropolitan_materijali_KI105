/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak13;

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
public class BrojanjeSlovaUStringuTest {
    
    public BrojanjeSlovaUStringuTest() {
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
     * Test of prebrojavanje method, of class BrojanjeSlovaUStringu.
     * Proverava da li za string Pera f-ja vraca broj 0.
     */
    @Test
    public void testPrebrojavanje1() {
        System.out.print("Test 1: ");
        String ulaz = "pera";
        int expResult = 0;
        int result = BrojanjeSlovaUStringu.prebrojavanje(ulaz);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of prebrojavanje method, of class BrojanjeSlovaUStringu.
     * Proverava da li za string kompjuter f-ja vraca broj 0.
     */
    @Test
    public void testPrebrojavanje2() {
        System.out.print("Test 2: ");
        String ulaz = "kompjuter";
        int expResult = 0;
        int result = BrojanjeSlovaUStringu.prebrojavanje(ulaz);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of prebrojavanje method, of class BrojanjeSlovaUStringu.
     * Proverava da li za string smer f-ja NE vraca broj 0.
     */
    @Test
    public void testPrebrojavanje3() {
        System.out.print("Test 3: ");
        String ulaz = "smer";
        int expResult = 1;
        int result = BrojanjeSlovaUStringu.prebrojavanje(ulaz);
        assertNotEquals(expResult, result);
        if(expResult != result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of prebrojavanje method, of class BrojanjeSlovaUStringu.
     * Proverava da li za string automobil f-ja vraca broj 1.
     */
    @Test
    public void testPrebrojavanje4() {
        System.out.print("Test 4: ");
        String ulaz = "automobil";
        int expResult = 1;
        int result = BrojanjeSlovaUStringu.prebrojavanje(ulaz);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }

    
}
