
package johnson.hymas.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lando
 */
public class CropsControlTest {
    
    public CropsControlTest() {
    }

    /**
     * Test of calcBushelsHarvested method, of class CropsControl.
     */
    @Test
    public void testCalcBushelsHarvested() {
        System.out.println("calcBushelsHarvested");
        double tithes = 0.0;
        double acresOwned = 0.0;
        double expResult = 300.0;
        double result = CropsControl.calcBushelsHarvested(tithes, acresOwned);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * This is the test for case number 1
     *      Tithes should be 10% (10)
     *      Acres should be 1000
    */
    @Test
    public void testCase1() {
        double result = CropsControl.calcBushelsHarvested(10, 100);
        assertEquals(300.0, result, 0.0);
    }
    @Test
    public void testCase2() {
        double result = CropsControl.calcBushelsHarvested(-1, 500);
        assertEquals(0 , result, 0.0);
    }
    @Test
    public void testCase3() {
        double result = CropsControl.calcBushelsHarvested(110, 100);
        assertEquals(0, result, 0.0);
    }
    @Test
    public void testCase4() {
        double result = CropsControl.calcBushelsHarvested(10, 150);
        assertEquals(450.0, result, 0.0);
    }
    @Test
    public void testCase5() {
        double result = CropsControl.calcBushelsHarvested(10, 100);
        assertEquals(300.0, result, 0.0);
    }
    @Test
    public void testCase6() {
        double result = CropsControl.calcBushelsHarvested(10, 1000);
        assertEquals(500.0, result, 0.0);
    }
}
