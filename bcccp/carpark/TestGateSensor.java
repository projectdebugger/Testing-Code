/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark;
import bcccp.carpark.CarSensor;
/**
 *
 * @author Santosh
 */
public class CarSensorUnittesting {
    public static void main(String[] args){
       System.out.println("Creating an instance of carsensor class...");
       CarSensor cs= new CarSensor("Santosh", 100,100);
       System.out.println("cs an instance of CarSensor class created...");
       System.out.println("Testing the getId method of carSensor class");
       System.out.println(cs.getId());
       System.out.println("Tested successfully..");
       System.out.println("Testing the carIsDetected method in carSensor class...");
       System.out.println(cs.carIsDetected());
    }
}
