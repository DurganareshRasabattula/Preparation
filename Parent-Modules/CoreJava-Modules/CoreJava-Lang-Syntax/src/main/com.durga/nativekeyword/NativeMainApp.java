package nativekeyword;

/**
 * @author durga on 8/12/2021
 */
public class NativeMainApp {
    public static void main(String[] args) {
        DateTimeUtils dateTimeUtils = new DateTimeUtils();
        String input = dateTimeUtils.getSystemTime();
        System.out.println("System time is : " + input);
    }
}
