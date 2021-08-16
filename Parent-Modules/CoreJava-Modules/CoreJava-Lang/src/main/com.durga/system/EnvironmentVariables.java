package system;

/**
 * @author durga on 8/12/2021
 */
public class EnvironmentVariables {
    public String getPath() {
        return System.getenv("PATH");
    }
}
