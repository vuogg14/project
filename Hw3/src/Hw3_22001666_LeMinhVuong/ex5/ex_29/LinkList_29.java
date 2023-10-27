package Hw3_22001666_LeMinhVuong.ex5.ex_29;

public class LinkList_29 {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head = null;
    private int size = 0;

    public void add(int data){
        Node current = new Node(data);
        if(head == null){
            head = current;
        } else {
            Node newCurrent = head;
            while (newCurrent.next != null){
                newCurrent = newCurrent.next;
            }
            newCurrent.next = current;
        }
        size++;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index == 0){
            head = head.next;
        } else {
            Node current = head;
            int i = 0;
            while(i < index - 1){
                current = current.next;
                i++;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public void print(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
