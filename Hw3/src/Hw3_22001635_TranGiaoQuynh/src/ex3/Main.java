package ex3;


public class Main {
    public static void main(String[] args) {
        try {
            SimpleLinkedList<String> stringSimpleLinkedList = new SimpleLinkedList<>();
            System.out.println("test addtop: ");
            stringSimpleLinkedList.add("lemon");
            stringSimpleLinkedList.print();
            System.out.println("test empty: " + stringSimpleLinkedList.isEmpty());
            System.out.println("test addbot: ");
            stringSimpleLinkedList.addBot("banana");
            stringSimpleLinkedList.addBot("grape");
            stringSimpleLinkedList.addBot("kiwi");
            System.out.println("test size: " + stringSimpleLinkedList.size());
            System.out.println("test change orange: " );
            stringSimpleLinkedList.set(1,"orange");
            stringSimpleLinkedList.print();
            System.out.println("test contain orange: " + stringSimpleLinkedList.isContain("orange"));
            System.out.println("test remove bot: " + stringSimpleLinkedList.removeBot() );
            System.out.println("test remove top: " + stringSimpleLinkedList.removeTop() );
            System.out.println("remove orange: " );
            stringSimpleLinkedList.remove("orange");
            System.out.println("...");
            stringSimpleLinkedList.print();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
