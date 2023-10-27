package hw3_22001667_NgoHaiYen.ex2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class SimpleArrayList<T> implements ListInterface<T>{
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }
    public SimpleArrayList(int capacity){
        array = (T[]) new Object[capacity];
    }
    public void enlarge(){
        T[] temp = (T[]) new Object[array.length*2];
        temp = Arrays.copyOf(array, array.length*2);
        array = temp;
    }

    @Override
    public void add(T data) {
        if ( n >= array.length ){
            enlarge();
        }
        array[n] = data;
        n++;
    }

    @Override
    public T get(int i) {
        if ( i < 0 || i > n ){
            return null;
        }
        return array[i];
    }
    public int getIndex(T data){
        for ( int i = 0; i < n; i++ ){
            if ( array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void set(int i, T data) {
        if ( i < 0 || i >= n ){
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        array[i] = data;
    }

    @Override
    public void remove(T data) {
        for ( int i = 0; i < n; i++ ){
            if ( array[i].equals(data)){
                for (int j = i; j < n - 1; j++) {
                    array[i] = array[i + 1];
                }
                this.array[n - 1] = null;
                this.n--;
            }
        }
    }

    @Override
    public boolean isContain(T data) {
        for ( int i = 0; i < n; i++ ){
            if ( array[i].equals(data)){
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
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{
        private int currentId = 0;
        @Override
        public boolean hasNext() {
            return currentId < n;
        }

        @Override
        public T next() {
            if ( hasNext() ){
                return array[currentId++];
            }
            return null;
        }
    }
}
