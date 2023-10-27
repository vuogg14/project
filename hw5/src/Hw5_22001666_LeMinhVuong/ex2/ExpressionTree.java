package Hw5_22001666_LeMinhVuong.ex2;

import java.util.ArrayList;
import java.util.Stack;

public class ExpressionTree<E> extends LinkedBinaryTree {
    ArrayList<String> exp = new ArrayList<>();

    public void preorderPrint(Node<E> p) {
        if (p == null) {
            return;
        }
        System.out.print(p.element + " ");
        preorderPrint(p.left);
        preorderPrint(p.right);
    }

    public void postorderPrint(Node<E> p) {
        if (p == null) {
            return;
        }
        postorderPrint(p.left);
        postorderPrint(p.right);
        exp.add((String) p.element);
        System.out.print(p.element + " ");
    }

    public void inorderPrint(Node<E> p) {
        if (p == null) {
            return;
        }
        inorderPrint(p.left);
        System.out.print(p.element + " ");
        inorderPrint(p.right);
    }

    public int calculate() {
        Stack<Integer> stack = new Stack<>();
        int post = 0;
        for (String element : exp) {
            switch (element) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    post = stack.pop();
                    stack.push(stack.pop() - post);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    post = stack.pop();
                    stack.push(stack.pop() / post);
                    break;
                default:
                    stack.push(Integer.parseInt(element));
            }
        }
        return stack.peek();
    }
}
