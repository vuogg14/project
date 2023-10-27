package hw3_22001622_PhamVanNam.ex12;

import hw3_22001622_PhamVanNam.ex11.ListNode;

public class DeleteDuplicate {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = head;
        while (node != null) {
            if (node.next == null) {
                return head;
            }
            while (node.next.getVal() == node.getVal() && node.next != null) {
                ListNode next = node.next;
                node.next = next.next;
            }
            node = node.next;
        }
        return head;
    }
}
