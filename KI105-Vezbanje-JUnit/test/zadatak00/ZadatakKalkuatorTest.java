/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak00;

import zadatak00.ZadatakKalkuator;
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
public class ZadatakKalkuatorTest {
    
    public ZadatakKalkuatorTest() {
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
     * Test of evaluate method, of class ZadatakKalkuator.
     */
    @Test
    public void testEvaluate() {
        System.out.print("Test 01:");
        String izraz = "1+2+3";
        ZadatakKalkuator instance = new ZadatakKalkuator();
        int expResult = 6;
        int result = instance.evaluate(izraz);
        assertEquals(expResult, result);
        if(expResult==result){
            System.out.println(" Passed!!!");
        }else{
            System.out.println(" Failed!!!");
        }
     
    }
    
}
