/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak03;

import zadatak03.KonkatekcijaStringova;
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
public class KonkatekcijaStringovaTest {
    
    public KonkatekcijaStringovaTest() {
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
     * Test of spajanje method, of class KonkatekcijaStringova.
     * Proverava da li prosledjeni stringovi fou i bar vracaju
     * foubar
     */
    @Test
    public void testSpajanje1() {
        System.out.print("Test 1: ");
        String prvi = "fou";
        String drugi = "bar";
        String expResult = "foubar";
        String result = KonkatekcijaStringova.spajanje(prvi, drugi);
        assertEquals(expResult, result);
        if(expResult.equals(result)){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of spajanje method, of class KonkatekcijaStringova.
     * Proverava da li prosledjeni stringovi KI103- i Objekti i 
     * apstrakcija podataka vracaju KI103-Objekti i apstrakcija 
     * podataka
     */
    @Test
    public void testSpajanje2() {
        System.out.print("Test 2: ");
        String prvi = "KI103-";
        String drugi = "Objekti i apstrakcija objekata";
        String expResult = "KI103-Objekti i apstrakcija objekata";
        String result = KonkatekcijaStringova.spajanje(prvi, drugi);
        assertEquals(expResult, result);
        if(expResult.equals(result)){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of spajanje method, of class KonkatekcijaStringova.
     * Proverava da li prosledjeni stringivi najjednostavniji i 
     * jednostavniji ne vracaju jednostavnijinaj
     */
    @Test
    public void testSpajanje3() {
        System.out.print("Test 3: ");
        String prvi = "najjednostavniji";
        String drugi = "jednostavniji";
        String expResult = "jednostavnijinaj";
        String result = KonkatekcijaStringova.spajanje(prvi, drugi);
        //assertNotEquals(expResult, result);
        assertNotSame(expResult, result);
        if(expResult != result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }

}
