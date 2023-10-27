package hw3_22001622_PhamVanNam.ex2;

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
        array[n] = data;
        n++;
    }

    @Override
    public T get(int i) {
        return array[i];
    }

    @Override
    public void set(int i, T data) {
        array[i] = data;
    }

    @Override
    public void remove(T data) {
        int cur = 0;
        int idx = 0;
        while (idx < n) {
            if (array[idx] != data) {
                array[cur++] = array[idx];
            }
            idx++;
        }
        n = cur;
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

    @Override
    public Iterator<T> iterator() {
        return new SimpleArayListIterator();
    }
    private class SimpleArayListIterator implements Iterator<T> {
        private int curIdx = 0;
        @Override
        public boolean hasNext() {
            return curIdx < n;
        }

        @Override
        public T next() {
            T element = array[curIdx];
            curIdx++;
            return element;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(array[i]);
        }
        return stringBuilder.toString();
    }
}
