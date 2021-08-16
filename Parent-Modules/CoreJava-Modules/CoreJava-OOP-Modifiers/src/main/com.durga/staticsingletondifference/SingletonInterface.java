package staticsingletondifference;

/**
 * @author durga on 8/12/2021
 */
public interface SingletonInterface {
    String describeMe();

    String passOnLocks(MyLock lock);

    void increment();
}
