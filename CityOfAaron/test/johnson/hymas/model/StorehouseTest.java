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
public class StorehouseTest {

    public StorehouseTest() {
    }

    /**
     * Test of toString method, of class Storehouse.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Storehouse instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Storehouse.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Storehouse instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Storehouse.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Storehouse instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Storehouse.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Storehouse expResult = null;
        Storehouse result = Storehouse.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getString method, of class Storehouse.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        Storehouse instance = null;
        String expResult = "";
        String result = instance.getString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setString method, of class Storehouse.
     */
    @Test
    public void testSetString() {
        System.out.println("setString");
        String string = "";
        Storehouse instance = null;
        instance.setString(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class Storehouse.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Storehouse.getItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
