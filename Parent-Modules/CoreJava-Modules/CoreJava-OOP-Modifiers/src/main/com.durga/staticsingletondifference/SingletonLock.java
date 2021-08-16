package staticsingletondifference;

/**
 * @author durga on 8/12/2021
 */
public class SingletonLock extends MyLock{
    private SingletonLock() {
    }

    private static class SingletonHolder {
        public static final SingletonLock instance = new SingletonLock();
    }

    public static SingletonLock getInstance() {
        return SingletonHolder.instance;
    }

    @Override
    public String takeLock(int locks) {
        return "Taken Singleton Lock";
    }
}
