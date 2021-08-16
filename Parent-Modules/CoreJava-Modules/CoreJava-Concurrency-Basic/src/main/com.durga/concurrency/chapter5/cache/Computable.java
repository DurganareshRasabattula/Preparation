package concurrency.chapter5.cache;

public interface Computable<A, V> {

    V compute(A arg) throws InterruptedException;
}
