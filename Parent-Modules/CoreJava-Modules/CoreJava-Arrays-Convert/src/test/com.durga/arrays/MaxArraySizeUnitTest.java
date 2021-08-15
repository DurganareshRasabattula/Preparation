package arrays;

import org.junit.Assert;
import org.junit.Test;
/**
 * @author durga on 8/14/2021
 */
public class MaxArraySizeUnitTest {
    @Test
    public void whenInitialArrayMoreThanMaxSize_thenThrowArray() {
        boolean initalized = false;
        try {
            int[] arr = new int[Integer.MAX_VALUE - 1];
            initalized = true;
        } catch (Throwable e) {
            Assert.assertTrue(e.getMessage().contains("Requested array size exceeds VM limit"));
        }
        Assert.assertFalse(initalized);
    }

    @Test
    public void whenInitialArrayLessThanMaxSize_thenThrowArray() {
        int[] arr = null;
        try {
            arr = new int[Integer.MAX_VALUE - 2];
        } catch (Throwable e) {
            Assert.assertTrue(e.getMessage().contains("Java heap space"));
        }
    }
}
