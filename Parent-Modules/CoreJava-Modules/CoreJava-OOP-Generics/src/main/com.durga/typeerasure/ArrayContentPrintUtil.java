package typeerasure;

/**
 * @author durga on 8/11/2021
 */
public class ArrayContentPrintUtil {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.printf("%s ", element);
        }
    }

    public static <E extends Comparable<E>> void printArray(E[] array) {
        for (E element : array) {
            System.out.printf("%s ", element);
        }
    }
}
