package methodoverloadingoverriding_util;

/**
 * @author durga on 8/12/2021
 */
public class Multiplier {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}
