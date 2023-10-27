package Hw3_22001666_LeMinhVuong.ex5.ex_27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkList_27 list = new LinkList_27();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = n; i > 1; i--){
            list.add(i);
        }
        for(int i = 1; i <=n; i++){
            list.add(i);
        }
        list.print();
    }
}
