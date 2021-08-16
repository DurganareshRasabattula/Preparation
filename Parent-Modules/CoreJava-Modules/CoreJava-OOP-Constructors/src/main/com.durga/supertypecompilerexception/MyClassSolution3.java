package supertypecompilerexception;

/**
 * @author durga on 8/11/2021
 */
public class MyClassSolution3 {
    private static final int SOME_CONSTANT = 10;
    private final int myField2;

    public MyClassSolution3() {
        this(SOME_CONSTANT);
    }

    public MyClassSolution3(int i) {
        myField2 = i;
    }
}
