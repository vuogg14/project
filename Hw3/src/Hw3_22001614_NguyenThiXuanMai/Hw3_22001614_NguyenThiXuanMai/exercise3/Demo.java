package Hw3_22001614_NguyenThiXuanMai.exercise3;

@SuppressWarnings("uncheked")
public class Demo {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();

        // test add
        simpleLinkedList.add(1);
        simpleLinkedList.add(1);
        simpleLinkedList.add(2);
        simpleLinkedList.add(2);
        simpleLinkedList.add(3);
        simpleLinkedList.add(1);
        simpleLinkedList.add(1);
        simpleLinkedList.add(1);

        // test size
        System.out.println("Size của mảng ban đầu là: " + simpleLinkedList.size());

        // test addBot
        System.out.println("Thêm phần tử 0 vào cuối:");
        simpleLinkedList.addBot(0);
        simpleLinkedList.print();

        // test get
        System.out.println("Lấy ra phần tử ở vị trí đầu tiên: ");
        System.out.println(simpleLinkedList.get(0));

        // test set
        System.out.println("Đưa phần tử của mảng đầu tiên về 100:");
        simpleLinkedList.set(0, 100);
        simpleLinkedList.print();

        // test isContain
        System.out.println("Kiểm tra xem có số 0 nào trong mảng không? " + simpleLinkedList.isContain(0));
        System.out.println("Kiểm tra xem có số 7 nào trong mảng không? " + simpleLinkedList.isContain(7));

        // test removeTop
        System.out.println("Remove phần tử đầu tiên:");
        System.out.println(simpleLinkedList.removeTop());
        simpleLinkedList.print();

        // test removeBot
        System.out.println("Remove phần tử cuối:");
        System.out.println(simpleLinkedList.removeBot());
        simpleLinkedList.print();

        // test remove
        System.out.println("Remove số 1 khỏi mảng:");
        simpleLinkedList.remove(1);
        simpleLinkedList.print();
    }
}
