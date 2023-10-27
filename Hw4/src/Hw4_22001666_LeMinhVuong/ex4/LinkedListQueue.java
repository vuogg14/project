package Hw4_22001666_LeMinhVuong.ex4;


import java.util.Iterator;

public class LinkedListQueue<E> implements QueueInterface<E> {
    class Node {
        E element;
        Node next;
    }

    public Node queue = null;

    private int size;

    @Override
    public void enqueue(E e) {
        Node current = new Node();
        current.element = e;
        if (isEmpty()) {
            queue = current;
        } else {
            current.next = queue;
            queue = current;
        }
        size++;
    }

    @Override
    public E dequeue() throws Exception {
        if (isEmpty()) {
            return null;
        }
        Node current = queue;
        while (current.next != null){
            current = current.next;
        }
        size--;
        return current.element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder myString = new StringBuilder();
        Node current = queue;
        for (int i = 0; i < size; i++) {
            myString.append("[" + current.element + "]");
            current = current.next;
        }
        return myString.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
