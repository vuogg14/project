package hw3_22001665_CaoSyNguyenVu.ex11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        Random random = new Random();

        int n = 20;
        for(int i = 0; i < n; i++){
            list1.add(random.nextInt(100));
        }
        System.out.println("List 1: ");
        list1.display();
        if(list1.isPalindrome()){
            System.out.println("this list is palindrome");
        } else {
            System.out.println("this list is not palindrome");
        }
        System.out.println("----------------------------------------");

        MyLinkedList list2 = new MyLinkedList();
        list2.add(2);
        list2.add(3);
        list2.add(1);
        list2.add(3);
        list2.add(2);
        System.out.println("List 2: ");
        list2.display();
        if(list2.isPalindrome()){
            System.out.println("this list is palindrome");
        } else {
            System.out.println("this list is not palindrome");
        }
    }
}
