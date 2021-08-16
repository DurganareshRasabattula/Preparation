package supertypecompilerexception;

/**
 * @author durga on 8/11/2021
 */
public class MyException extends RuntimeException{
    private final int errorCode = 0;

    public MyException(String message) {
        //uncomment this to see the supertype compiler error:
        //super(message + getErrorCode());
    }

    public int getErrorCode() {
        return errorCode;
    }
}
