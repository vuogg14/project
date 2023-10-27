package hw1_22001665_CaoSyNguyenVu.ex_2;

public class Array <T>{
    private T[] arr;

    public Array(T[] arr){
        this.arr = arr;
    }
    public T get(int index){
        if(index<0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }

    public void set(int index, T data){
        if(index<0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException();
        } else {
            arr[index] = data;
        }
    }

    public int size(){
        return arr.length;
    }

    public T[] getArray(){
        return arr;
    }

}
