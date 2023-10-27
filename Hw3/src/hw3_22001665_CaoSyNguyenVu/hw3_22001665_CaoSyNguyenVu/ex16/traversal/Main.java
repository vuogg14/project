package hw3_22001665_CaoSyNguyenVu.ex16.traversal;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void print(CircularLinkedList.Node node){
        CircularLinkedList.Node crr = node;
        while(crr.next!=node){
            System.out.print(crr.data+" ");
            crr = crr.next;
            if(crr.next==node){
                System.out.print(crr.data);
            }
        }
    }
    public static void main(String[] args) {
        CircularLinkedList linkedList = new CircularLinkedList();
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the length of list: ");
        int n = s.nextInt();
        for(int i = 0; i<n; i++){
            linkedList.add(random.nextInt(100));
        }
        print(linkedList.getFirstNode());
    }
}
