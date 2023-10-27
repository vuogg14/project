package hw3_22001622_PhamVanNam.ex3;

public class SimpleLinkedList<T> {
    class Node{
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }
    private Node top = null;
    private Node bot = null;
    private int n = 0;
    public void add(T data) {
        if (n == 0) {
            top = new Node(data);
            bot = top;
        } else {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }
        n++;
    }
    public void addBot(T data) {
        if (n == 0) {
            top = new Node(data);
            bot = top;
        } else {
            Node newNode = new Node(data);
            bot.next = newNode;
            bot = bot.next;
        }
        n++;
    }
    public T get(int i) {
        return getNode(i).data;
    }
    public Node getNode(int i) {
        if (i < 0 || i >= n) return null;
        Node newNode = top;
        for (int j = 0; j < i; j++) {
            newNode = newNode.next;
        }
        return newNode;
    }
    public void set(int i, T data) {
        if (i < 0 || i >= n) return;
        Node newNode = getNode(i);
        newNode.data = data;
    }
    public boolean isContain(T data) {
        Node newNode = top;
        while (newNode != null) {
            if (newNode.data.equals(data)) return true;
            newNode = newNode.next;
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
        if (n == 0) return null;
        T data = top.data;
        top =  top.next;
        n--;
        return data;
    }
    public T removeBot() {
        if (n == 0) return null;
        if (n == 1) {
            T data = top.data;
            top = null;
            return data;
        }
        Node newNode = getNode(n - 1);
        bot = newNode;
        T data = newNode.next.data;
        bot.next = null;
        n--;
        return data;
    }
    public void remove(T data) {
        if (n == 0) return;
        Node newNode = top;
        Node prev = null;
        while (newNode != null) {
            if (newNode.data.equals(data)) {
                if (prev == null) {
                    top = newNode.next;
                } else {
                    prev.next = newNode.next;
                }
                if (newNode.next == null) {
                    bot = prev;
                }
                n--;
                break;
            }
            prev = newNode;
            newNode = newNode.next;
        }
    }
    public int indexOf(T wordCount) {
        Node newNode = top;
        for (int i = 0; i < n; i++) {
            if (newNode.data.equals(wordCount)) return i;
            newNode = newNode.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node node = top;
        while (node != null) {
            s.append(node.data);
            node = node.next;
        }
        return s.toString();
    }
}
