package Hw3_22001604_DoChiKien.exc2;

public interface ListInterface<T> extends Iterable<T> {
    void add(T data);

    T get(int i) throws Exception;

    void set(int i, T data) throws Exception;

    void remove(T data);

    boolean isContain(T data);

    int size();

    boolean isEmpty();
}
