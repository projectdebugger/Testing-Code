/*
*This file is created to test ticketinserted function.
*/
package bcccp.testing;

import bcccp.carpark.paystation.IPaystationController;
/* Author: HARKANAV BIR SINGH BADWAL
 +   	 * Unit Testing TICKET INSERTED
 +	 * */
public class Ticketinserted {
    
    public static void main(String[] args){
        IPaystationController ti;
        ti = new IPaystationController() {
            
            @Override
            public void ticketInserted(String barcode) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void ticketPaid() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void ticketTaken() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        ti.ticketInserted("A1");
    }
    
    
}
