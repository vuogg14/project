package Hw4_22001666_LeMinhVuong.lt3;

import java.util.Stack;

public class DeleteMiddleElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        remove(stack);
        System.out.println(stack);

    }
    public static void remove(Stack<Integer> stack) {
        Stack<Integer> tmp = new Stack<>();
        for (int i = 0; i < stack.size() / 2 + 1; i++) {
            tmp.push(stack.pop());
        }
        stack.pop();

        while (!tmp.isEmpty()){
           stack.push(tmp.pop());
        }
    }
}
