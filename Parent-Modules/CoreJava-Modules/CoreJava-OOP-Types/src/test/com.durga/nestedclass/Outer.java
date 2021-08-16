package nestedclass;
import org.junit.Test;
/**
 * @author durga on 8/12/2021
 */
public class Outer {
    public class Inner {

        public void run() {
            System.out.println("Calling test...");
        }
    }

    @Test
    public void test() {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.run();
    }
}
