/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbkch4_functional.example01;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
        
        // CONSUMER
        Consumer<String> ourConsumer = new Consumer<String>() {

            @Override
            public void accept(String t) {
                System.out.println("I ACCEPT YOUR " + t);
            }
        };
        
        ourConsumer.accept("ME");
        
        Supplier<String> ourSupplier = new Supplier<String>() {

            @Override
            public String get() {
                return "You have been SUPPLIED!";
            }
        };
        
        System.out.println(ourSupplier.get());
        
        Predicate<String> isKenPredicate = new Predicate<String>() {

            @Override
            public boolean test(String t) {
                return "KEN".equals(t);
            }
        };
        
        System.out.println("is KEN? " + isKenPredicate.test("KEN"));
        
        // Binary, takes two options returns a type of the same type
        
        BinaryOperator<Integer> biOp = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer t, Integer u) {
                if(t > u) {
                    return u;
                }
                return t;
            }
        };
        
        System.out.println("BINARY OPERATOR " + biOp.apply(1, 2));
        
        // There are options for chaining results
        Function<Integer, Double> before = new Function<Integer, Double>() {
            public Double apply(Integer i) {
                return i * 10.0;
            }
        };
          
        Function<Double, Double> after = new Function<Double, Double>() {
            public Double apply(Double d) {
                return d * 10.0;
            }
        };
        
        Function <Integer, Double> process = before.andThen(after);
        
        System.out.println(process.apply(10));
                
        
    }
    
    public class VehicleImpl implements Vehicle {
        private SpeedModel speedModel;
        private int weightPounds, horsePower;

        public VehicleImpl(int weightPounds, int horsePower) {
            this.weightPounds = weightPounds;
            this.horsePower = horsePower;
        }

        @Override
        public void setSpeedModel(SpeedModel speedModel) {
            this.speedModel = speedModel;
        }

        @Override
        public double getSpeedMph(double timeSec) {
            return this.speedModel.getSpeedMph(timeSec, weightPounds, horsePower);
        }
        
    }
    
    public void useVehiclesLamda() {
        VehicleImpl imp = new VehicleImpl(3000, 200);
        SpeedModel model = (t, wp, hp) -> {
            double v = 2.0 * hp * 746 * t * 32.17/ wp;
            return (double) Math.round(Math.sqrt(v) * 0.68);
        };
        imp.setSpeedModel(model);
        
        
    }
}
