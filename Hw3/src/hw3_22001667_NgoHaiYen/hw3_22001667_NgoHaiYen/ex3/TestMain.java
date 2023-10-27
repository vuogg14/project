package hw3_22001667_NgoHaiYen.ex3;


public class TestMain {
    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList();
        list.addBot(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.print("Print list: ");
        printLinkedList(list);
        System.out.println("List contains 4: "+list.isContain(4));
        System.out.println("List contains 5: "+list.isContain(5));
        list.removeTop();
        list.removeBot();
        System.out.print("List after remove head and tail: ");
        printLinkedList(list);
        list.remove(5);
        System.out.print("List after remove 5: ");
        printLinkedList(list);

    }

    public static void printLinkedList(SimpleLinkedList list){
        for ( int i = 0; i < list.size(); i++ ){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
