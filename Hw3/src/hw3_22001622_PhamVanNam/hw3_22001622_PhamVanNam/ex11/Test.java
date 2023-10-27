package hw3_22001622_PhamVanNam.ex11;

import hw3_22001622_PhamVanNam.ex5.b_21.CreateLinkedList;

public class Test {
    public static void main(String[] args) {
//        4
//        1 2 2 1
//
//        2
//        1 2
        CreateLinkedList createLinkedList = new CreateLinkedList();
        CheckPalindrome check = new CheckPalindrome();
        System.out.println(check.isPalindrome(createLinkedList.create()));
    }
}
