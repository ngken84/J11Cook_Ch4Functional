/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbkch4_functional.example01;

/**
 *
 * @author ngke
 */
@FunctionalInterface
public interface SpeedModel {
    // ANY INTERFACE THAT HAS ONLY ONE ABSTRACT METHOD is called a FUNCTIONAL 
    // INTERFACE
    double getSpeedMph(double timeSec, int weightPounds, int horsePower);
    enum DrivingCondition {
        ROAD_CONDITION,
        TIRE_CONDITION
    }
    
    enum RoadCondition {
        WET, DRY
    }
    
    enum TireCondition {
        NEW,
        USED
    }
    
    // The Presence of enums or default/static methods does not stop it from 
    // being functional
    default double convertMilesToKg(double miles) {
        return 1.609344 * miles;
    }
    
}
