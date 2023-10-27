package ex5.ex22;

public class Ex22 {
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

    public void print() throws Exception {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + get(i) + "] ");
        }
        System.out.println();
    }
}
//Nhập vào một số nguyên dương n, tiếp theo là n số nguyên của một dãy số, hãy cài đặt nó vào một danh sách liên kết đơn, tiếp theo nhập số nguyên k (0 ≤ k < n).
//Hãy đưa ra giá trị phần tử ở chỉ số k.