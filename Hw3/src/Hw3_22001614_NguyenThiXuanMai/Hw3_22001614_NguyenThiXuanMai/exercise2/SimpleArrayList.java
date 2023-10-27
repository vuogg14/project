package Hw3_22001614_NguyenThiXuanMai.exercise2;

import java.util.Arrays;
import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        n = capacity;
    }

    private void enlarge() {
        array = Arrays.copyOf(array, defaultSize * 2);
    }

    @Override
    public void add(T data) {
        if (n >= defaultSize) {
            enlarge();
        }
        array[n++] = data;
    }

    @Override
    public T get(int i) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }
        return array[i];
    }

    @Override
    public void set(int i, T data) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }
        array[i] = data;
    }

    @Override
    public void remove(T data) {
        int pos = n;

        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                array[i] = null;
                pos = i;
                n--;
                break;
            }
        }

        for (int i = pos; i < n; i++) {
            array[i] = array[i + 1];
        }
    }

    @Override
    public boolean isContain(T data) {
        for (T element : array) {
            if (data.equals(element)) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<T> iter = this.iterator();
        while (iter.hasNext()) {
            sb.append(iter.next() + "\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    class ArrayListIterator implements Iterator<T> {
        private int curIdx = 0;

        @Override
        public boolean hasNext() {
            return curIdx < n;
        }

        @Override
        public T next() {
            T data = array[curIdx++];
            return data;
        }
    }
}
