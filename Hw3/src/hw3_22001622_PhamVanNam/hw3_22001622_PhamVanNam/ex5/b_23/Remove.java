package hw3_22001622_PhamVanNam.ex5.b_23;

import hw3_22001622_PhamVanNam.ex11.ListNode;
import hw3_22001622_PhamVanNam.ex5.b_22.Insertion;

public class Remove {
    public static ListNode remove(int Idx, ListNode node) {
        if (Idx < 0 || Idx >= Insertion.getLength(node)) return node;
        else if (Idx == 0) {
            node = node.next;
            return node;
        }
        ListNode prev = node;
        for (int i = 0; i < Idx - 1; i++) {
            prev = prev.next;
        }
        ListNode cur = prev.next;
        prev.next = cur.next;
        return node;
    }
}
