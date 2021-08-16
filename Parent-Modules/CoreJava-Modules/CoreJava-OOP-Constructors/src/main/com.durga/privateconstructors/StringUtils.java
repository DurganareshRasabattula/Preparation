package privateconstructors;

/**
 * @author durga on 8/11/2021
 */
public class StringUtils {
    private StringUtils() {
        // this class cannot be instantiated
    }

    public static String toUpperCase(String s) {
        return s.toUpperCase();
    }

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
