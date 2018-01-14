/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak02;

import zadatak02.SortMetoda;
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
public class SortMetodaTest {
    
    public SortMetodaTest() {
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
     * Test of pretvaranjeSortiranje method, of class SortMetoda.
     * Test da li prosledjeni string bbccaa vraca kao aabbcc
     */
    @Test
    public void testPretvaranjeSortiranje1() {
        System.out.print("Test 1: ");
        String ulaz = "bbccaa";
        String expResult = "aabbcc";
        String result = SortMetoda.pretvaranjeSortiranje(ulaz);
        assertEquals(expResult, result);
        if(expResult.equals(result)){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of pretvaranjeSortiranje method, of class SortMetoda.
     * Test da li prosledjeni string 54321 vraca kao 12345
     */
    @Test
    public void testPretvaranjeSortiranje2() {
        System.out.print("Test 2: ");
        String ulaz = "54321";
        String expResult = "12345";
        String result = SortMetoda.pretvaranjeSortiranje(ulaz);
        assertEquals(expResult, result);
        if(expResult.equals(result)){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of pretvaranjeSortiranje method, of class SortMetoda.
     * Test da li prosledjeni string bbccaarr ne vraca kao rraabbcc
     */
    @Test
    public void testPretvaranjeSortiranje3() {
        System.out.print("Test 3: ");
        String ulaz = "bbccaarr";
        String expResult = "rraabbcc";
        String result = SortMetoda.pretvaranjeSortiranje(ulaz);
        assertNotEquals(expResult, result);
        if(expResult!=result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
}
