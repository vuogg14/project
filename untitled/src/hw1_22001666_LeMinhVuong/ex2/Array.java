package hw1_22001666_LeMinhVuong.ex2;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) throws Exception {
        Random rd = new Random();
        int[] arr = new int[10];
        System.out.print("So hoan hao: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(1000000);
            if (checkPerfectNum(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Số nguyên tố: ");
        for (int i = 0; i < arr.length; i++) {
            if (checkPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------");
        String[] a = new String[]{"Hello", "Name"};
        System.out.println(getElement(a, a.length - 1));
    }

    public static boolean checkPerfectNum(int num) {
        int total = 0;
        if (num <= 1) {
            return false;
        }
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (total == num) {
            return true;
        }
        return false;
    }

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static <T> T getElement(T[] arr, int index) throws Exception {
        if (index < 0 || index >= arr.length) {
            throw new Exception("Err!");
        }
        return arr[index];
    }
}
