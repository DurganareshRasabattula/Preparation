/**
 * 
 */
package concurrency;

/**
 * @author durga on 8/16/2021
 */
public class SynchronizedCounter {
	private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}