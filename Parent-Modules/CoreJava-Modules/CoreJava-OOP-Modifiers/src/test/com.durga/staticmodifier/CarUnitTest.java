package staticmodifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author durga on 8/12/2021
 */
public class CarUnitTest {
    @Test
    public void whenNumberOfCarObjectsInitialized_thenStaticCounterIncreases() {
        new Car("Jaguar", "V8");
        new Car("Bugatti", "W16");
        assertEquals(2, Car.numberOfCars);
    }
}
