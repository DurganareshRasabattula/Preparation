package genericarrays;

import java.lang.reflect.Array;

/**
 * @author durga on 8/14/2021
 */
public class MyStack<E> {
    private E[] elements;
    private int size = 0;

    public MyStack(Class<E> clazz, int capacity) {
        elements = (E[]) Array.newInstance(clazz, capacity);
    }

    public void push(E item) {
        if (size == elements.length) {
            throw new RuntimeException();
        }
        elements[size++] = item;
    }

    public E pop() {
        if (size == 0) {
            throw new RuntimeException();
        }
        return elements[--size];
    }

    public E[] getAllElements() {
        return elements;
    }
}
