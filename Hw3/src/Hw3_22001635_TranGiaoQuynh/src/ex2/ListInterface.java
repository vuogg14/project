package ex2;

public interface ListInterface<T> extends Iterable<T> {
    public void add(T data);

    public T get(int i) throws Exception;

    public void set(int i, T data) throws Exception;

    public void remove(T data);

    public boolean isContain(T data);

    public int size();

    public boolean isEmpty();
}
