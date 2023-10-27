package hw1_22001604_DoChiKien.exc2;

public class ArrayGeneric<T> {
    private T[] array;

    public ArrayGeneric(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T getElemnt(int idx) throws Exception {
        if (idx < 0 || idx >= size()) {
            throw new Exception("Error!");
        }
        return array[idx];
    }

    public int size() {
        return array.length;
    }
}
