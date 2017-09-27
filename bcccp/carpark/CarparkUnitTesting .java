/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark;
import bcccp.carpark.Carpark;

/**
 *
 * @author Santosh
 */
public class CarparkUnitTesting {
    public static void main(String[] args){
        System.out.println("Creating an instance of Carpark class...");
        Carpark cp= new Carpark("Santosh",1000,null,null);
        System.out.println("An instance of Carpark class is created...");
        System.out.println("Testing the getName() method of carpark class");
        System.out.println(cp.getName());
        System.out.println("Tested successfully");
        
    }
}

