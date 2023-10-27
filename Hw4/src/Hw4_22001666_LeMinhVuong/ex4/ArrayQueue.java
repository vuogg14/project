package Hw4_22001666_LeMinhVuong.ex4;

import java.util.Iterator;

public class ArrayQueue<E> implements QueueInterface<E> {
    private E[] queue;
    private int n = 0;
    private int top = 0;
    private int count = 0;
    private int size = 0;
    private int default_size = 100;
    public ArrayQueue(int capacity){
        n = capacity;
        queue = (E[]) new Object[capacity];
    }

    public ArrayQueue(){
        n = default_size;
        queue = (E[]) new Object[default_size];
    }
    @Override
    public void enqueue(E element) {
        if(size >= n){
            System.out.println("Queue full");
            return;
        }
        queue[size] = element;
        size++;
    }

    @Override
    public E dequeue() throws Exception {
        if(size >= n || isEmpty()){
            return null;
        }
        E tmp = queue[0];
        for(int i = 0; i < size - 1;i ++){
            queue[i] = queue[i + 1];
        }
        size--;
        return tmp;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < size; i++){
            stringBuilder.append("[" + queue[i] + "]");
        }
        return stringBuilder.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayListStackIterator();
    }

    class ArrayListStackIterator implements Iterator<E> {
        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public E next() {
            return queue[position++];
        }
    }
}
