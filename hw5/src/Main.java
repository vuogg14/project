import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        System.out.print(countBoBa(a) + " " + tinhChuVi(a));

    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            return false;
        }
        return true;
    }

    public static int countBoBa(int[] a) {
        int count = 0;
        // 1 2 3 4 a.length = 4
        for (int i = 0; i < a.length - 2; i++) {

            // a[i] = 1
            // i = 1
            //a[i] = 2
            // i = 2
            for (int j = i + 1; j < a.length - 1; j++) {
                //j = 1
                //a[j] = 2
                //j = 2
                // a[j] = 3
                // j = 3
                // j = 2
                // a[j] = 3
                // j = 3
                for (int k = j + 1; k < a.length; k++) {
                    // a[k] = 3
                    // a[k] = 4
                    // k = 3
                    // a[k] = 4
                    // k = 3
                    // a[k] = 4

                    if (isTriangle(a[i], a[j], a[k]) == true) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int tinhChuVi(int[] a) {
        //  a = 1 2 3 4
        // có 4 bộ 3 thõa mãn là tam giác
        int[] chuvi = new int[countBoBa(a)];
        // chu vi = [2, 5, 6, 8]
        int index = 0;
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (isTriangle(a[i], a[j], a[k]) == true) {
                        chuvi[index] = a[i] + a[j] + a[k];
                        // chuvi[0] = a[i] + a[j] + a[k]
                        index++;
                    }
                }
            }
        }
        // chu vi = [2, 5, 6, 8]

        int maxChuVi = chuvi[0];
        for (int i = 0; i < chuvi.length; i++) {
            if(maxChuVi < chuvi[i]){
                // 2 < 2
                // 2 < 5
                // 5 < 6
                // 6 < 8
                maxChuVi = chuvi[i];
                // maxCHuVi = 8
            }
        }
        return maxChuVi;
    }
}