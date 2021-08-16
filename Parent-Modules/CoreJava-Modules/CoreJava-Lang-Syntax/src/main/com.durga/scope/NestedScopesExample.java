package scope;

/**
 * @author durga on 8/12/2021
 */
public class NestedScopesExample {
    String title = "Durga Naresh";

    public void printTitle() {
        System.out.println(title);
        String title = "John Doe";
        System.out.println(title);
    }
}
