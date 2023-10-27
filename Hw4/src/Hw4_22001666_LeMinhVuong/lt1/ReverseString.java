package Hw4_22001666_LeMinhVuong.lt1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(reverseStack(input));
    }

    public static String reverseStack(String input){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
