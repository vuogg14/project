package Hw4_22001666_LeMinhVuong.ex4;

public interface QueueInterface<E> extends Iterable<E> {
    void enqueue(E element);
    E dequeue() throws Exception;
    boolean isEmpty();
}
