/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbkch4_functional.example01;

import java.util.function.Function;

/**
 *
 * @author ngke
 */
public class Example01 {
    
    public void run() {
        useExistingFuncInt();
        
        
    }
    
    // Before you create your own, try using one of the existing 43 provided to
    // you!
    public void useExistingFuncInt() {
        
        // The Function functional interface provides an easy function that takes
        // a type and returns a different type
        Function<Integer, Double> tempFunc = new Function<Integer, Double>() {
            public Double apply(Integer i) {
                return i * 10.0;
            }
            
        };
        
        System.out.println(tempFunc.apply(20));
        
        
    }
    
}
