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
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vechile Sedan = new Vechile() {

           @Override
           void accelerate() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           void stop() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           void gas() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       };
       Sedan.accelerate();
       Sedan.stop();
       Sedan.gas();
      
        // TODO code application logic here
    }
    
}
