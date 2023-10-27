package Hw4_22001666_LeMinhVuong.lt1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class codelearn17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        change(in);
    }

    public static void change(Scanner in) {
        int n = in.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.offer(in.nextInt());
        }
        int k = in.nextInt();
        k = k % n;
        for (int i = 0; i < k; i++) {
            queue.add(queue.poll());
        }
        System.out.println(queue);
    }
}
