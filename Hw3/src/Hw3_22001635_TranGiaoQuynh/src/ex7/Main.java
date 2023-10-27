package ex7;

import ex5.ex21.Ex21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex7 ex7 = new Ex7();
        System.out.println("enter the elements of linked list: ");
        while (sc.hasNext()){
            ex7.add(sc.nextInt());
            System.out.println("do you want to stop: yes/no");
            String str = sc.next();
            if(str.equals("yes")){
                break;
            }
        }
        System.out.println("the size of linked list : " + ex7.size());
        ex7.print();

    }
}
