package concurrency.chapter4;

import concurrency.annotation.GuardedBy;
import concurrency.annotation.ThreadSafe;

/**
 * 4-3 通过一个私有锁来保护状态
 */
@ThreadSafe
public class PrivateLock {

    private final Object myLock = new Object();

    @GuardedBy("myLock")
    PersonSet.Person person;

    void someMethod() {
	synchronized (myLock) {
	    // do something to person
	}
    }
}
