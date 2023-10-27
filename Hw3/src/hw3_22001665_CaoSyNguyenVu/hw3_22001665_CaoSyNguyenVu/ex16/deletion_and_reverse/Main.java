package hw3_22001665_CaoSyNguyenVu.ex16.deletion_and_reverse;

import java.util.Random;

public class Main {
    public static Node deleteNode(Node head, int d) {
        Node crr = head;
        while (crr.next != head) {
            if (crr.next.data == d) {
                crr.next = crr.next.next;
            } else {
                crr = crr.next;
                if (crr.next == head && head.data == d) {
                    crr.next = crr.next.next;
                    head = crr.next;
                }
            }
        }
        return head;
    }

    public static Node reverse(Node head) {
        Node crr = head.next;
        Node res = new Node(head.data);
        Node link = res;
        while (crr != head) {
            Node tmp = new Node(crr.data);
            tmp.next = res;
            res = tmp;
            crr = crr.next;
        }
        link.next = res;
        return res;
    }
    public static void print(Node node){
        if(node==null) return;
        if(node.next == null){
            System.out.print(node.data+" ");
            return;
        }
        Node crr = node;
        while(crr.next!=node){
            System.out.print(crr.data+" ");
            crr = crr.next;
            if(crr.next==node){
                System.out.print(crr.data);
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        CircularLinkedList linkedList = new CircularLinkedList();
        linkedList.add(random.nextInt(100));
        for(int i = 0; i<20; i++){
            linkedList.add(random.nextInt(100));
        }
        System.out.println("List: ");
        print(linkedList.getFirstNode());
        System.out.println();

        int deletionNumber = random.nextInt(100);
        System.out.println("delete number: "+deletionNumber);
        linkedList.setHead(deleteNode(linkedList.getFirstNode(), deletionNumber));
        print(linkedList.getFirstNode());
        System.out.println();

        System.out.println("reverse list");
        linkedList.setHead(reverse(linkedList.getFirstNode()));
        print(linkedList.getFirstNode());
    }
}
