package Hw3_22001604_DoChiKien.exc12;

public class LinkedList {
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode head = null;
    private ListNode tail = null;
    private int n = 0;

    public void add(int val) {
        if (n == 0) {
            head = new ListNode(val);
            tail = head;
        } else {
            ListNode node = new ListNode(val);
            tail.next = node;
            tail = node;
        }
        n++;
    }

    public void deleteDuplicates() {
        if (head == null) {
            return;
        }
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder myStr = new StringBuilder();
        ListNode node = head;
        while (node != null) {
            myStr.append(node.val).append(" ");
            node = node.next;
        }
        return myStr.toString();
    }
}
