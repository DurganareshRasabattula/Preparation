package concurrency.chapter4;

import concurrency.annotation.GuardedBy;
import concurrency.annotation.ThreadSafe;

/**
 * 4-1 使用Java监视器模式（内置锁）的线程安全计数器
 */
@ThreadSafe
public class Counter {

    @GuardedBy("this")
    private long value;

    public synchronized long increment() {
	if (value == Long.MAX_VALUE) {
	    throw new IllegalStateException("Counter over flow.");
	}
	return ++value;
    }

    public synchronized long getValue() {
	return value;
    }
}
