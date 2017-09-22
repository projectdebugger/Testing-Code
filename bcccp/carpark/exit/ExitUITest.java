/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpark.exit;

import bcccp.carpark.exit.ExitUI;
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
public class ExitUITest {
    
    public ExitUITest() {
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
     * Test of main method, of class ExitUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ExitUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerController method, of class ExitUI.
     */
    @Test
    public void testRegisterController() {
        System.out.println("registerController");
        IExitController controller = null;
        ExitUI instance = null;
        instance.registerController(controller);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deregisterController method, of class ExitUI.
     */
    @Test
    public void testDeregisterController() {
        System.out.println("deregisterController");
        ExitUI instance = null;
        instance.deregisterController();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class ExitUI.
     */
    @Test
    public void testDisplay() {
        System.out.println("Message is displayed in Panel");
        String message = "";
        ExitUI instance = null;
        instance.display(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
