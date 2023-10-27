package hw3_22001667_NgoHaiYen.ex13;

public class SimpleLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    private int n = 0;

    public void add(int data) {
        Node temp = new Node(data);
        if (head == null && tail == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        n++;
    }

    public void addBot(int data) {
        Node temp = new Node(data);
        if (head == null && tail == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        n++;
    }

    public int get(int i) {
        if (i < 0 || i >= n) {
            System.out.println("Invalid index");
            return -1;
        }
        Node current = head;
        for (int j = 0; j <= i - 1; j++) {
            current = current.next;
        }
        return current.data;
    }

    public void set(int i, int data) {
        if (i == 0) {
            add(data);
        } else if (i == size()) {
            addBot(data);
        } else if (i < 0 || i > size()) {
            System.out.println("Invalid Index");
            return;
        } else {
            Node temp = head;
            for (int j = 0; j < i - 1; j++) {
                temp = temp.next;
            }
            temp.data = data;
        }
    }

    public boolean isContain(int data) {
        Node current = head;
        while (current.next != null) {
            if (current.data== (data)) {
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

    public int removeTop() {
        if (head == null) {
            return -1;
        } else {
            Node temp = head;
            head = temp.next;
            n--;
            return temp.data;
        }
    }

    public int removeBot() {
        if (head == null) {
            return -1;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            n--;
            return temp.next.data;
        }
    }

    public void remove(int data) {
        Node current = head;
        Node prev = null;
        if (current != null && current.data == (data)) {
            removeTop();
        } else {
            while (current.next != null) {
                if (current.data == (data)) {
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
