package hw3_22001665_CaoSyNguyenVu.ex5.codelearn27;

import java.util.Scanner;

public class Main {
    public static void solve(DoublyLinkedList list, int n){
        for(int i = 2; i<=n; i++){
            list.addHead(i);
            list.addTail(i);
        }
        list.display();
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(1);
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        solve(list, n);
    }
}
