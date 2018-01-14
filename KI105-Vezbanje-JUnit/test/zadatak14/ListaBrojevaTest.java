/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak14;

import java.util.ArrayList;
import java.util.List;
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
public class ListaBrojevaTest {
    
    public ListaBrojevaTest() {
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
     * Test of brojUListi method, of class ListaBrojeva.
     * Provera da li broj postoji u listi sa 3 elementa
     */
    @Test
    public void testBrojUListi1() {
        System.out.print("Test 1: ");
        List lista = new ArrayList();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        int broj = 2;
        boolean expResult = true;
        boolean result = ListaBrojeva.brojUListi(lista, broj);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of brojUListi method, of class ListaBrojeva.
     * Provera da li broj postoj u listi sa 1 elementom
     */
    @Test
    public void testBrojUListi2() {
        System.out.print("Test 2: ");
        List lista = new ArrayList();
        lista.add(18);
        int broj = 18;
        boolean expResult = true;
        boolean result = ListaBrojeva.brojUListi(lista, broj);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }
    /**
     * Test of brojUListi method, of class ListaBrojeva.
     * Provera da li broj postoj u praznoj listi bez elemenata
     */
    @Test
    public void testBrojUListi3() {
        System.out.print("Test 3: ");
        // ovu listu ostavim praznu, tj. samo je kreiram ali ne ubacim ni jedan
        // element u nju.
        List lista = new ArrayList();  
        int broj = 18;
        boolean expResult = false;
        boolean result = ListaBrojeva.brojUListi(lista, broj);
        assertEquals(expResult, result);
        if(expResult == result){
            System.out.println(" Passed!");
        }else{
            System.out.println(" Failed!");
        }
    }

   
}
