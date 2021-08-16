package concurrency.chapter4;

import concurrency.annotation.NotThreadSafe;
import concurrency.annotation.ThreadSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 * 客户端加锁实现“若没有则添加”
 */
public class ListHelper<E> {

    public List<E> list = Collections.synchronizedList(new ArrayList<>());

    /**
     * 线程不安全，因为使用的锁不是同一个
     */
    @NotThreadSafe
    public synchronized boolean putIfAbsent(E e) {
	boolean absent = !list.contains(e);
	if (absent) {
	    list.add(e);
	}
	return absent;
    }

    @ThreadSafe
    public boolean safePutIfAbsent(E e) {
	synchronized (list) {
	    boolean absent = !list.contains(e);
	    if (absent) {
		list.add(e);
	    }
	    return absent;
	}
    }
}
