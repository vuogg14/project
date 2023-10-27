package hw3_22001667_NgoHaiYen.ex2;


import java.util.Iterator;

public class TestMain {
    public static void main(String[] args) {
        SimpleArrayList<Integer> list = new SimpleArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(3);
        printList(list);
        System.out.println("List after remove 3: ");
        printList(list);
        System.out.println("Set element index 2 to 3: ");
        list.set(2,3);
        printList(list);
        System.out.println("List contains 2: "+list.isContain(2));
        System.out.println("List is empty: "+list.isEmpty());
    }
    public static void printList(SimpleArrayList list){
        Iterator iterator = list.iterator();
        //Su dung Iterator de duyet qua cac phan tu trong list
        System.out.print("Use Iterator to print element: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
}
