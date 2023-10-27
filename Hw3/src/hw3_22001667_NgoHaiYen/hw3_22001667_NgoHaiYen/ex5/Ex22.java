package hw3_22001667_NgoHaiYen.ex5;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhap danh sach
        System.out.print("Enter the number of element: ");
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter element: ");
        for ( int i = 0; i < n; i++ ){
            list.add(sc.nextInt());
        }
        System.out.println("Print list: "+list);
        //Chen gia tri x vao vi tri k trong danh sach
        System.out.print("Enter the index: ");
        int k = sc.nextInt();
        System.out.print("Enter the value: ");
        int x = sc.nextInt();
        list.add(k,x);
        System.out.println("Print list: "+list);

    }
}
