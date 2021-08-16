package interfaces_multiinheritance;

/**
 * @author durga on 8/11/2021
 */
public interface Transform {
    void transform();

    default void printSpecs(){
        System.out.println("Transform Specification");
    }
}
