package hw3_22001665_CaoSyNguyenVu.ex11;

public class MyLinkedList {
    class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public void add(int data) {
        Node tmp = new Node();
        tmp.data = data;
        if (head == null) {
            head = tmp;
            tail = head;
        } else {
            tail.next = tmp;
            tail = tmp;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) return true;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = null;
        while (slow != null) {
            Node tmp = new Node();
            tmp.data = slow.data;
            tmp.next = fast;
            fast = tmp;
            slow = slow.next;
        }

        slow = head;
        while(fast != null){
            if(fast.data != slow.data) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    public void display(){
        for(Node node = head; node != null; node = node.next){
            System.out.print(node.data+" ");
        }
        System.out.println();
    }
}
