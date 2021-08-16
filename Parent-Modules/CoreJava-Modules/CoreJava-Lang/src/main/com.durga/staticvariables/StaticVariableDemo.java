package staticvariables;
/**
 * @author durga on 8/12/2021
 */
public class StaticVariableDemo {
    public static int i;
    public static int j = 20;
    public static int z;

    static {
        z = 30;
        a = 40;
    }

    public static int a = 50;

    public static final int b = 100;

    public StaticVariableDemo() {
    }

    static class Nested {
        public static String nestedClassStaticVariable = "test";
    }
}
