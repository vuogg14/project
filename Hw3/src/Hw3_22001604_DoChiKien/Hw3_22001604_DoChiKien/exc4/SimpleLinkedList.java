package Hw3_22001604_DoChiKien.exc4;

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
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        if (isEmpty()) {
            top = new Node(data);
            bot = top;
        } else
            top = new Node(data, top);
        n++;
    }

    public void addBot(T data) {
        if (isEmpty()) {
            top = new Node(data);
            bot = top;
        } else {
            Node node = new Node(data);
            bot.next = node;
            bot = node;
        }
        n++;
    }

    public T get(int i) throws Exception {
        return getNodeByIndex(i).data;
    }

    public void set(int i, T data) throws Exception {
        getNodeByIndex(i).data = data;
    }

    public boolean isContain(T data) {
        Node temp = top;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int indexOf(T data) {
        Node node = top;
        int idx = 0;
        while (node != null) {
            if (node.data.equals(data)) {
                return idx;
            }
            idx++;
            node = node.next;
        }
        return -1;
    }

    public Node getNodeByIndex(int i) throws Exception {
        if (i < 0 || i >= n) {
            throw new Exception("Index out of bound!");
        }
        Node ans = top;
        for (int idx = 0; idx < i; idx++) {
            ans = ans.next;
        }
        return ans;
    }
}
