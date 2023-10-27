package Hw4_22001666_LeMinhVuong.ex3;

import java.util.Scanner;
import java.util.Stack;

public class Calculate {
    public static boolean validity(String myString) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == '(' || myString.charAt(i) == '[' || myString.charAt(i) == '{') {
                s.push(myString.charAt(i));
            } else if (myString.charAt(i) == ')' || myString.charAt(i) == ']' || myString.charAt(i) == '}') {
                if (s.isEmpty()) {
                    return false;
                }

                char check = s.pop();
                if (!((check == '(' && myString.charAt(i) == ')')
                        || (check == '[' && myString.charAt(i) == ']')
                        || (check == '{' && myString.charAt(i) == '}'))) {
                    return false;
                }
            }
        }
        return s.size() == 0;
    }

    public static double calculate(String myString) throws Exception {
        if(!validity(myString)){
            throw new Exception("Err!");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String calculateString = in.next();
        System.out.println();
    }
}
