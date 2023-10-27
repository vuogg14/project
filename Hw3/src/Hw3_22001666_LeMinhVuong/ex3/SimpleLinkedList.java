package Hw3_22001666_LeMinhVuong.ex3;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        Node current = new Node(data);
        current.setNext(top);
        top = current;
        if (isEmpty()) {
            bot = top;
        }
        n++;
    }

    public void addBot(T data) {
        Node current = new Node(data);
        if (isEmpty()) {
            bot = top;
        }
        bot.setNext(current);
        bot = current;
        n++;
    }

    public T get(int i) {
        return getNodeByIndex(i).getData();
    }

    public void set(T data, int i) {
        if (i < 0 || i >= n) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (i == 0) {
            top = new Node(data, top.getNext());
        } else {
            getNodeByIndex(i).setData(data);
        }
    }

    public T removeTop() {
        T data = top.data;
        top = top.getNext();
        n--;
        return data;
    }

    public T removeBot() {
        T data = bot.data;
        bot = getNodeByIndex(n - 2);
        bot.setNext(null);
        n--;
        return data;
    }

    public boolean isContain(T data) {
        Node current = top;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void remove(T data) {
        Node current = top;
        while (current.getNext() != null) {
            if (current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
                n--;
            }
            current = current.getNext();
        }
    }

    public int size() {
        return n;
    }

    private boolean isEmpty() {
        return n == 0;
    }

    private Node getNodeByIndex(int index) {
        Node current;
        if (index < 0 || index > n) {
            throw new ArrayIndexOutOfBoundsException();
        }
        current = top;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.print(getNodeByIndex(i).getData() + " ");
        }
        System.out.println();
    }
}
