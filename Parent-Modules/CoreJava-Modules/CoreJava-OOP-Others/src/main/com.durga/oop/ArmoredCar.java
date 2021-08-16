package oop;

/**
 * @author durga on 8/12/2021
 */
public class ArmoredCar extends Car{
    private int bulletProofWindows;

    public ArmoredCar(String type, String model, String color) {
        super(type, model, color);
    }

    public void remoteStartCar() {
        // this vehicle can be started by using a remote control
    }
}
