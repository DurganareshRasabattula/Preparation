package scope;

/**
 * @author durga on 8/12/2021
 */
public class MethodScopeExample {
    public void methodA() {
        Integer area = 2;
    }

    public void methodB() {
        // compiler error, area cannot be resolved to a variable
        // area = area + 2;
    }
}
