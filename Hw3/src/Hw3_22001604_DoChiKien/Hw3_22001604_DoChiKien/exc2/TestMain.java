package Hw3_22001604_DoChiKien.exc2;

import java.util.Iterator;

public class TestMain {
    public static void main(String[] args) throws Exception {
        testArrayList();
    }

    public static void testArrayList() throws Exception {
        ListInterface<Integer> arrayList = new SimpleArrayList<>();
        Iterator<Integer> iterator = arrayList.iterator();
        System.out.println(arrayList.isEmpty());
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(6);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.isContain(1));
        arrayList.remove(1);
        System.out.println(arrayList.isContain(1));
        System.out.println(arrayList.size());
        arrayList.set(0, 12);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
