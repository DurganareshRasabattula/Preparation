package diamondoperator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
/**
 * @author durga on 8/12/2021
 */
public class DiamondOperatorUnitTest {
    @Test
    public void whenCreateCarUsingDiamondOperator_thenSuccess() {
        Car<Diesel> myCar = new Car<>();
        assertNotNull(myCar);
    }
}
