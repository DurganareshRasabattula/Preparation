package oop;

/**
 * @author durga on 8/12/2021
 */
public class Vehicle {
    private final int wheels;
    private final String model;

    public Vehicle(int wheels, String model) {
        this.wheels = wheels;
        this.model = model;
    }

    public void start() {
        // the process of starting the vehicle
    }

    public void stop() {
        // process to stop the vehicle
    }

    public void honk() {
        // produces a default honk
    }
}
