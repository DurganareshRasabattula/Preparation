package defaultstaticinterfacemethods_application;

import defaultstaticinterfacemethods_model.Car;
import defaultstaticinterfacemethods_model.Vehicle;

/**
 * @author durga on 8/12/2021
 */
public class Application {
    public static void main(String[] args) {

        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
        System.out.println(Vehicle.getHorsePower(2500, 480));
    }
}
