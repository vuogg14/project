package Hw3_22001666_LeMinhVuong.ex2;

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
        defaultSize = capacity;
    }

    @Override
    public void add(T data) {

        array[n] = data;
        n++;
    }

    @Override
    public T get(int i) {
        if (i < 0 || i > n) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[i];
    }

    @Override
    public String toString() {
        return "SimpleArrayList{" + "array=" + Arrays.toString(array) + '}';
    }

    @Override
    public void set(int i, T data) {
        if (i < 0 || i > n) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[i] = data;
    }

    @Override
    public void remove(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                for (int j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[n - 1] = null;
                n--;
                i--;
            }
        }
    }

    @Override
    public boolean isContain(T data) {
        for (T i : array) {
            if (i == data) {
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
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private void enlarge() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    private class ArrayListIterator implements Iterator<T> {
        private int currentPosition;

        @Override
        public boolean hasNext() {
            if (currentPosition < array.length && array[currentPosition] != null) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return array[currentPosition++];
            }
            return null;
        }
    }
}
