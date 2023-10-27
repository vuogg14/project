package Hw2_22001666_LeMinhVuong.ex1;

public class InsertionSort extends AbsSort{
    public InsertionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        long start = System.currentTimeMillis();
        int count = 0;
        int comparisons = 0;
        for (int i = 1; i < this.getArray().length; ++i) {
            int key = this.getArray()[i];
            int j = i - 1;

            while (j >= 0 && this.getArray()[j] > key) {
                this.getArray()[j + 1] = this.getArray()[j];
                j--;
                this.setComparisons(++comparisons);
                this.setSwaps(++count);
            }
            this.getArray()[j + 1] = key;
            this.setSwaps(++count);
            this.setTimes(System.currentTimeMillis() - start);
//            System.out.println(Arrays.toString(this.getArray())); // in ra các phần tử sau khi thay đổi
        }
    }
}
