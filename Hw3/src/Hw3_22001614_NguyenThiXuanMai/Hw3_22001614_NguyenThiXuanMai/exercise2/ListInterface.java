package Hw3_22001614_NguyenThiXuanMai.exercise2;

public interface ListInterface<T> extends Iterable<T> {
    void add(T data);
    T get(int i);
    void set(int i, T data);
    void remove(T data);
    boolean isContain(T data);
    int size();
    boolean isEmpty();
}
