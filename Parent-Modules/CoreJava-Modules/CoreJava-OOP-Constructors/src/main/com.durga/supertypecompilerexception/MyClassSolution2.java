package supertypecompilerexception;

/**
 * @author durga on 8/11/2021
 */
public class MyClassSolution2 {
    private final int myField1 = 10;
    private int myField2;

    public MyClassSolution2() {
        setupMyFields(myField1);
    }

    public MyClassSolution2(int i) {
        setupMyFields(i);
    }

    private void setupMyFields(int i) {
        myField2 = i;
    }
}
