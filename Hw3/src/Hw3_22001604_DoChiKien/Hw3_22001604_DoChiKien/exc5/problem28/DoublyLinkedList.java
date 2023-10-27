package Hw3_22001604_DoChiKien.exc5.problem28;

public class DoublyLinkedList {
    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int n = 0;

    public void add(int val) {
        if (n == 0) {
            head = new Node(val);
            tail = head;
        } else {
            Node node = new Node(val);
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        n++;
    }

    public int size() {
        return n;
    }

    public void insert(int k, int x) throws Exception {
        if (k == 0) {
            Node node = new Node(x);
            head.prev = node;
            node.next = head;
            head = node;
        } else if (k == n) {
            Node node = new Node(x);
            tail.next = node;
            node.prev = tail;
            tail = node;
        } else {
            Node pre = getNodeByIndex(k - 1);
            Node next = pre.next;
            Node node = new Node(x);
            pre.next = node;
            node.prev = pre;
            node.next = next;
            next.prev = node;
        }
        n++;
    }

    public Node getNodeByIndex(int i) throws Exception {
        checkValidIndex(i);
        Node ans = head;
        for (int idx = 0; idx < i; idx++) {
            ans = ans.next;
        }
        return ans;
    }

    public void checkValidIndex(int idx) throws Exception {
        if (idx < 0 || idx >= n) {
            throw new Exception("Index out of bound!");
        }
    }

    @Override
    public String toString() {
        StringBuilder myStr = new StringBuilder();
        Node node = head;
        while (node != null) {
            myStr.append(node.val).append(" ");
            node = node.next;
        }
        return myStr.toString();
    }

}
