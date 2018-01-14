/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak06;

import zadatak06.KvadratnaJednacina;
import java.util.Arrays;
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
public class KvadratnaJednacinaTest {
    
    public KvadratnaJednacinaTest() {
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
     * Test of jednacina method, of class KvadratnaJednacina.
     * Proverava da li ce za a=1, b=-5, c=6 biti x1=3 i x2=2.
     */
    @Test
    public void testJednacina1() {
        System.out.print("Test 1: ");
        double a = 1.0;
        double b = -5.0;
        double c = 6.0;
        double[] expResult = new double[]{3, 2};
        double[] result = KvadratnaJednacina.jednacina(a, b, c);
        assertArrayEquals(expResult, result, 0);
        //komanda za poredjenje nizova!!! Obrati paznju!!!
        if(Arrays.equals(expResult, result)){
            System.out.println(" Passed!");
            System.out.println("X1 = " + result[0] + " i X2 = " + result[1]);
        }else{
            System.out.println(" Failed!");
        }
    }
     /**
     * Test of jednacina method, of class KvadratnaJednacina.
     * Proverava da li ce za: a=3, b=5, c=5, biti x1=3 i x2=2
     */
    @Test
    public void testJednacina2() {
        System.out.print("Test 2: ");
        double a = 3.0;
        double b = 5.0;
        double c = 5.0;
        double[] expResult = new double[]{3, 2};
        double[] result = KvadratnaJednacina.jednacina(a, b, c);
        //komanda za proveru da nizovi nisu jednaki
        assertNotEquals(expResult, result);
        if(!Arrays.equals(expResult, result)){
            System.out.println(", Test 2: Passed!");
        }else{
            System.out.println(", Test 2: Failed!");
        }
    }
     /**
     * Test of jednacina method, of class KvadratnaJednacina.
     * Proverava da li ce za a=1, b=0, c=-36 biti x1=6 i x2=-6
     */
    @Test
    public void testJednacina3() {
        System.out.print("Test 3: ");
        double a = 1.0;
        double b = 0.0;
        double c = -36.0;
        double[] expResult = new double[]{6, -6};
        double[] result = KvadratnaJednacina.jednacina(a, b, c);
        assertArrayEquals(expResult, result, 0);
         //komanda za poredjenje nizova!!! Obrati paznju!!!
        if(Arrays.equals(expResult, result)){
            System.out.println(" Passed!");
            System.out.println("X1 = " + result[0] + " i X2 = " + result[1]);
        }else{
            System.out.println(" Failed!");
        }
    }

}
