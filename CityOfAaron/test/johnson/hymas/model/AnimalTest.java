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
public class AnimalTest {
    
    public AnimalTest() {
    }

    /**
     * Test of toString method, of class Animal.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Animal instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Animal.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Animal expResult = null;
        Animal result = Animal.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Animal.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Animal instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Animal.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Animal instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getString method, of class Animal.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        Animal instance = null;
        String expResult = "";
        String result = instance.getString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setString method, of class Animal.
     */
    @Test
    public void testSetString() {
        System.out.println("setString");
        String string = "";
        Animal instance = null;
        instance.setString(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Animal.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Animal expResult = null;
        Animal result = Animal.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
