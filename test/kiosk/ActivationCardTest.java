/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosk;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Francisco Romero Batallé
 */
public class ActivationCardTest {
    
    public ActivationCardTest() {
    }
    
    /**
     * Test of isActive method, of class ActivationCard.
     */
    @Test
    public void testIsActive() {
        System.out.println("isActive");
        ActivationCard instance = new ActivationCard("AnyCode");
        boolean expResult = true;
        boolean result = instance.isActive();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCode method, of class ActivationCard.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        ActivationCard instance = new ActivationCard("1234");
        String expResult = "1234";
        String result = instance.getCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of erase method, of class ActivationCard.
     */
    @Test
    public void testErase() {
        System.out.println("erase");
        ActivationCard instance = new ActivationCard("anyCode");
        String expResult = "";
        instance.erase();
        String result = instance.getCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class ActivationCard.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        ActivationCard instance1 = new ActivationCard("anyCode");
        ActivationCard instance2 = new ActivationCard("anyCode");
        boolean expResult = true;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }
    
}
