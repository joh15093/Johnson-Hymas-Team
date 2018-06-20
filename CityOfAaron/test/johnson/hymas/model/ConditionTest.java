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
public class ConditionTest {

    public ConditionTest() {
    }

    /**
     * Test of values method, of class Condition.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Condition[] expResult = null;
        Condition[] result = Condition.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Condition.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Condition expResult = null;
        Condition result = Condition.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Condition.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Condition instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGood method, of class Condition.
     */
    @Test
    public void testGetGood() {
        System.out.println("getGood");
        Condition expResult = null;
        Condition result = Condition.getGood();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFair method, of class Condition.
     */
    @Test
    public void testGetFair() {
        System.out.println("getFair");
        Condition expResult = null;
        Condition result = Condition.getFair();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoor method, of class Condition.
     */
    @Test
    public void testGetPoor() {
        System.out.println("getPoor");
        Condition expResult = null;
        Condition result = Condition.getPoor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
