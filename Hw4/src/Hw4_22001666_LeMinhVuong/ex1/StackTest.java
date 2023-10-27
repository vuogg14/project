package Hw4_22001666_LeMinhVuong.ex1;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        String hoten = in.next();
        for(int i = 0; i < hoten.length(); i++){
            if(i % 2 == 0){
                stack.push(hoten.charAt(i));
            }
            if(i % 3 == 0){
                stack.pop();
            }
        }
        System.out.println(stack);
    }
}
