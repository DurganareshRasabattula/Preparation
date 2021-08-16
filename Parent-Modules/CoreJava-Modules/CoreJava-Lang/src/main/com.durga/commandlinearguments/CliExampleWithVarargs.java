package commandlinearguments;

/**
 * @author durga on 8/12/2021
 */
public class CliExampleWithVarargs {
    public static void main(String... args) {
        System.out.println("Argument count: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
