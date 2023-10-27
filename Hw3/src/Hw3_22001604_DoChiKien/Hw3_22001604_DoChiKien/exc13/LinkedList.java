package Hw3_22001604_DoChiKien.exc13;

public class LinkedList {
    static class Node {
        int coeff;
        int pow;
        Node next;

        public Node(int coeff, int pow) {
            this.coeff = coeff;
            this.pow = pow;
            this.next = null;
        }

        @Override
        public String toString() {
            return pow == 0 ? String.valueOf(coeff) : coeff + "x^" + pow;
        }
    }

    private Node head;
    private Node tail;
    private int n;

    public Node getHead() {
        return head;
    }

    public void add(int coeff, int pow) {
        if (coeff != 0) {
            if (n == 0) {
                head = new Node(coeff, pow);
                tail = head;
            } else {
                Node node = new Node(coeff, pow);
                tail.next = node;
                tail = node;
            }
            n++;
        }
    }

    public LinkedList addPolynomial(LinkedList p1, LinkedList p2) {
        LinkedList ans = new LinkedList();
        Node head1 = p1.head;
        Node head2 = p2.head;
        while (head1 != null && head2 != null) {
            if (head1.pow == head2.pow) {
                ans.add(head1.coeff + head2.coeff, head1.pow);
                head1 = head1.next;
                head2 = head2.next;
            } else if (head1.pow > head2.pow) {
                ans.add(head1.coeff, head1.pow);
                head1 = head1.next;
            } else {
                ans.add(head2.coeff, head2.pow);
                head2 = head2.next;
            }
        }
        while (head1 != null) {
            ans.add(head1.coeff, head1.pow);
            head1 = head1.next;
        }
        while (head2 != null) {
            ans.add(head2.coeff, head2.pow);
            head2 = head2.next;
        }
        return ans;
    }

    public Node addPolynomial(Node p1, Node p2) {
        Node node = new Node(0, 0);
        Node ans = node;
        while (p1 != null && p2 != null) {
            if (p1.pow == p2.pow) {
                node.next = new Node(p1.coeff + p2.coeff, p1.pow);
                node = node.next;
                p1 = p1.next;
                p2 = p2.next;
            } else if (p1.pow > p2.pow) {
                node.next = new Node(p1.coeff, p1.pow);
                node = node.next;
                p1 = p1.next;
            } else {
                node.next = new Node(p2.coeff, p2.pow);
                node = node.next;
                p2 = p2.next;
            }
        }
        while (p1 != null) {
            node.next = p1;
            node = node.next;
            p1 = p1.next;
        }
        while (p2 != null) {
            node.next = p2;
            node = node.next;
            p2 = p2.next;
        }
        node.next = null;
        return ans.next;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node node = head;
        while (node != null) {
            str.append(node);
            if (node.next != null) {
                str.append(" + ");
            }
            node = node.next;
        }
        return str.toString();
    }
}
