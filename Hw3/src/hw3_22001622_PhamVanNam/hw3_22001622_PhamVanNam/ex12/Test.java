package hw3_22001622_PhamVanNam.ex12;

import hw3_22001622_PhamVanNam.ex5.b_21.CreateLinkedList;

public class Test {
    public static void main(String[] args) {
//        6
//        1 2 2 3 3 5
        CreateLinkedList createLinkedList = new CreateLinkedList();
        createLinkedList.print(DeleteDuplicate.deleteDuplicates(createLinkedList.create()));
    }
}
