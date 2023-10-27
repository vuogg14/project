package Hw4_22001666_LeMinhVuong.ex5;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myString = in.next();
        System.out.println(isPalindrome(myString));
    }

    public static boolean isPalindrome(String myString) {
        String split = myString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < split.length(); i++) {
            stack.push(split.charAt(i));
            queue.add(split.charAt(i));
        }
        for (int i = 0; i < stack.size(); i++) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }
        return true;
    }
}
