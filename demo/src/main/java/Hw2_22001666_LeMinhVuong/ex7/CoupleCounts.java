package Hw2_22001666_LeMinhVuong.ex7;

import java.util.Scanner;

public class CoupleCounts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(count(a, target));
    }

    public static int count(int[] arr, int target) {
        int countCouple = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] + arr[i] == target) {
                    countCouple++;
                }
            }
        }
        return countCouple;
    }
}
