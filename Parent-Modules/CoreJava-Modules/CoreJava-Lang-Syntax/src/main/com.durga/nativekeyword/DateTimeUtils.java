package nativekeyword;

/**
 * @author durga on 8/12/2021
 */
public class DateTimeUtils {
    public native String getSystemTime();

    static {
        System.loadLibrary("nativeDateTimeUtils");
    }
}
