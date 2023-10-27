package hw1_22001604_DoChiKien.exc2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exc2 {
    private static List<Integer> array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testCase(scanner);
    }

    public static void testCase(Scanner scanner) {
        inputData(scanner);
        System.out.println(array);
        System.out.print("Prime number: ");
        printPrimeNums();
        System.out.println(smallestSubarrayLength(scanner));
    }

    public static void inputData(Scanner scanner) {
        Random random = new Random();
        array = new LinkedList<>();
        System.out.print("Enter the number of number you want to work with:");
        long n = scanner.nextLong();
        for (int idx = 0; idx < n; idx++) {
            int val = random.nextInt(0,100000);
            array.add(val);
        }
    }

    public static void printPrimeNums() {
        for (int num : array) {
            if (checkPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static boolean checkPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Find the smallest length of a subarray from the main array whose sum of its element is larger or equal to a given sum
    public static int smallestSubarrayLength(Scanner scanner) {
        System.out.print("Enter your target sum: ");
        int targetSum = scanner.nextInt();
        int leftPointer = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int rightPointer = 0; rightPointer < array.size(); rightPointer++) {
            sum += array.get(rightPointer);
            while (sum >= targetSum) {
                min = Math.min(min, rightPointer - leftPointer + 1);
                sum -= array.get(leftPointer);
                leftPointer++;
            }
        }
        return min;
    }
}
