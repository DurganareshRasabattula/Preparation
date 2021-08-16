package compiletimeconstants;

import java.io.PrintWriter;
/**
 * @author durga on 8/12/2021
 */
public class CompileTimeVariables {

    public final String errorMessage = ClassConstants.DEFAULT_USERNAME + " not allowed here.";
    public final int maximumLoginAttempts = 5;

    public static void main(String[] args) {
        PrintWriter printWriter = System.console().writer();
        printWriter.println(ClassConstants.DEFAULT_USERNAME);

        CompileTimeVariables instance = new CompileTimeVariables();
        printWriter.println(instance.maximumLoginAttempts);

        final String username = "baeldung" + "-" + "user";
        printWriter.println(username);
    }

}
