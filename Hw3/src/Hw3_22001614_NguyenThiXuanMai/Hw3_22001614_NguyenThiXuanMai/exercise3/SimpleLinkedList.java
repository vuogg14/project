package Hw3_22001614_NguyenThiXuanMai.exercise3;

@SuppressWarnings("unchecked")
public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node top;
    private Node bot;
    private int n = 0;

    public void add(T data) {
        Node tmp = new Node(data);
        tmp.next = top;
        top = tmp;
        n++;
    }

    public void addBot(T data) {
        if (top == null) {
            top = new Node(data);
        } else {
            Node cur = top;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data);;
        }
        n++;
    }

    public T get(int i) {
        if (i < 0 || i >= n) return null;
        Node cur = top;
        for (int j = 0; j < i; j++) {
            cur = cur.next;
        }
        return cur == null ? null : cur.data;
    }

    public void set(int i, T data) {
        if (i < 0 || i >= size()) return;
        Node cur = top;
        for (int j = 0; j < i; i++) {
            cur = cur.next;
        }
        cur.data = data;
    }

    public boolean isContain(T data) {
        for (int i = 0; i < size(); i++) {
            if (get(i).equals(data)) return true;
        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public T removeTop() {
        if (top == null) return null;
        T tmp = top.data;
        top = top.next;
        n--;
        return tmp;
    }

    public T removeBot() {
        if (top == null) return null;
        Node cur = top;
        Node prev = null;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        T tmp = cur.data;
        prev.next = null;
        n--;
        return tmp;
    }

    public void remove(T data) {
        if (top == null) return;
        int size = size();
        while (top.data == data) {
            removeTop();
        }
        Node cur = top.next;
        Node prev = top;
        while (cur.next != null) {
            while (cur.data == data && cur.next != null) {
                prev.next = cur.next;
                cur = cur.next;
                n--;
            }
            if (cur.next != null) {
                prev = cur;
                cur = cur.next;
            }
        }
        if (cur.data == data) {
            removeBot();
        }
        if (n == size) {
            System.out.println("Mảng không đổi.");
        }
    }

    public void print() {
        Node cur = top;
        while (cur.next != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println(cur.data);
    }
}
