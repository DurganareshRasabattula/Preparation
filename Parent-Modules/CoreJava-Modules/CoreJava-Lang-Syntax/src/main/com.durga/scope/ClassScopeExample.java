package scope;

/**
 * @author durga on 8/12/2021
 */
public class ClassScopeExample {
    Integer amount = 0;

    public void exampleMethod() {
        amount++;
    }

    public void anotherExampleMethod() {
        Integer anotherAmount = amount + 4;
    }
}
