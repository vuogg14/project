package ex1;

import java.util.Arrays;

public class QuickSort extends AbsSort {
    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        setSwaps(quickSort(this.getArray(), 0, getArray().length - 1));
    }

    private int quickSort(int[] arr, int low, int high) {
        long start = System.currentTimeMillis();
        int swaps = 0;
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            swaps += pivotIndex - low; // Đếm số lần đổi chỗ ở nửa trái của pivot
            swaps += high - pivotIndex; // Đếm số lần đổi chỗ ở nửa phải của pivot

            swaps += quickSort(arr, low, pivotIndex - 1); // Sắp xếp nửa trái của pivot
            swaps += quickSort(arr, pivotIndex + 1, high); // Sắp xếp nửa phải của pivot
        }
        long end = System.currentTimeMillis();
        this.setTimes(end - start);
        return swaps;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }


        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        System.out.println(Arrays.toString(arr));
        return i + 1;
    }
}
