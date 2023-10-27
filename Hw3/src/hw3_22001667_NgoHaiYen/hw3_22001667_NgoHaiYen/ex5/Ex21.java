package hw3_22001667_NgoHaiYen.ex5;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element: ");
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter element: ");
        for ( int i = 0; i < n; i++ ){
            list.add(sc.nextInt());
        }
        System.out.println("Print list: ");
        for ( int i = 0; i < list.size(); i++ ){
            System.out.print(list.get(i)+" ");
        }
    }
}
