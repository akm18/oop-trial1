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
interface Automobile {
    public boolean startEngine();
    public void stopEngine();
    public float accelerate(float acc);
    public boolean turn(boolean dir);
    
}