package finalkeyword;

import java.io.Console;
/**
 * @author durga on 8/12/2021
 */
public class ClassVariableNonFinal {

    static boolean doX = false;
    static boolean doY = true;

    public static void main(String[] args) {
        Console console = System.console();
        if (doX) {
            console.writer().println("x");
        } else if (doY) {
            console.writer().println("y");
        }
    }

}
