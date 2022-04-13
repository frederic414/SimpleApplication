/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package simpleapplication;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author frederic
 */
public class MesFonctionsTest {
    
    /**
     * Test of minimum method, of class MesFonctions.
     */
    @Test
    public void testMinimum() {
        System.out.println("minimum");
        int a = 10;
        int b = 20;
        MesFonctions instance = new MesFonctions();
        int expResult = 10;
        int result = instance.minimum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of estPalindrome method, of class MesFonctions.
     */
    @Test
    public void testEstPalindrome() {
        System.out.println("estPalindrome");
        String ch = "elle";
        MesFonctions instance = new MesFonctions();
        boolean expResult = true;
        boolean result = instance.estPalindrome(ch);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of maximum method, of class MesFonctions.
     */
    @Test
    public void testMaximum() {
        System.out.println("maximum");
        int a = -5;
        int b = 14;
        MesFonctions instance = new MesFonctions();
        int expResult = 14;
        int result = instance.maximum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of factorielle method, of class MesFonctions.
     */
    @Test
    public void testFactorielle() {
        System.out.println("factorielle");
        int n = 5;
        MesFonctions instance = new MesFonctions();
        int expResult = 120;
        int result = instance.factorielle(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
