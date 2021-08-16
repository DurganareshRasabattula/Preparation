package interfaces;

/**
 * @author durga on 8/11/2021
 */
public class Computer implements Electronic{
    @Override
    public int getElectricityUse() {
        return 1000;
    }
}
