package hw3_22001665_CaoSyNguyenVu.ex12;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);

        System.out.println("List: ");
        list.print(list.getNode());

        System.out.println("List after removing duplicates: ");
        MyLinkedList.Node node = list.deleteDuplicates(list.getNode());
        list.print(node);
    }
}
