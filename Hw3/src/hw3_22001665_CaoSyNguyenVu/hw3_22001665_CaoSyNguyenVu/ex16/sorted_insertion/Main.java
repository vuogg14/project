package hw3_22001665_CaoSyNguyenVu.ex16.sorted_insertion;

import java.util.Random;

public class Main {
    public static Node add(Node head, int data){
        if(head == null){
            head = new Node(data);
            head.next = head;
            return head;
        }
        Node crr = head;
        Node tail = head;
        while(tail.next!=head){
            tail = tail.next;
        }
        if(crr.data>=data){
            Node tmp = new Node(data);
            tail.next = tmp;
            tmp.next = crr;
            crr = tmp;
            return crr;
        } else if(tail.data<=data){
            Node tmp = new Node(data);
            tail.next = tmp;
            tmp.next = crr;
            return crr;
        } else {
            while(crr.next.data<data){
                crr=crr.next;
            }
            Node tmp = new Node(data);
            tmp.next = crr.next;
            crr.next = tmp;
            return head;
        }
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
        CircularLinkedList linkedList = new CircularLinkedList();
        Random random = new Random();
        linkedList.add(random.nextInt(100));
        for(int i = 0; i<10; i++){
            int a = random.nextInt(100);
            System.out.print("add number: "+a+"\n");
            linkedList.setHead(add(linkedList.getFirstNode(), a));
            print(linkedList.getFirstNode());
            System.out.println();
        }
    }
}
