package nestedclass;

import org.junit.Test;
/**
 * @author durga on 8/12/2021
 */
public class NewOuter {
    int a = 1;
    static int b = 2;

    public class InnerClass {
        int a = 3;
        static final int b = 4;

        public void run() {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("NewOuter.this.a = " + NewOuter.this.a);
            System.out.println("NewOuter.b = " + NewOuter.b);
            System.out.println("NewOuter.this.b = " + NewOuter.b);
        }
    }

    @Test
    public void test() {
        NewOuter outer = new NewOuter();
        InnerClass inner = outer.new InnerClass();
        inner.run();

    }
}
