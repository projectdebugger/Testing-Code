/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpark.exit;

import bcccp.carpark.exit.IExitController;
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
public class IExitControllerTest {
    
    public IExitControllerTest() {
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
     * Test of ticketInserted method, of class IExitController.
     */
    @Test
    public void testTicketInserted() {
        System.out.println("ticketInserted");
        String ticketStr = "";
        IExitController instance = new IExitControllerImpl();
        instance.ticketInserted(ticketStr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ticketTaken method, of class IExitController.
     */
    @Test
    public void testTicketTaken() {
        System.out.println("ticketTaken is working very fine");
        IExitController instance = new IExitControllerImpl();
        instance.ticketTaken();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IExitControllerImpl implements IExitController {

        public void ticketInserted(String ticketStr) {
        }

        public void ticketTaken() {
        }
    }
    
}
