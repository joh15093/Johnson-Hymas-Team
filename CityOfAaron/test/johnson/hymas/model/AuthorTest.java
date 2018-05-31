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
public class AuthorTest {
    
    public AuthorTest() {
    }

    /**
     * Test of getName method, of class Author.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Author instance = new Author();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Author.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Author instance = new Author();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Author.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Author instance = new Author();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Author.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Author instance = new Author();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Author.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Author instance = new Author();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Author.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Author instance = new Author();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Author.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Author instance = new Author();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
