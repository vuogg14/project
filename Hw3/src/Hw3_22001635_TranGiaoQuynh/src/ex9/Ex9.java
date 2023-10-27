package ex9;

import ex8.Ex8;

public class Ex9 {
    class Node {
        int data;
        Node next;
    }

    private Node bot = null;
    private Node top = null;
    private int n = 0;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        if (bot != null) {
            bot.next = node;
            bot = bot.next;
            n++;
        } else {
            node.next = top;
            top = node;
            bot = top;
            n++;
        }
    }

    public int get(int i) throws Exception {
        if (i < 0 || i > n) {
            throw new Exception();

        } else {
            Node node = new Node();
            node = top;
            for (int j = 0; j < i; j++) {
                node = node.next;
            }
            return node.data;
        }
    }
    public int size(){
        return n;
    }
    public void print() throws Exception {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + get(i) + "] ");
        }
        System.out.println();
    }
}
