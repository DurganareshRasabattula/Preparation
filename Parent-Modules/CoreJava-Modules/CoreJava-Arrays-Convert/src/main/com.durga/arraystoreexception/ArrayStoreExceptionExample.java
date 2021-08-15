package arraystoreexception;

/**
 * @author durga on 8/14/2021
 */
public class ArrayStoreExceptionExample {
    public static void main(String[] args) {

        try {
            Object array[] = new String[5];
            array[0] = 2;
        } catch (ArrayStoreException e) {
            // handle the exception
        }

    }
}
