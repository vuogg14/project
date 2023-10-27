package Hw3_22001666_LeMinhVuong.ex3;

public class App {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        simpleLinkedList.add(1);
        simpleLinkedList.add(2);
        simpleLinkedList.add("String");
        simpleLinkedList.addBot("haha");
        System.out.println(simpleLinkedList.size());
        simpleLinkedList.print();


        System.out.println(simpleLinkedList.isContain(2));
        System.out.println(simpleLinkedList.get(1));

        simpleLinkedList.remove(2);
        simpleLinkedList.print();


        System.out.println(simpleLinkedList.removeBot());
        System.out.println(simpleLinkedList.removeTop());
        simpleLinkedList.print();
    }
}
