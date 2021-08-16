package system;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author durga on 8/12/2021
 */
public class DateTimeServiceUnitTest {
    @Test
    public void givenClass_whenCalledMethods_thenNotNullInResult() {
        DateTimeService dateTimeService = new DateTimeService();

        Assert.assertNotNull(dateTimeService.nowPlusOneHour());
        Assert.assertNotNull(dateTimeService.nowPrettyPrinted());
    }
}
