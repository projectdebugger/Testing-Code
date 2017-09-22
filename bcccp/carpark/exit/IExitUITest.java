/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpark.exit;

import bcccp.carpark.exit.IExitController;
import bcccp.carpark.exit.IExitUI;
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
public class IExitUITest {
    
    public IExitUITest() {
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
     * Test of registerController method, of class IExitUI.
     */
    @Test
    public void testRegisterController() {
        System.out.println("registerController");
        IExitController controller = null;
        IExitUI instance = new IExitUIImpl();
        instance.registerController(controller);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deregisterController method, of class IExitUI.
     */
    @Test
    public void testDeregisterController() {
        System.out.println("deregisterController");
        IExitUI instance = new IExitUIImpl();
        instance.deregisterController();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class IExitUI.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String message = "";
        IExitUI instance = new IExitUIImpl();
        instance.display(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beep method, of class IExitUI.
     */
    @Test
    public void testBeep() {
        System.out.println("beep");
        IExitUI instance = new IExitUIImpl();
        instance.beep();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of discardTicket method, of class IExitUI.
     */
    @Test
    public void testDiscardTicket() {
        System.out.println("discardTicket");
        IExitUI instance = new IExitUIImpl();
        instance.discardTicket();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IExitUIImpl implements IExitUI {

        public void registerController(IExitController controller) {
        }

        public void deregisterController() {
        }

        public void display(String message) {
        }

        public void beep() {
        }

        public void discardTicket() {
        }
    }
    
}
