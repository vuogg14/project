package Hw3_22001604_DoChiKien.exc8;


public class TestMain {
    public static void main(String[] args) {
        testCase();
    }

    public static void testCase() {
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i <= 9; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
        System.out.println(linkedList.getNthFromLast(2));
    }
}
