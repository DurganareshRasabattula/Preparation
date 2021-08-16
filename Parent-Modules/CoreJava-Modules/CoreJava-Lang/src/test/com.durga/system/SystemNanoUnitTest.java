package system;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author durga on 8/12/2021
 */
public class SystemNanoUnitTest {
    @Test
    public void givenSystem_whenCalledNanoTime_thenGivesTimeinResult() {
        long startTime = System.nanoTime();
        // do something that takes time
        long endTime = System.nanoTime();

        Assert.assertTrue(endTime - startTime < 10000);
    }
}
