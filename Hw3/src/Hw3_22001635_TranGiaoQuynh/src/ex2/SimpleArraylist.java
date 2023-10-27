package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SimpleArraylist<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArraylist() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArraylist(int capacity) {
        this.defaultSize = capacity;
    }

    @Override
    public void add(T data) {
        if (n == array.length) {
            enlarge();
            array[n++] = data;
        } else {
            array[n++] = data;
        }
    }

    @Override
    public T get(int i) throws Exception {
        if (i < 0 && i > n) {
            throw new Exception();
        } else {
            return array[i];
        }
    }

    @Override
    public void set(int i, T data) throws Exception {
        if (i < 0 && i > n) {
            throw new Exception();
        } else {
            array[i] = data;
        }
    }

    @Override
    public void remove(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                for (int j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        n--;
    }

    @Override
    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
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
        for (int i = 0; i < n; i++) {
            if (array[i] != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return n < array.length && array[n] != null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    return array[n++];
                } else {
                    return null;
                }
            }
        };
    }

    private void enlarge() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    @Override
    public String toString() {
        StringBuilder myStr = new StringBuilder();
        myStr.append("{ ");
        for (int i = 0; i < n-1; i++) {
            String add = (String) array[i];
            myStr.append(String.format("%s, ", add));
        }
        String end = (String) array[n-1];
        myStr.append(String.format("%s", end));
        myStr.append(" }");
        return myStr.toString();
    }
}
