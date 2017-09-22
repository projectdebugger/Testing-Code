package carpark.exit;

import bcccp.carpark.exit.ExitController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author android
 */
public class ExitControllerTest {
    
    public ExitControllerTest() {
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
     * Test of carEventDetected method, of class ExitController.
     */
    @Test
    public void testCarEventDetected() {
        System.out.println("carEventDetected");
        String detectorId = "";
        boolean carDetected = false;
        ExitController instance = null;
        instance.carEventDetected(detectorId, carDetected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ticketInserted method, of class ExitController.
     */
    @Test
    public void testTicketInserted() {
        System.out.println("ticketInserted");
        String ticketStr = "";
        ExitController instance = null;
        instance.ticketInserted(ticketStr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
