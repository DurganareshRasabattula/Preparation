package nestedclass;

import org.junit.Test;
/**
 * @author durga on 8/12/2021
 */

abstract class SimpleAbstractClass {
    abstract void run();
}

public class AnonymousInnerUnitTest {
    @Test
    public void run() {
        SimpleAbstractClass simpleAbstractClass = new SimpleAbstractClass() {
            void run() {
                System.out.println("Running Anonymous Class...");
            }
        };
        simpleAbstractClass.run();
    }
}
