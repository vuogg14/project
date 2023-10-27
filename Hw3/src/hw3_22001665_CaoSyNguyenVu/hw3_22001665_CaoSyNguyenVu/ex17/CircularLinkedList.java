package hw3_22001665_CaoSyNguyenVu.ex17;

public class CircularLinkedList {
    Node head, head1, head2, tail;

    public void add(int data) {
        Node tmp = new Node(data);
        if (head == null) {
            head = tmp;
            tail = head;
        } else {
            tail.next = tmp;
            tail = tmp;
        }
        tail.next = head;
    }

    public void display(Node node) {
        Node crr = node;
        if (node != null) {
            do {
                System.out.print(crr.data + " ");
                crr = crr.next;
            } while (crr != node);
        }
        System.out.println();
    }

    void splitList(CircularLinkedList list) {
        Node h = list.head;
        Node h1;
        Node h2;

        h1 = h.next;
        int c = 1;
        while (h1 != h) {
            h1 = h1.next;
            c++;
        }

        h2 = h;
        for(int i = 0; i<Math.round((double) c/2); i++){
            h2 = h2.next;
        }

        Node r1 = h1;
        while (r1.next != h2) r1 = r1.next;
        r1.next = h1;

        Node r2 = h2;
        while (r2.next != h1) r2 = r2.next;
        r2.next = h2;

        list.head1 = h1;
        list.head2 = h2;
    }

    public Node getHead() {
        return head;
    }

    public Node getHead1() {
        return head1;
    }

    public Node getHead2() {
        return head2;
    }
}
