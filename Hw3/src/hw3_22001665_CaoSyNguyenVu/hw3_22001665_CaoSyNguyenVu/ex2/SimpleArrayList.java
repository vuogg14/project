package hw3_22001665_CaoSyNguyenVu.ex2;

import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        array = (T[]) new Object[capacity];
    }

    @Override
    public void add(T data) {
        if (n == array.length) {
            enlarge();
        }
        array[n] = data;
        n++;
    }

    @Override
    public T get(int i) {
        //checkBoundaries(i);
        if (i < 0 || i >= n) {
            System.out.println("Out of bounds");
            return null;
        }
        return array[i];
    }

    @Override
    public void set(int i, T data) {
        //checkBoundaries(i);
        if (i < 0 || i >= n) {
            System.out.println("Out of bounds");
            return;
        }
        array[i] = data;
    }

    @Override
    public void remove(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i] == data) {
                for (int j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }
                n--;
                i--;
            }
        }
    }

    @Override
    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i] == data) return true;
        }
        return false;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    private void checkBoundaries(int i) {
        if (i < 0 || i >= n) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void enlarge() {
        T[] copy = (T[]) new Object[n * 2];
        System.arraycopy(array, 0, copy, 0, n);
        array = copy;
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    class Itr implements Iterator<T> {

        int crrPos = 0;

        @Override
        public boolean hasNext() {
            return crrPos < n;
        }

        @Override
        public T next() {
            return array[crrPos++];
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < n; i++){
            if(i==n-1){
                builder.append(array[i]);
                break;
            }
            builder.append(array[i]).append(", ");
        }
        builder.append("]");
        return builder.toString();
    }
}
