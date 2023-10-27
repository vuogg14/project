package Hw2_22001666_LeMinhVuong.ex1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("NHẬP SỐ LƯỢNG PHẦN TỬ: ");
        int[] a = new int[in.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt((int) 1e6);
        }


        AbsSort bubble = new BubbleSort(Arrays.copyOf(a, a.length));
        bubble.sort();
        bubble.print();
        System.out.println(bubble.getSwaps());
        System.out.println(bubble.getComparisons());
        System.out.println(bubble.getTimes());
        bubble.reset();

        AbsSort selection = new SelectionSort(Arrays.copyOf(a, a.length));
        selection.sort();
        selection.print();
        System.out.println(selection.getSwaps());
        System.out.println(selection.getComparisons());
        System.out.println(selection.getTimes());

        AbsSort insertion = new InsertionSort(Arrays.copyOf(a, a.length));
        insertion.sort();
        selection.print();
        System.out.println(insertion.getSwaps());
        System.out.println(insertion.getComparisons());
        System.out.println(insertion.getTimes());

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
