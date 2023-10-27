package Hw3_22001604_DoChiKien.exc11;

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

    public boolean isPalindrome() {
        ListNode slow = head, fast = head, temp, prev;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        slow = prev;
        fast = head;
        while (slow != null) {
            if (slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
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
