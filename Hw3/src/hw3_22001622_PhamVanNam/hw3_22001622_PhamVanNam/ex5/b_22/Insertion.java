package hw3_22001622_PhamVanNam.ex5.b_22;

import hw3_22001622_PhamVanNam.ex11.ListNode;

public class Insertion {
    public static ListNode insertion(int Idx, int val, ListNode node) {
        if (Idx < 0 || Idx > getLength(node)) return node;
        else if (Idx == 0) {
            ListNode prev = new ListNode(val, node);
            node = prev;
            return node;
        }
        ListNode prev = node;
        for (int i = 0; i < Idx - 1; i++) {
            prev = prev.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = prev.next;
        prev.next = newNode;
        return node;
    }

    public static int getLength(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node =node.next;
        }
        return count;
    }
}
