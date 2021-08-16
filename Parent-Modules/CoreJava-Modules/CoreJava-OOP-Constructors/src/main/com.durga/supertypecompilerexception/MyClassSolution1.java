package supertypecompilerexception;

/**
 * @author durga on 8/11/2021
 */
public class MyClassSolution1 {
    private final int myField1 = 10;
    private final int myField2;

    public MyClassSolution1() {
        myField2 = myField1;
    }

    public MyClassSolution1(int i) {
        myField2 = i;
    }
}
