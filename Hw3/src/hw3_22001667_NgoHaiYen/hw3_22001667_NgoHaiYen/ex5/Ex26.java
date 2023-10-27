package hw3_22001667_NgoHaiYen.ex5;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhap danh sach
        System.out.print("Enter the number of element: ");
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter element: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Print list: " + list);
        //Xoa di cac phan tu lon hon k
        System.out.print("Enter the index: ");
        int k = sc.nextInt();
        int check = list.get(k);
        //Su dung list moi de luu cac phan tu be hon k
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i) <= check ){
               newList.add(list.get(i));
            }
        }
        list = newList;
        System.out.println("Print list: "+list);
    }
}
