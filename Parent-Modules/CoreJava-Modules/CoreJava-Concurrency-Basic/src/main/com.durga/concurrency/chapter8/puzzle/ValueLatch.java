package concurrency.chapter8.puzzle;

import concurrency.annotation.GuardedBy;
import concurrency.annotation.ThreadSafe;

import java.util.concurrent.CountDownLatch;



/**
 * 8-17 携带结果的闭锁
 */
@ThreadSafe
public class ValueLatch<T> {

    @GuardedBy("this")
    private T value = null;

    private final CountDownLatch done = new CountDownLatch(1);

    public boolean isSet() {
        return done.getCount() == 0;
    }

    public synchronized void setValue(T value) {
        if (!isSet()) {
            this.value = value;
            done.countDown();
        }
    }

    public synchronized T getValue() throws InterruptedException {
        done.await();
        synchronized (this) {
            return value;
        }
    }
}
