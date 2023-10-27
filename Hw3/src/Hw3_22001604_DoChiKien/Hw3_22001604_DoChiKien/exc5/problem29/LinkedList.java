package Hw3_22001604_DoChiKien.exc5.problem29;

public class LinkedList {
    class Node {
        int val;
        Node next;

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
            tail = node;
        }
        n++;
    }

    public void remove(int k) throws Exception {
        if (k < 0 || k >= n) {
            throw new Exception("Index out of bound!");
        }
        if (k == 0) {
            head = head.next;
        } else if (k == n - 1) {
            Node node = getNodeByIndex(k - 1);
            node.next = null;
            tail = node;
        } else {
            Node node = getNodeByIndex(k - 1);
            node.next = node.next.next;
        }
        n--;
    }


    public Node getNodeByIndex(int i) throws Exception {
        if (i < 0 || i >= n) {
            throw new Exception("Index out of bound!");
        }
        Node ans = head;
        for (int idx = 0; idx < i; idx++) {
            ans = ans.next;
        }
        return ans;
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
