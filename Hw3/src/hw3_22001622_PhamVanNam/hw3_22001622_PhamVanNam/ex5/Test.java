package hw3_22001622_PhamVanNam.ex5;

import hw3_22001622_PhamVanNam.ex11.ListNode;
import hw3_22001622_PhamVanNam.ex5.b_21.CreateLinkedList;
import hw3_22001622_PhamVanNam.ex5.b_22.Insertion;
import hw3_22001622_PhamVanNam.ex5.b_23.Remove;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //21
        CreateLinkedList createLinkedList = new CreateLinkedList();
        ListNode node = createLinkedList.create();
        createLinkedList.print(node);
        System.out.println();

        //22
        node = Insertion.insertion(in.nextInt(), in.nextInt(), node);
        createLinkedList.print(node);
        System.out.println();

        //23
        node = Remove.remove(in.nextInt(), node);
        createLinkedList.print(node);
    }
}
