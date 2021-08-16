package system;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author durga on 8/12/2021
 */
public class EnvironmentVariablesUnitTest {
    @Test
    public void givenEnvVars_whenReadPath_thenGetValueinResult() {
        EnvironmentVariables environmentVariables = new EnvironmentVariables();

        Assert.assertNotNull(environmentVariables.getPath());
    }
}
