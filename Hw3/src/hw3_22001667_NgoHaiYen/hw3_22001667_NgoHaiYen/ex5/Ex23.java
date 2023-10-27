package hw3_22001667_NgoHaiYen.ex5;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex23 {
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
        //Xoa phan tu o vi tri k trong danh sach
        System.out.print("Enter the index: ");
        int k = sc.nextInt();
        list.remove(k);
        System.out.println("Print list: "+list);
    }
}
