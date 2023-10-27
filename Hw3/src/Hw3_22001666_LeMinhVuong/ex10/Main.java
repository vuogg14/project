package Hw3_22001666_LeMinhVuong.ex10;


public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        Node head = new Node(10);
        head.next = new Node(11);
        head.next.next = new Node(20);
        head.next.next.next = new Node(200);

        System.out.println("Danh sách ban đầu: ");
        list.print(head);
        System.out.println("Danh sách đảo ngược: ");
        list.print(list.reverse(head));
    }
}
