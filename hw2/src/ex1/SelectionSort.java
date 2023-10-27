package ex1;

import java.util.Arrays;

public class SelectionSort extends AbsSort{
    public SelectionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int comparison = 0;
        int count = 0;
        for (int i = 0; i < this.getArray().length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < this.getArray().length; j++) {
                this.setComparisons(++comparison);
                if (this.getArray()[j] < this.getArray()[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = this.getArray()[min_idx];
            this.getArray()[min_idx] = this.getArray()[i];
            this.getArray()[i] = temp;
            this.setSwaps(++count);
            System.out.println(Arrays.toString(this.getArray()));
        }
    }
}
