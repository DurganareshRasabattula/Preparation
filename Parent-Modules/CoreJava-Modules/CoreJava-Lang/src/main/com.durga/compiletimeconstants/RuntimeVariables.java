package compiletimeconstants;

import java.io.Console;
/**
 * @author durga on 8/12/2021
 */
public class RuntimeVariables {

    public static void main(String[] args) {
        Console console = System.console();

        final String input = console.readLine();
        console.writer().println(input);

        final double random = Math.random();
        console.writer().println("Number: " + random);
    }

}
