package interfaces;

/**
 * @author durga on 8/11/2021
 */
public interface Electronic {
    // Constant variable
    String LED = "LED";

    // Abstract method
    int getElectricityUse();

    // Static method
    static boolean isEnergyEfficient(String electronicType) {
        return electronicType.equals(LED);
    }

    //Default method
    default void printDescription() {
        System.out.println("Electronic Description");
    }
}
