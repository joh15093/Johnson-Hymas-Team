/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kristy
 */
public class LoadGameViewTest {
    
    public LoadGameViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMessage method, of class LoadGameView.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        LoadGameView instance = new LoadGameView();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInputs method, of class LoadGameView.
     */
    @Test
    public void testGetInputs() {
        System.out.println("getInputs");
        LoadGameView instance = new LoadGameView();
        String[] expResult = null;
        String[] result = instance.getInputs();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class LoadGameView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String[] inputs = null;
        LoadGameView instance = new LoadGameView();
        boolean expResult = false;
        boolean result = instance.doAction(inputs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
