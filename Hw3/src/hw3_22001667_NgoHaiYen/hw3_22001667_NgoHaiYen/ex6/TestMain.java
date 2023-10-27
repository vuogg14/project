package hw3_22001667_NgoHaiYen.ex6;

public class TestMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        //Them phan tu 0 vao dau
        list.addAtHead(0);
        //Them phan tu 2 vao cuoi
        list.addAtTail(2);
        //Them phan tu 1 vao vi tri 1
        list.addAtIndex(1,1);
        System.out.println("Size = "+list.size);
        System.out.print("Print list: ");
        printList(list);
        //Xoa phan tu 1 tai vi tri 1
        System.out.print("Print list:");
        list.deleteAtIndex(1);
        printList(list);
    }
    public static void printList(MyLinkedList list){
        for ( int i = 0; i < list.size; i++ ){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
