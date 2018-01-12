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

/**
 *
 * @author manojlovic
 */
public class RezultatIspitaTest {
    
    public RezultatIspitaTest() {
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
     * Test of brojIspistnihPoena method, of class RezultatIspita.
     */
    @Test
    public void testBrojIspistnihPoena() {
        System.out.print("Test 1, metode: brojIspistnihPoena(), status ");
        int[] ocene = {1, 3, 4, 6, 8, 9};
        int expResult = 30;
        int result = RezultatIspita.brojIspistnihPoena(ocene);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
        
    }

  
}
