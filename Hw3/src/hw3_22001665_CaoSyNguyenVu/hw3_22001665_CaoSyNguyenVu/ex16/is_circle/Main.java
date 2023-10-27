package hw3_22001665_CaoSyNguyenVu.ex16.is_circle;


import java.util.Random;

public class Main {
    public static boolean isCircularLinkedList(Node node){
//        This method is for the case where the last node point to the first node.
//        Node crr = node.next;
//        while(crr != null){
//            crr = crr.next;
//            if(crr==null) return true;
//        }
//        return false;

        //this method is for the case where the last node may not point to the first node
        Node slow = node;
        Node fast = node;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Random random = new Random();
        CircularLinkedList linkedList = new CircularLinkedList();
        System.out.println("List1: ");
        for(int i = 0; i<10; i++){
            int a = random.nextInt(100);
            linkedList.add(a);
            System.out.print(a+" ");
        }
        System.out.println("\nList1 is a circular linked list: "+isCircularLinkedList(linkedList.getFirstNode())+"\n");

        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        System.out.println("List2: ");
        for(int i = 0; i<10; i++){
            int a = random.nextInt(100);
            linkedList.add(a);
            System.out.print(a+" ");
        }
        System.out.println("\nList2 is a circular linked list: "+isCircularLinkedList(linkedList1.getFirstNode()));
    }
}
