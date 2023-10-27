package ex1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(1000);
        }


        AbsSort bubble = new BubbleSort(Arrays.copyOf(a, a.length));
        bubble.sort();
        bubble.print();
        System.out.println(bubble.getSwaps());
        System.out.println(bubble.getComparisons());
        System.out.println(bubble.getTimes());

        AbsSort selection = new SelectionSort(Arrays.copyOf(a, a.length));
        selection.sort();
        selection.print();
        System.out.println(selection.getSwaps());
        System.out.println(selection.getComparisons());
        System.out.println(selection.getTimes());

        AbsSort merge = new MergeSort(Arrays.copyOf(a, a.length));
        merge.sort();
        merge.print();
        System.out.println(merge.getSwaps());
        System.out.println(merge.getTimes());

        AbsSort quick = new QuickSort(Arrays.copyOf(a, a.length));
        quick.sort();
        quick.print();
        System.out.println(quick.getSwaps());
        System.out.println(quick.getTimes());
    }
}
