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
public class ProvisionTest {

    public ProvisionTest() {
    }

    /**
     * Test of getName method, of class Provision.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Provision instance = new Provision();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Provision.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Provision instance = new Provision();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPerishable method, of class Provision.
     */
    @Test
    public void testIsPerishable() {
        System.out.println("isPerishable");
        Provision instance = new Provision();
        boolean expResult = false;
        boolean result = instance.isPerishable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerishable method, of class Provision.
     */
    @Test
    public void testSetPerishable() {
        System.out.println("setPerishable");
        boolean perishable = false;
        Provision instance = new Provision();
        instance.setPerishable(perishable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Provision.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Provision instance = new Provision();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Provision.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Provision instance = new Provision();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Provision.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Provision instance = new Provision();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
