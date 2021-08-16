package interfacevsabstractclass;


import org.junit.Test;

/**
 * @author durga on 8/12/2021
 */
public class VehicleUnitTest {
    @Test
    void givenVehicle_whenNeedToDrive_thenStart() {
        Vehicle car = new Car("BMW");

        car.start();
        car.drive();
        car.changeGear();
        car.stop();
    }
}
