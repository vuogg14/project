package Hw2_22001666_LeMinhVuong.ex5;

import java.util.Arrays;
import java.util.Random;

public class SortNoIncreasing {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(sort(a)));

    }

    public static int[] sort(int[] a) {
        int[] arraycopy = Arrays.copyOf(a, a.length);
        for (int i = 0; i < arraycopy.length - 1; i++) {
            for (int j = i + 1; j < arraycopy.length; j++) {
                if (arraycopy[i] < arraycopy[j]) {
                    int tmp = arraycopy[i];
                    arraycopy[i] = arraycopy[j];
                    arraycopy[j] = tmp;
                }
            }
        }
        return arraycopy;
    }
}
