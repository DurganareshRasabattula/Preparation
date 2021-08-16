package nestedclass;

import org.junit.Test;
/**
 * @author durga on 8/12/2021
 */
public class NewEnclosing {
    private void run() {
        class Local {
            void run() {
                System.out.println("Welcome to Baeldung!");
            }
        }
        Local local = new Local();
        local.run();
    }

    @Test
    public void test() {
        NewEnclosing newEnclosing = new NewEnclosing();
        newEnclosing.run();
    }
}
