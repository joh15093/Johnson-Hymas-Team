/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lando
 */
public class MapTest {
    
    public MapTest() {
    }

    /**
     * Test of getLocations method, of class Map.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        Map instance = new Map();
        Location[][] expResult = null;
        Location[][] result = instance.getLocations();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrectLocation method, of class Map.
     */
    @Test
    public void testGetCurrectLocation() {
        System.out.println("getCurrectLocation");
        Map instance = new Map();
        Point expResult = null;
        Point result = instance.getCurrectLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrectLocation method, of class Map.
     */
    @Test
    public void testSetCurrectLocation() {
        System.out.println("setCurrectLocation");
        Point currectLocation = null;
        Map instance = new Map();
        instance.setCurrectLocation(currectLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Map.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Map instance = new Map();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Map.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Map instance = new Map();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Map.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Map instance = new Map();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
