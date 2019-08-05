/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author ANTO
 */
public class SportsCar implements Automobile {

    @Override
    public boolean startEngine() {
        System.out.println("Start or stop engine");
        return false;
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine has stopped");
    }

    @Override
    public float accelerate(float acc) {
        System.out.println("accelerating at 200km/h");
        return 0;
    }

    @Override
    public boolean hoot (boolean loud) {
    System.out.println("Turn left or right");
    return false;
    }
    
}
