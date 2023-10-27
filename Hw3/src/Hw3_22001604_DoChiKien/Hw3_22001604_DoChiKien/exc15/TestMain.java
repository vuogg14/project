package Hw3_22001604_DoChiKien.exc15;

public class TestMain {
    public static void main(String[] args) {
        testRotate(13);
    }

    public static void testRotate(int k) {
        LinkedList linkedList = new LinkedList();
        for (int value = 1; value <= 10; value++) {
            linkedList.add(value);
        }
        System.out.println(linkedList);
        linkedList.rotate(k);
        System.out.println(linkedList);
    }
}
