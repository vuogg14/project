package hw3_22001665_CaoSyNguyenVu.ex2;

import java.util.Random;

public class Main {
    public static <T> void testGetData(SimpleArrayList<T> list, int pos) {
        System.out.println("--------------------------------------------");
        System.out.println("Element " + pos + ": " + list.get(pos));
    }
    public static <T> void testSetData(SimpleArrayList<T> list, int pos, T data){
        System.out.println("--------------------------------------------");
        System.out.print("Set "+data+" at "+pos+": ");
        list.set(pos, data);
        System.out.println("\n"+list);
    }
    public static <T> void testDeleteData(SimpleArrayList<T> list, T data){
        System.out.println("--------------------------------------------");
        System.out.println("Remove "+data+": ");
        System.out.println(list);
    }

    public static <T> void testContain(SimpleArrayList<T> list, T data){
        System.out.println("--------------------------------------------");
        if(list.isContain(data)){
            System.out.println("The list contains "+data);
        } else {
            System.out.println("The list doesn't contain "+data);
        }
    }

    public static <T> void testEmpty(SimpleArrayList<T> list){
        System.out.println("--------------------------------------------");
        if(list.isEmpty()){
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }
    }

    public static void main(String[] args) {
        SimpleArrayList<Integer> list = new SimpleArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("List:\n" + list);
        testGetData(list, random.nextInt(30));
        testSetData(list, random.nextInt(30), random.nextInt(100));
        testDeleteData(list, random.nextInt(100));
        testContain(list, random.nextInt(100));
        testEmpty(list);
    }
}
