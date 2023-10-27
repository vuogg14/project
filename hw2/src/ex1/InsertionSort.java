package ex1;

import java.util.Arrays;

public class InsertionSort extends AbsSort{
    public InsertionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
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
            System.out.println(Arrays.toString(this.getArray()));
        }
    }
}
