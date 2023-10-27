package hw3_22001667_NgoHaiYen.ex5;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex25 {
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
        //Thay doi gia tri cua phan tu co gia tri a thanh gia tri b
        System.out.print("Enter the value: ");
        int a = sc.nextInt();
        System.out.print("Enter the new value: ");
        int b = sc.nextInt();
        for ( int i = 0; i < list.size(); i++ ){
            if ( list.get(i) == a ){
                list.set(i,b);
            }
        }
        System.out.println("Print list: "+list);
    }
}
