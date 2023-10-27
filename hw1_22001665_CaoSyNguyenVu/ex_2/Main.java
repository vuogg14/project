package hw1_22001665_CaoSyNguyenVu.ex_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void printPrimes(int[] arr) {
        for (int i : arr) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printLongestIncreasingNumberSeries(int[] a) {
        int n = a.length;
        int maxLength = 1;
        int[] lengths = new int[n];
        lengths[0] = 1;
        int pos = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                lengths[i] = lengths[i - 1] + 1;
                if (i == n - 1 && lengths[i] > maxLength) {
                    pos = i;
                    maxLength = lengths[i];
                }
            } else {
                lengths[i] = 1;
                if (maxLength < lengths[i - 1]) {
                    pos = i - 1;
                    maxLength = lengths[i - 1];
                }
            }
        }
        System.out.print("Day tang dai nhat: ");
        for (int i = pos - maxLength + 1; i <= pos; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Nhap so luong phan tu: ");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(0, 10000);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n----------------------------");

        System.out.print("Prime number series: ");
        printPrimes(a);
        System.out.println();
        printLongestIncreasingNumberSeries(a);
        System.out.println("\n----------------------");

        Double[] data = {3.2, 5.9, 3.9, 1.9};
        String[] data1 = {"string 1","string 2","string 3","string 4"};
        Character[] data2 = {'a','d','g','a'};

        System.out.println("Test data type: double");
        Array<Double> array = new Array<>(data);
        System.out.println(Arrays.toString(array.getArray()));
        array.set(2,5.3);
        System.out.println("set data at 2");
        System.out.println(Arrays.toString(array.getArray()));
        System.out.println("-------------------------");

        System.out.println("Test data type: string");
        Array<String> array1 = new Array<>(data1);
        System.out.println(Arrays.toString(array1.getArray()));
        array1.set(3,"xin chao");
        System.out.println("set data at 3");
        System.out.println(Arrays.toString(array1.getArray()));
        System.out.println("-------------------------");

        System.out.println("Test data type: character");
        Array<Character> array2 = new Array<>(data2);
        System.out.println(Arrays.toString(array2.getArray()));
        array2.set(1,'v');
        System.out.println("set data at 1");
        System.out.println(Arrays.toString(array2.getArray()));
    }
}
