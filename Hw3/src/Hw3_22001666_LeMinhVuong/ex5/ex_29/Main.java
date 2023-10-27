package Hw3_22001666_LeMinhVuong.ex5.ex_29;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkList_29 list = new LinkList_29();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int number = in.nextInt();
            list.add(number);
        }
        int k = in.nextInt();

        list.remove(k);
        list.print();
    }
}
