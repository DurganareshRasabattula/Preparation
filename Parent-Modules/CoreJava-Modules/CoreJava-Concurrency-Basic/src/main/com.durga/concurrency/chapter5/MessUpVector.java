package concurrency.chapter5;

import concurrency.annotation.NotThreadSafe;

import java.util.Vector;



/**
 * 5-1 Vector上可能导致混乱结果的复合操作
 */
@NotThreadSafe
public class MessUpVector {

    public static Object getLast(Vector<Object> list) {
	int lastIndex = list.size() - 1;
	return list.get(lastIndex);
    }

    public static void deleteLast(Vector<Object> list) {
	int lastIndex = list.size() - 1;
	list.remove(lastIndex);
    }
}
