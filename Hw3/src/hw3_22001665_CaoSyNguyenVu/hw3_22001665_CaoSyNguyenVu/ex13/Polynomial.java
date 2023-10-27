package hw3_22001665_CaoSyNguyenVu.ex13;

public class Polynomial {
    class Node {
        int coeff;
        int pow;
        Node next;

        Node(int a, int b) {
            coeff = a;
            pow = b;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Polynomial() {
        size = 0;
    }

    public void add(int a, int b) {
        Node tmp = new Node(a, b);
        if (head == null) {
            head = tmp;
            tail = head;
        } else {
            tail.next = tmp;
            tail = tmp;
        }
    }

    public int size() {
        return size;
    }

    public Node addPolynomial(Node p1, Node p2) {
        Node t1 = p1;
        Node t2 = p2;
        Node res = new Node(1, 1);
        Node run = res;
        while (t1 != null && t2 != null) {
            if (t1.pow > t2.pow) {
                run.next = new Node(t1.coeff, t1.pow);
                t1 = t1.next;
                run = run.next;
            } else if (t1.pow < t2.pow) {
                run.next = new Node(t2.coeff, t2.pow);
                t2 = t2.next;
                run = run.next;
            } else {
                run.next = new Node(t2.coeff + t1.coeff, t1.pow);
                t1 = t1.next;
                t2 = t2.next;
                run = run.next;
            }
        }
        while (t1 != null) {
            run.next = new Node(t1.coeff, t1.pow);
            t1 = t1.next;
            run = run.next;
        }
        while (t2 != null) {
            run.next = new Node(t2.coeff, t2.pow);
            t2 = t2.next;
            run = run.next;
        }
        return res.next;
    }

    public void printPolynomial(Node node) {
        for (Node n = node; n != null; n = n.next) {
            System.out.print(n.coeff + "x^" + n.pow);
            if (n.next != null) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
    public Node getNode(){
        return head;
    }
}
