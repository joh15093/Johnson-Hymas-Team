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
public class PointTest {
    
    public PointTest() {
    }

    /**
     * Test of toString method, of class Point.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Point instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getString method, of class Point.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        Point instance = null;
        String expResult = "";
        String result = instance.getString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setString method, of class Point.
     */
    @Test
    public void testSetString() {
        System.out.println("setString");
        String string = "";
        Point instance = null;
        instance.setString(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRow method, of class Point.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Point expResult = null;
        Point result = Point.getRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Point.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Point instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Point.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Point instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumn method, of class Point.
     */
    @Test
    public void testGetColumn() {
        System.out.println("getColumn");
        Point expResult = null;
        Point result = Point.getColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
