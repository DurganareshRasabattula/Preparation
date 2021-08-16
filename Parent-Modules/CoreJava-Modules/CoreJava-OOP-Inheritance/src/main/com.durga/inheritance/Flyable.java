package inheritance;

/**
 * @author durga on 8/11/2021
 */
public interface Flyable {
    int duration = 10;
    void fly();

    /*
     * Commented
     */
    //default void repair() {
    //    System.out.println("Repairing Flyable object");
    //}
}
