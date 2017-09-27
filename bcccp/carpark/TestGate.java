/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark;

/**
 *
 * @author Santosh
 */
public class GateUnitTest {
    public static void main(String[] args){
        
        // creates new instance of Gate Class
        Gate gate = new Gate(100,100);
        System.out.println("New instance of Gate created");
        
        //tests the setter method raise() of the Class. This sets the backgroud clolor to green
        //and the text to "Gate Up"
        System.out.println("raise() method is called");
        gate.raise();
        
        //tests the boolean getter method isRaised() of the Class
        System.out.println("Is the Gate raised????: "+gate.isRaised());
        
        //tests the setter method lower() of the Class. This sets the backgroud clolor to red
        //and the text to "Gate Down"
        System.out.println("lower() method is called");
        gate.lower();
        
        //tests the boolean getter method isRaised() of the Class
        System.out.println("Is the Gate raised????: "+gate.isRaised());
    }
}
