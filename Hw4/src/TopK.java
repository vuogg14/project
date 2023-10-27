public class TopK {
    public static int getTopk(int[] a, int k) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a[k - 1];
    }


    public static void main(String[] args) {
        int[] a = {1, 3, 2, 1, 4, 5, 7, 9, 8, 5, 6};
        int k = 1;
        System.out.printf("Phần tử lớn thứ %d là: %d", k, getTopk(a, k));
    }
}