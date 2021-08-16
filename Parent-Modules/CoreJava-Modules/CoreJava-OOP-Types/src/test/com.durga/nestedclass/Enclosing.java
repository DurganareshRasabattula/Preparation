package nestedclass;

import org.junit.Test;
/**
 * @author durga on 8/12/2021
 */
public class Enclosing {
    private static final int x = 1;

    public static class StaticNested {

        private void run() {
            System.out.println("x = " + x);
        }
    }

    @Test
    public void test() {
        StaticNested nested = new StaticNested();
        nested.run();
    }
}
