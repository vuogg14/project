package hw3_22001665_CaoSyNguyenVu.ex7;

import java.util.Random;

public class Main {
    public static void count(MyLinkedList.Node node){
        int c = 0;
        while(node != null){
            c++;
            node = node.next;
        }
        System.out.println("Length of list: "+c);
    }
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Random random = new Random();
        int n = 20;
        for(int i = 0; i<n; i++){
            list.add(random.nextInt(100));
        }
        count(list.getNode());
    }
}
