package Hw2_22001666_LeMinhVuong.ex1;

public class BubbleSort extends AbsSort {

    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int c = 0;
        int comparisons = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < this.getArray().length - 1; i++) {
            for (int j = i + 1; j < this.getArray().length; j++) {
                this.setComparisons(++comparisons);
                if (this.getArray()[i] > this.getArray()[j]) {
                    this.setSwaps(++c);
                    int tmp = this.getArray()[i];
                    this.getArray()[i] = this.getArray()[j];
                    this.getArray()[j] = tmp;
                }
            }
//            System.out.println(Arrays.toString(this.getArray()));  // in ra các phần tử sau khi thay đổi
        }
        long end = System.currentTimeMillis();
        this.setTimes(end - start);

    }
}
