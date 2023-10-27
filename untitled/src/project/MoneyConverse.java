package project;

import java.util.Scanner;

public class MoneyConverse {
    public static int convert2(int[] arr, int M) {
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (M >= arr[i]) {
                int c = M / arr[i];
                count += c;
                M -= c * arr[i];
            }
        }
        if (M > 0) {
            return -1;
        }
        return count;
    }

    public static int convert(int[] arr, int n) {
        int[] money = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= n) {
                money[arr[i]] = 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i >= arr[j]) {
                    if ((money[i] > money[i - arr[j]] + 1 || money[i] == 0) && money[i - arr[j]] != 0) {
                        money[i] = money[i - arr[j]] + 1;
                    }
                }
            }
        }
        return money[n];
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 5, 8, 10, 20, 50, 100, 200, 500};
        System.out.println(convert(a, 18));
//        int[] a = new int[]{1, 2, 5, 8, 10, 11};
//        Scanner in = new Scanner(System.in);
//        System.out.print("Số tiền đưa:");
//        int n = in.nextInt();
//        System.out.print("Số tiền chuẩn: ");
//        int m = in.nextInt();
//        if (n < m && n < 0 && m < 0) {
//            System.out.println("Lỗi");
//        } else {
//            System.out.println(convert(a, n - m) + " tờ");
//        }
    }
}
