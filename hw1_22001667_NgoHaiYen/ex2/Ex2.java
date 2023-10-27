package hw1_19_NgoHaiYen.ex2;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 10000000;
        int[] arr = input(length, sc);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        findPerfectNumber(arr);
        findPrimeNumber(arr);
    }

    public static int[] input(int length, Scanner sc) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public static boolean isPerfectNumber(int n) {
        if (n <= 0) {
            return false;
        }
        int S = 0;
        int tmp = n;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                S += i;
            }
        }
        return S == tmp;
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findPerfectNumber(int[] arr) {
        List<Integer> list = new ArrayList<>();
        System.out.print("Perfect number in array: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPerfectNumber(arr[i])) {
                if (!list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
        System.out.println();
    }

    public static void findPrimeNumber(int[] arr) {
        List<Integer> list = new ArrayList<>();
        System.out.print("Prime number in array: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                if (!list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
        System.out.println();
    }


}
