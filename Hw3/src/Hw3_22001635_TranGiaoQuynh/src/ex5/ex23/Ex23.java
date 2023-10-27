package ex5.ex23;

import ex5.ex22.Ex22;

public class Ex23 {
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

    public void remove(int i) throws Exception {
        if (i < 0 || i > n-1){
            throw new Exception();
        } else {

            if(i==0) {
                Node node = new Node();
                node = top;
                top = node.next;
                n--;
            } else if (i == n-1) {
                Node node1 = top;
                for (int j = 0; j < n; j++) {
                    node1 = node1.next;
                }
                bot = node1;
            } else {
                Node node = new Node();
                node = top;
                int count = 0;
                while (count < n) {
                    if (i == count) {
                        node.next = node.next.next;
                        n--;
                        break;
                    }
                    count++;
                }
            }
        }
    }

    public void print() throws Exception {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + get(i) + "] ");
        }
        System.out.println();
    }
}
//Nhập vào một số nguyên dương n, tiếp theo là n số nguyên của một dãy số, hãy cài đặt nó vào một danh sách liên kết đơn. Tiếp theo cho một số nguyên k, (0 ≤ k < n), hãy xóa phần tử ở chỉ số k và in ra màn hình danh sách đó, sau một phần tử có một khoảng trắng.