package superkeyword;

/**
 * @author durga on 8/11/2021
 */
public class SuperSub extends SuperBase{
    String message = "child class";

    public SuperSub(String message) {
        super(message);
    }

    public SuperSub() {
        super.printMessage();
        printMessage();
    }

    public void getParentMessage() {
        System.out.println(super.message);
    }

    public void printMessage() {
        System.out.println(message);
    }
}
