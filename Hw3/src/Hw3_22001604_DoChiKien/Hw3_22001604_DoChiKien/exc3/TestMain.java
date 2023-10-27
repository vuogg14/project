package Hw3_22001604_DoChiKien.exc3;

public class TestMain {
    public static void main(String[] args) throws Exception {
        testLinkedList();
    }

    public static void testLinkedList() throws Exception {
        SimpleLinkedList<Integer> linkedList = new SimpleLinkedList<>();
        System.out.println(linkedList.isEmpty());
        linkedList.add(1);
        linkedList.addBot(2);
        linkedList.add(3);
        linkedList.addBot(4);
        System.out.println(linkedList);
        System.out.println(linkedList.isContain(2));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.size());
        System.out.println(linkedList.removeTop());
        System.out.println(linkedList);
        System.out.println(linkedList.removeBot());
        System.out.println(linkedList);
        linkedList.set(0, 12);
        System.out.println(linkedList);
    }
}
