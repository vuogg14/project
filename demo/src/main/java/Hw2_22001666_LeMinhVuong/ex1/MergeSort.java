package Hw2_22001666_LeMinhVuong.ex1;

public class MergeSort extends AbsSort{
    public MergeSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int[] temp = new int[this.getArray().length];
        this.setSwaps(mergeSort(this.getArray(), temp, 0, temp.length - 1));
    }

    private int mergeSort(int[] arr, int[] temp, int left, int right) {
        long start = System.currentTimeMillis();
        int swaps = 0;
        if (left < right) {
            int middle = (left + right) / 2;

            swaps += mergeSort(this.getArray(), temp, left, middle); // Sắp xếp nửa trái
            swaps += mergeSort(this.getArray(), temp, middle + 1, right); // Sắp xếp nửa phải

            swaps += merge(this.getArray(), temp, left, middle, right); // Trộn hai nửa và đếm số lần đổi vị trí
        }
        long end = System.currentTimeMillis();
        this.setTimes(end - start);
        return swaps;
    }

    private int merge(int[] arr, int[] temp, int left, int middle, int right) {
        int swaps = 0;

        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right) {
            if (this.getArray()[i] <= this.getArray()[j]) {
                temp[k++] = this.getArray()[i++];
            } else {
                temp[k++] = this.getArray()[j++];
                swaps += (middle - i + 1);
//                System.out.println(Arrays.toString(temp)); // in ra các phần tử sau khi thay đổi
            }
        }

        while (i <= middle) {
            temp[k++] = this.getArray()[i++];
//            System.out.println(Arrays.toString(temp)); // in ra các phần tử sau khi thay đổi
        }

        while (j <= right) {
            temp[k++] = this.getArray()[j++];
//            System.out.println(Arrays.toString(temp)); // in ra các phần tử sau khi thay đổi
        }

        for (i = left; i <= right; i++) {
            this.getArray()[i] = temp[i];
        }

        return swaps;
    }
}
