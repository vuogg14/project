package Hw3_22001614_NguyenThiXuanMai.exercise6;

class MyLinkedList {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private int size = 0;

    public MyLinkedList() {

    }

    public int get(int index) {
        if (index >= size || index < 0) return -1;
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur == null ? 0 : cur.val;
    }

    public void addAtHead(int val) {
        Node tmp = new Node(val);
        tmp.next = head;
        head = tmp;
        size++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(val);
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (head == null) {
            head = new Node(val);
            size++;
        } else if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node cur = head;
            Node prev = null;
            Node tmp = new Node(val);
            for (int i = 0; i < index; i++) {
                prev = cur;
                cur = cur.next;
            }
            prev.next = tmp;
            tmp.next = cur;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node cur = head;
        Node prev = null;
        for (int i = 0; i < index; i++) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = cur.next;
        size--;
    }

    public void print() {
        Node cur = head;
        while (cur.next != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
        System.out.println(cur.val);
    }
}