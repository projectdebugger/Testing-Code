/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carpark.exit;

import bcccp.carpark.exit.ExitController;

/**
 *
 * @author Santosh
 */
public class ExitControllerTest {
 
    public static void main(String [] args){
        
        ExitController exit=new ExitController();
        
        //13th commit test carEventDetected
        exit.carEventDetected("S1111", true);
        
        //14th commit test carEventDetected and set state as idle
        exit.carEventDetected("S1111", true);
        
        
        
    }
}