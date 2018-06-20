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
public class ItemTypeTest {

    public ItemTypeTest() {
    }

    /**
     * Test of values method, of class ItemType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        ItemType[] expResult = null;
        ItemType[] result = ItemType.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class ItemType.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        ItemType expResult = null;
        ItemType result = ItemType.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ItemType.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ItemType instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnimal method, of class ItemType.
     */
    @Test
    public void testGetAnimal() {
        System.out.println("getAnimal");
        ItemType expResult = null;
        ItemType result = ItemType.getAnimal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTool method, of class ItemType.
     */
    @Test
    public void testGetTool() {
        System.out.println("getTool");
        ItemType expResult = null;
        ItemType result = ItemType.getTool();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProvisions method, of class ItemType.
     */
    @Test
    public void testGetProvisions() {
        System.out.println("getProvisions");
        ItemType expResult = null;
        ItemType result = ItemType.getProvisions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
