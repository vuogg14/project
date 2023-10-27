package hw3_22001622_PhamVanNam.ex5.b_21;

import hw3_22001622_PhamVanNam.ex11.ListNode;

import java.util.Scanner;

public class CreateLinkedList {
    public ListNode create() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            a[i] = in.nextInt();
        }
        ListNode[] listNodes = new ListNode[n];
        listNodes[0] = new ListNode(a[0]);
        for (int i = 1; i < n; i++) {
            listNodes[i] = new ListNode(a[i], listNodes[i - 1]);
        }
        return listNodes[n - 1];
    }

    public void print(ListNode node) {
        while (node != null) {
            System.out.print(node.getVal() + " ");
            node = node.next;
        }
    }
}
