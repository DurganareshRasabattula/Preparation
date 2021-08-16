package methodoverloadingoverriding_model;

/**
 * @author durga on 8/12/2021
 */
public class Vehicle {
    public String accelerate(long mph) {
        return "The vehicle accelerates at : " + mph + " MPH.";
    }

    public String stop() {
        return "The vehicle has stopped.";
    }

    public String run() {
        return "The vehicle is running.";
    }
}
