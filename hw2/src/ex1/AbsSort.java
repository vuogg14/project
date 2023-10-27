package ex1;

import java.util.Arrays;

public abstract class AbsSort {
    private int comparisons;
    private int swaps;
    private long times;
    private int[] array;

    public AbsSort(int[] array) {
        this.array = array;
    }

    public int getComparisons() {
        return comparisons;
    }

    public int getSwaps() {
        return swaps;
    }

    public long getTimes() {
        return times;
    }

    public int[] getArray() {
        return array;
    }
    public void setArray(int[] array){
        this.array = array;
    }
    public void reset(){
        comparisons = 0;
        swaps = 0;
    }

    public void setComparisons(int comparisons) {
        this.comparisons = comparisons;
    }

    void setSwaps(int swaps) {
        this.swaps = swaps;
    }

    public void setTimes(long times) {
        this.times = times;
    }
    public void print(){
        System.out.println(Arrays.toString(array));
    }

    public abstract void sort();
}
