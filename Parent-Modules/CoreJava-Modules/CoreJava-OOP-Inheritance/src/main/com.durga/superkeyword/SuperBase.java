package superkeyword;

/**
 * @author durga on 8/11/2021
 */
public class SuperBase {
    String message = "super class";

    public SuperBase() {
    }

    public SuperBase(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
