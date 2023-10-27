package Hw3_22001604_DoChiKien.exc2;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
        if (n >= array.length) {
            expand();
        }
        array[n++] = data;
    }

    @Override
    public T get(int i) throws Exception {
        if (i < 0 || i >= n) {
            throw new Exception("Index out of bound!");
        }
        return array[i];
    }

    @Override
    public void set(int i, T data) throws Exception {
        if (i < 0 || i >= n) {
            throw new Exception("Index out of bound!");
        }
        array[i] = data;
    }

    @Override
    public void remove(T data) {
        if (isEmpty()) {
            return;
        }
        for (int idx = 0; idx < n; idx++) {
            if (array[idx].equals(data)) {
                for (int i = idx; i < n - 1; i++) {
                    array[i] = array[i + 1];
                }
                n--;
                return;
            }
        }
    }

    @Override
    public boolean isContain(T data) {
        for (int idx = 0; idx < n; idx++) {
            if (array[idx].equals(data)) {
                return true;
            }
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

    public void expand() {
        T[] temp = (T[]) new Object[n * 2];
        System.arraycopy(array, 0, temp, 0, n);
        array = temp;
    }

    @Override
    public Iterator<T> iterator() {
        return new SimpleArrayListIterator();
    }

    private class SimpleArrayListIterator implements Iterator<T> {
        private int currentIdx = 0;

        @Override
        public boolean hasNext() {
            return currentIdx < n;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return array[currentIdx++];
            }
            throw new NoSuchElementException();
        }
    }
}
