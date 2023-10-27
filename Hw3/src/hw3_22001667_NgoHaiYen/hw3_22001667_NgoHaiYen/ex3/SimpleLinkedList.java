package hw3_22001667_NgoHaiYen.ex3;

public class SimpleLinkedList<T> {
    public class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        Node temp = new Node(data);
        if (top == null && bot == null) {
            top = temp;
            bot = temp;
        } else {
            temp.next = top;
            top = temp;
        }
        n++;
    }

    public void addBot(T data) {
        Node temp = new Node(data);
        if (top == null && bot == null) {
            top = temp;
            bot = temp;
        } else {
            bot.next = temp;
            bot = temp;
        }
        n++;
    }

    public T get(int i) {
        if (i < 0 || i >= n) {
            System.out.println("Invalid index");
            return null;
        }
        Node current = top;
        for (int j = 0; j <= i - 1; j++) {
            current = current.next;
        }
        return current.data;
    }

    public void set(int i, T data) {
        if (i == 0) {
            add(data);
        } else if (i == size()) {
            addBot(data);
        } else if (i < 0 || i > size()) {
            System.out.println("Invalid Index");
            return;
        } else {
            Node temp = top;
            for (int j = 0; j < i - 1; j++) {
                temp = temp.next;
            }
            temp.data = data;
        }
    }

    public boolean isContain(T data) {
        Node current = top;
        while (current.next != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public T removeTop() {
        if (top == null) {
            return null;
        } else {
            Node temp = top;
            top = temp.next;
            n--;
            return temp.data;
        }
    }

    public T removeBot() {
        if (top == null) {
            return null;
        } else {
            Node temp = top;
            while (temp.next != bot) {
                temp = temp.next;
            }
            bot = temp;
            n--;
            return temp.next.data;
        }
    }

    public void remove(T data) {
        Node current = top;
        Node prev = null;
        if (current!= null && current.data.equals(data)) {
            removeTop();
        } else {
            while (current.next != null) {
                if (current.data.equals(data)) {
                    prev.next = current.next;
                    current.next = null;
                    n--;
                    break;
                }
                prev = current;
                current = current.next;
            }
        }

    }
}
