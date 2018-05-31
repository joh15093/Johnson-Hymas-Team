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
public class InventoryItemTest {
    
    public InventoryItemTest() {
    }

    /**
     * Test of getItemType method, of class InventoryItem.
     */
    @Test
    public void testGetItemType() {
        System.out.println("getItemType");
        InventoryItem instance = new InventoryItem();
        ItemType expResult = null;
        ItemType result = instance.getItemType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemType method, of class InventoryItem.
     */
    @Test
    public void testSetItemType() {
        System.out.println("setItemType");
        ItemType itemType = null;
        InventoryItem instance = new InventoryItem();
        instance.setItemType(itemType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class InventoryItem.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        InventoryItem instance = new InventoryItem();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class InventoryItem.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        InventoryItem instance = new InventoryItem();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCondition method, of class InventoryItem.
     */
    @Test
    public void testGetCondition() {
        System.out.println("getCondition");
        InventoryItem instance = new InventoryItem();
        Condition expResult = null;
        Condition result = instance.getCondition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCondition method, of class InventoryItem.
     */
    @Test
    public void testSetCondition() {
        System.out.println("setCondition");
        Condition condition = null;
        InventoryItem instance = new InventoryItem();
        instance.setCondition(condition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class InventoryItem.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        InventoryItem instance = new InventoryItem();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class InventoryItem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        InventoryItem instance = new InventoryItem();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class InventoryItem.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        InventoryItem instance = new InventoryItem();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
