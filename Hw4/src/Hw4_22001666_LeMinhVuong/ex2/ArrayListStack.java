package Hw4_22001666_LeMinhVuong.ex2;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayListStack<E> implements StackInterface<E> {
    private E[] data;
    private int size;

    public ArrayListStack() {
        data = (E[]) new Object[100];
    }

    @Override
    public void push(E element) {
        if (size >= data.length - 1){
            enlarge();
        }
            data[size] = element;
        size++;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        int tmp = size - 1;
        size--;
        return data[tmp];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return data[size - 1];
    }

    private void enlarge() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    @Override
    public Iterator iterator() {
        return new ArrayListStackIterator();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < size; i++){
            stringBuilder.append("[" + data[i] + "]");
        }
        return stringBuilder.toString();
    }

    class ArrayListStackIterator implements Iterator<E> {
        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public E next() {
            return data[position++];
        }
    }
}
