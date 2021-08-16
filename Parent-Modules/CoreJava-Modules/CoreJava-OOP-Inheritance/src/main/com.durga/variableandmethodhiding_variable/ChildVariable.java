package variableandmethodhiding_variable;

/**
 * @author durga on 8/11/2021
 */
public class ChildVariable extends ParentVariable{
    String instanceVariable = "child variable";

    public void printInstanceVariable() {
        System.out.println(instanceVariable);
    }
}
