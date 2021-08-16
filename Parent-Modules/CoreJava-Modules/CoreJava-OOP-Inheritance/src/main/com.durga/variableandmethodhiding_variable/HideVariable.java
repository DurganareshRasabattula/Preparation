package variableandmethodhiding_variable;

/**
 * @author durga on 8/11/2021
 */
public class HideVariable {
    private final String message = "this is instance variable";

    HideVariable() {
        String message = "constructor local variable";
        System.out.println(message);
    }

    public void printLocalVariable() {
        String message = "method local variable";
        System.out.println(message);
    }

    public void printInstanceVariable() {
        System.out.println(this.message);
    }
}
