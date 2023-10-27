package Hw4_22001666_LeMinhVuong.ex2;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {
    class Node {
        E element;
        Node next;
    }

    private Node stack = null;
    private int size;

    @Override
    public void push(E element) {
        Node current = new Node();
        current.element = element;
        if (isEmpty()) {
            stack = current;
        } else {
            current.next = stack;
            stack = current;
        }
        size++;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        Node current = new Node();
        current.element = stack.element;
        stack = stack.next;
        size--;
        return current.element;

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
        return stack.element;
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    @Override
    public String toString() {
        StringBuilder myString = new StringBuilder();
        Node current = stack;
        for(int i = 0; i < size; i++){
            myString.append("[" + current.element +"]");
            current = current.next;
        }
       return myString.toString();
    }

    class StackIterator implements Iterator<E> {
        private Node currentNode = stack;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E data = currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }
}
