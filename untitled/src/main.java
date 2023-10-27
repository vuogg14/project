import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[rd.nextInt(100) + 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(sort(a)));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
