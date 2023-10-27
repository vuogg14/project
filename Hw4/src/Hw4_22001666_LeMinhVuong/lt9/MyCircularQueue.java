package Hw4_22001666_LeMinhVuong.lt9;

public class MyCircularQueue {
    private int[] queue;
    private int size;
    private int length;
    private int next;
    private int prev;

    public MyCircularQueue(int k) {
        queue = new int[k];
        size = 0;
        length = k;
        next = 0;
        prev = -1;
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        prev = prev + 1;
        queue[prev] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        next = next + 1;
        size--;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return queue[next];
    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return queue[prev];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == length;
    }
}
