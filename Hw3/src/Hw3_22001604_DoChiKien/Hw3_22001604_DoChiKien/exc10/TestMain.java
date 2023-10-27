package Hw3_22001604_DoChiKien.exc10;

public class TestMain {
    public static void main(String[] args) {
        testCase();
    }

    public static void testCase() {
        LinkedList linkedList = new LinkedList();
        for (int num = 0; num <= 10; num++) {
            linkedList.add(num);
        }
        System.out.println(linkedList);
        linkedList.reverse();
        System.out.println(linkedList);
    }
}
