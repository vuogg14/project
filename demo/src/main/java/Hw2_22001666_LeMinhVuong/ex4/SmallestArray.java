package Hw2_22001666_LeMinhVuong.ex4;

import java.util.Scanner;

public class SmallestArray {
    public static int smallestArray(int[] array, int n){
        boolean[] check = new boolean[n + 1];

        for(int i : array){
            if(i >= 0 && i <= n){
                check[i] = true;
            }
        }

        for(int i = 0; i <= n; i++){
            if(!check[i]){
                return i;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        System.out.println("Số nhỏ nhất chưa xuất hiện trong dãy là: " + smallestArray(a, n));
    }
}
