package Hw3_22001604_DoChiKien.exc9;

public class TestMain {
    public static void main(String[] args) {
        testCase();
    }

    public static void testCase() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(1);
        System.out.println(linkedList);
        System.out.println(linkedList.count(1));
        System.out.println(linkedList.count(4));
    }
}
