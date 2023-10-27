package hw3_22001667_NgoHaiYen.ex16;

public class TestMain {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        //Them phan tu vao cuoi danh sach
        list.add(1);
        list.add(3);
        list.add(5);
        list.printList();
        //Chen phan tu vao vi tri index
        list.insert(1,2);
        list.printList();
        //Them phan tu vao danh sach lien ket vong tang dan
        list.addToIncreaseList(4);
        list.printList();
    }
}
